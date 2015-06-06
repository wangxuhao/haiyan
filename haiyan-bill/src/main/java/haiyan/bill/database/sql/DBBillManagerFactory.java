package haiyan.bill.database.sql;

import haiyan.bill.database.DBBill;
import haiyan.common.StringUtil;
import haiyan.common.exception.Warning;
import haiyan.common.intf.config.IBillConfig;
import haiyan.common.intf.config.IBillTable;
import haiyan.common.intf.database.IDBBill;
import haiyan.common.intf.database.IDBFilter;
import haiyan.common.intf.database.bill.IDBBillManager;
import haiyan.common.intf.database.orm.IDBRecord;
import haiyan.common.intf.database.orm.IDBResultSet;
import haiyan.common.intf.factory.IFactory;
import haiyan.common.intf.session.IContext;
import haiyan.config.castorgen.Bill;
import haiyan.config.castorgen.BillID;
import haiyan.config.castorgen.BillTable;
import haiyan.config.castorgen.Table;
import haiyan.config.castorgen.types.AbstractCommonFieldJavaTypeType;
import haiyan.config.intf.session.ITableDBContext;
import haiyan.config.util.ConfigUtil;
import haiyan.orm.database.DBPage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DBBillManagerFactory implements IFactory {

	private DBBillManagerFactory() {
	}
	private static class SQLDBBillManager implements IDBBillManager {
		private ITableDBContext context;
		protected SQLDBBillManager(IContext context) {
			this.context = (ITableDBContext)context;
		}
		@Override
		public void openTransaction() throws Throwable {
			this.context.openTransaction();
		}
		@Override
		public void closeTransaction() throws Throwable {
			this.context.closeTransaction();
		}
		@Override
		public void setAutoCommit(boolean b) throws Throwable {
			this.context.setAutoCommit(b);
		}
		@Override
		public void commit() throws Throwable {
			this.context.commit();
		}
		@Override
		public void rollback() throws Throwable {
			this.context.rollback();
		}
		@Override
		public String getDSN() {
			return this.context.getDSN();
		}
		@Override
		public Boolean isAlive() {
			return context.isAlive();
		}
		@Override
		public void clear() {
			this.context.clear();
		}
		@Override
		public void close() {
			this.context.close();
		}
		@Override
		public IDBBill createBill(IBillConfig billConfig) {
			IDBBill bill = new DBBill(this.context.getUser(), billConfig);
			return bill;
		} 
		@Override
		public Object createBillID(IDBBill bill) throws Throwable {
			if (!StringUtil.isEmpty(bill.getBillID()))
				return bill.getBillID();
			IDBResultSet[] resultSets = bill.getResultSets();
			Bill billConfig = (Bill)bill.getBillConfig();
			Table mainTable = ConfigUtil.getMainTable(billConfig);
			{
				if (mainTable.getId().getJavaType()==AbstractCommonFieldJavaTypeType.STRING) {
					String billID = DBBillAutoNumber.requestShortID(this.context, mainTable, 1);
					bill.setBillID(billID);
				} else {
					BigDecimal billID = DBBillAutoNumber.requestID(this.context, mainTable, 1);
					bill.setBillID(billID);
				}
			}
			for (int i=0;i<resultSets.length;i++) {
				IDBResultSet rst = resultSets[i];
				Iterator<IDBRecord> iter = rst.getRecords().iterator(); 
				while(iter.hasNext()) {
					IDBRecord record = iter.next();
					BillID billID = billConfig.getBillID(i);
					Object recordbillIDVal = record.get(billID.getDbName());
					if (!StringUtil.isEmpty(recordbillIDVal) && !recordbillIDVal.equals(bill.getBillID()))
						throw new Warning("BillID exists when createBillByID:"+bill.getBillID());
					record.set(billID.getDbName(), bill.getBillID()); // 单据外键
				}
			}
			return bill.getBillID();
		}
		@Override
		public void loadBill(IDBBill bill) throws Throwable {
			IDBResultSet[] resultSets = bill.getResultSets();
			IDBFilter[] filters = bill.getFilters();
			Bill billConfig = (Bill)bill.getBillConfig();
			int mainTableIndex = ConfigUtil.getMainTableIndex(billConfig);
			BillTable[] billTables = billConfig.getBillTable();
			for (int i=0;i<billTables.length;i++) {
				BillTable billTable = billTables[i];
				Table table = ConfigUtil.getTable(billTable.getDbName());
				resultSets[i] = context.getDBM().select(context, table, filters[i], DBPage.MAXCOUNTPERQUERY, 1);
			}
			BillID billID = billConfig.getBillID(mainTableIndex);
			IDBResultSet mainResult = resultSets[mainTableIndex];
			for (IDBRecord record:mainResult.getRecords()) {
				bill.setBillID(record.get(billID.getDbName()));// 只用第一条记录的billid
				break;
			}
		}
		@Override
		public void saveBill(IDBBill bill) throws Throwable {
			IDBResultSet[] resultSets = bill.getResultSets();
			Bill billConfig = (Bill)bill.getBillConfig();
			BillTable[] billTables = billConfig.getBillTable();
			if (resultSets==null)
				throw new Warning("IDBResultSet lost when saveBill");
			for (int i=0;i<resultSets.length;i++) {
				IDBResultSet rst = resultSets[i];
				BillTable billTable = billTables[i];
				BillID billID = billConfig.getBillID(i);
				Table table = ConfigUtil.getTable(billTable.getDbName());
				List<String> ids = new ArrayList<String>();
				for (IDBRecord record:rst.getRecords()) {
					String id = record.getString(table.getId().getName());
					if (record.getStatus()==IDBRecord.DELETE && !StringUtil.isEmpty(id)) {
						ids.add(id);
					}
				}
				if (ids.size()>0) {
					context.getDBM().delete(context, table, ids.toArray(new String[0]));
				}
				for (IDBRecord record:rst.getRecords()) {
					record.set(billID.getDbName(), bill.getBillID()); // 单据外键
					if (record.getStatus()==IDBRecord.INSERT)
						context.getDBM().insert(context, table, record);
					else
						context.getDBM().update(context, table, record);
				}
			}
		}
		@Override
		public void deleteBill(IDBBill bill) throws Throwable {
			IDBResultSet[] resultSets = bill.getResultSets();
			IBillConfig billConfig = bill.getBillConfig();
			IBillTable[] billTables = billConfig.getBillTable();
			if (resultSets==null)
				throw new Warning("IDBResultSet lost when deleteBill");
			for (int i=0;i<resultSets.length;i++) {
				IDBResultSet rst = resultSets[i];
				IBillTable billTable = billTables[i];
				Table table = ConfigUtil.getTable(billTable.getDbName());
				List<String> ids = new ArrayList<String>();
				for (IDBRecord record:rst.getRecords()) {
					String id = record.getString(table.getId().getName());
					if (record.getStatus()==IDBRecord.DELETE && !StringUtil.isEmpty(id)) {
						ids.add(id);
					}
				}
				if (ids.size()>0) {
					context.getDBM().delete(context, table, ids.toArray(new String[0]));
				}
			}
		}
		@Override
		public void deleteBill(IBillConfig billConfig, String billID) throws Throwable {
			IBillTable[] billTables = billConfig.getBillTable();
			if (billTables==null)
				throw new Warning("BillTable lost when deleteBill");
			if (billID==null)
				throw new Warning("BillID lost when deleteBill");
			for (int i=0;i<billTables.length;i++) {
				IBillTable billTable = billTables[i];
				Table table = ConfigUtil.getTable(billTable.getDbName());
				context.getDBM().delete(context, table, new String[]{billID});
			}
		}
	}
	public static IDBBillManager createBillManager(IContext context)  {
		try {
			return new SQLDBBillManager(context);
		}catch(Throwable ex){
			throw Warning.wrapException(ex);
		}
	}

}
