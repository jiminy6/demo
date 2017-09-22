package com.practice_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {
	static String url="";
	static String password="";
	static String  driverclass="";
	static String  user ="";
	static Connection conn;
	static {
		    Properties ps = new Properties();
			try {
				ps.load(new FileInputStream("java.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			 driverclass = ps.getProperty("driverclass");
			 url = ps.getProperty("url");
			 password = ps.getProperty("password");
			 user = ps.getProperty("user");
			 try {
				Class.forName(driverclass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
	
	public static Connection getConnection () {
		Connection conn=null;
		try {
			Class.forName(driverclass);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return conn;
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
