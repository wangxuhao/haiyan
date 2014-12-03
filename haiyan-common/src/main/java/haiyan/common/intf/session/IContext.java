package haiyan.common.intf.session;

import java.util.List;

import haiyan.common.intf.database.IDBManager;
import haiyan.common.intf.exp.IExpUtil;

/**
 * 抽象上下文接口
 * 
 * @author ZhouXW
 *
 */
public interface IContext extends ISession {

	void setExpUtil(IExpUtil exp);
	IExpUtil getExpUtil();
	Object removeAttribute(String key);
	Object getAttribute(String key);
	boolean hasAttribute(String key);
	void setAttribute(String key, Object val);
	void addException(Throwable e);
	List<Throwable> getExceptions();
	
	void setDBM(IDBManager dbm);
	IDBManager getDBM();
	Object getNextID(String tableName);
	void setUser(IUser user);
	IUser getUser();
	void setDSN(String DSN);
	String getDSN();
	void clear();
	void close();

}
