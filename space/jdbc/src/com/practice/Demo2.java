package com.practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class Demo2 {
	@Test
	public void demo1() throws Exception{
		DriverManager.deregisterDriver(new Driver());
		String url ="jdbc:mysql://localhost:3306/day06";
		String user="root";
		String password="root";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement statement = conn.createStatement();
		String sql="select * from user";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");
			int age=resultSet.getInt("age");
			System.out.println(id+"=="+name+"=="+age);
		}
		resultSet.close();
		statement.close();
		conn.close();
	}
}
