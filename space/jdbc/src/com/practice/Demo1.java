package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class Demo1 {
@Test
public void demo1() throws Exception{
	DriverManager.registerDriver(new Driver());
	String url="jdbc:mysql://localhost:3306/day06";
	String user="root";
	String password="root";
	Connection conn = DriverManager.getConnection(url, user, password);
	Statement statement = conn.createStatement();
//	String sql="select * from user";
	String sql="update user set age=30";
	boolean execute = statement.execute(sql);
	if(execute){
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");
			int age= resultSet.getInt("age");
			System.out.println(id+"--"+name+"--"+age);
		}
		statement.close();
	}
	else {
		int update = statement.executeUpdate(sql);
		System.out.println(update);
		statement.close();
	}
	
	conn.close();
	
}

private Statement method1(Connection conn) throws SQLException {
	Statement statement = conn.createStatement();
	String sql="update user set age=20";
	
	
	int update = statement.executeUpdate(sql);
	System.out.println(update);
	return statement;
}
}
