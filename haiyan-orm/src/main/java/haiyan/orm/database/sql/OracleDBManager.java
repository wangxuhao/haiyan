/*
 * Created on 2004-12-23
 */
package haiyan.orm.database.sql;

import haiyan.common.StringUtil;
import haiyan.common.exception.Warning;
import haiyan.common.intf.database.sql.ISQLDatabase;
import haiyan.config.castorgen.AbstractField;
import haiyan.config.castorgen.Id;
import haiyan.config.castorgen.types.AbstractCommonFieldJavaTypeType;
import haiyan.orm.intf.database.sql.ITableSQLRender;

/**
 * oracle中metatable获取的途径为:
 * 
 * 表信息user_all_tables,all_tables
 * 
 * 列信息user_col_comments,all_tab_columns
 * 
 * 等等
 * 
 * @author zhouxw
 */
public class OracleDBManager extends SQLTableDBManager {
	/**
	 * @param conn
	 * @param notSameConn
	 */
	protected OracleDBManager(ISQLDatabase db) {
		super(db);
	}
	@Override
	public ITableSQLRender getSQLRender() {
		if (sqlRender == null)
			sqlRender = new OracleSQLRender();
		return sqlRender;
	}
	@Override
	public String genFieldName(AbstractField field) {
		return "\"" + field.getName() + "\"";
	}
	@Override
	public String genFieldSQL(AbstractField field) {
		AbstractCommonFieldJavaTypeType fldType = field.getJavaType();
		String generateSQL = this.genFieldName(field) + " " + this.genTypeSQL(field);
		// create field sql
		if (field instanceof Id) {
			// NOTICE 为了动态表字段创建如下:
			// java.sql.SQLException: ORA-01758: 要添加法定 (NOT NULL) 列，则表必须为空
			// generateSQL += " not null";
		} else {
			// Field field = (Field) fld;
			if (field.getDefaultValue() != null) {
				if (fldType == AbstractCommonFieldJavaTypeType.STRING
					|| fldType == AbstractCommonFieldJavaTypeType.DATE) {
					generateSQL += " default '" + field.getDefaultValue() + "'";
				} else {
					if (StringUtil.isBlankOrNull(field.getDefaultValue())) {
						// generateSQL = generateSQL;
					} else {
						generateSQL += " default " + field.getDefaultValue();
					}
				}
			} else {
				if (fldType == AbstractCommonFieldJavaTypeType.BIGDECIMAL) {
					generateSQL += " default -1";
				} else if (fldType == AbstractCommonFieldJavaTypeType.INTEGER) {
					generateSQL += " default -1";
				}
			}
			if (!field.getNullAllowed()) {
				// if (generateSQL.indexOf(" default ") != -1)
				// generateSQL += " not null";
				// if (generateSQL.indexOf(" default ") == -1)
				// generateSQL += " default ''";
				// NOTICE 为了动态表字段创建如下:
				// java.sql.SQLException: ORA-01758: 要添加法定 (NOT NULL) 列，则表必须为空
				// generateSQL += " not null";
			}
		}
		return generateSQL;
	}
	@Override
    public String genTypeSQL(AbstractField field) {
        AbstractCommonFieldJavaTypeType fldType = field.getJavaType();
        if (fldType == AbstractCommonFieldJavaTypeType.STRING) {
            long len = field.getLength() <= 0 ? 50 : field.getLength();
            if (len <= 100
                && (field.getJavaType()  == AbstractCommonFieldJavaTypeType.BLOB 
                || field.getJavaType() == AbstractCommonFieldJavaTypeType.DBBLOB))
                len = 255;
            return "VARCHAR2(" + len + ")";
        } else if (fldType == AbstractCommonFieldJavaTypeType.BLOB) {
            long len = field.getLength() <= 0 ? 255 : field.getLength();
            return "VARCHAR2(" + len + ")";
        } else if (fldType == AbstractCommonFieldJavaTypeType.BIGDECIMAL) {
            long len = field.getLength() <= 0 ? 18 : field.getLength();
            if (field.hasMinFractionDigit())
                return "NUMBER(" + len + "," + field.getMinFractionDigit() + ")";
            else if (field.hasMaxFractionDigit())
                return "NUMBER(" + len + "," + field.getMaxFractionDigit() + ")";
            return "NUMBER";
        } else if (fldType == AbstractCommonFieldJavaTypeType.INTEGER) {
            return "NUMBER";
        } else if (fldType == AbstractCommonFieldJavaTypeType.DATE) {
            return "DATE";
        } else if (fldType == AbstractCommonFieldJavaTypeType.DBBLOB) {
            return "BLOB";
        } else if (fldType == AbstractCommonFieldJavaTypeType.DBCLOB) {
			return "TEXT";
		} else {
            throw new Warning("Unknown AbstractCommonFieldJavaTypeType=" + fldType);
        }
    }

}
