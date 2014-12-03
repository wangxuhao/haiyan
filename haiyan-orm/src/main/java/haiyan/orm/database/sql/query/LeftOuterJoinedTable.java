/*
 * Created on 2004-10-9
 */
package haiyan.orm.database.sql.query;


/**
 * @author zhouxw
 */
public class LeftOuterJoinedTable extends JoinedTable {

	/**
	 * @param tableName
	 * @param PKColumnName
	 * @param ChildTableName
	 * @param ChildTableColName
	 */
	public LeftOuterJoinedTable(String tableName, String PKColumnName,
			String ChildTableName, String ChildTableColName,
			PrimaryTable pTable, int index) {
		super(tableName, PKColumnName, ChildTableName, ChildTableColName,
				pTable, index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.haiyan.genmis.util.queryengine.JoinedTable#getJoinKeyWord()
	 */
	public String getJoinKeyWord() {
		return "left outer join";
	}

}