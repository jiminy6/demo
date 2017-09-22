package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZhuruDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String name="admin";
		String password="1234";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dayday", "root", "root");
		String sql="select * from user where name=? and password=?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		int count=0;
		while(resultSet.next()){
			count=resultSet.getInt(1);
		}
		if(count==1){
			System.out.println("登录成功");
		}
		else{
			System.out.println("登录不成功");
		}
	}
}
