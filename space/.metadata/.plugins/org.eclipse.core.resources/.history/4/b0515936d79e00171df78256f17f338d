package com.fun;
//进一步完善工具类.
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbutils.DbUtils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	static ComboPooledDataSource  cpds=new ComboPooledDataSource();
	public static Connection getConnection () throws SQLException {
		Connection conn = cpds.getConnection();
		 return conn;
	}
	public static DataSource getDataSource(){
		return cpds;
	}
	public static void commitAndclose(Connection conn){
		DbUtils.commitAndCloseQuietly(conn);
	}
	//一个是提交后关闭,一个是回滚之后关闭
	public static void rollbackAndclose(Connection conn){
		DbUtils.rollbackAndCloseQuietly(conn);
	}
	public static void release (Connection conn,Statement statement,ResultSet resultset){
		if(resultset!=null){
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(statement!=null){
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
