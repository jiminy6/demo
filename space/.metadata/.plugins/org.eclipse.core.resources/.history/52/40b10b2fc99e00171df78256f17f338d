package com.pool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

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
