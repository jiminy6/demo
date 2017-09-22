package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class JdbcUtils {
	static Connection conn;
	static String user="";
	static String password="";
	static String url="";
	static{
		try {
			Properties properties = new Properties();
			try {
				properties.load(new FileInputStream("java.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String driverclass = properties.getProperty("driverclass");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			Class.forName(driverclass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    return  conn;
	}
	public static void relase(ResultSet resultSet,Statement statement,Connection conn){
		if(resultSet!=null){
			try {
				resultSet.close();
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
	if (conn!=null){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	}
}
