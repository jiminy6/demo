package com.practice_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	static {
		
	}
	public static void main(String[] args) throws ClassNotFoundException{
		Statement statement=null;
		Connection conn = JdbcUtils.getConnection();
		ResultSet resultSet=null;
		try {
			statement = conn.createStatement();
			String sql="select * from user";
			 resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				String name = resultSet.getString("name");
				String password = resultSet.getString("password");
				System.out.println(name+password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtils.release(conn, statement, resultSet);
		}
		
	}
}
