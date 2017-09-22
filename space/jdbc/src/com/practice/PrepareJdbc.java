package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepareJdbc {
	public static void main(String[] args) throws Exception {
		String uname="admin";
		String pwd="1234";
		Class.forName("com.mysql.jdbc.Driver");
		String password="root";
		String user="root";
		String url="jdbc:mysql://localhost:3306/dayday";
		Connection conn = DriverManager.getConnection(url, user, password);
		String sql="select count(*) from user where name=? and password=?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, uname);
		statement.setString(2, pwd);
		
		
	    ResultSet resultSet = statement.executeQuery();
	    
	    
	    int count=0;
	    while(resultSet.next()){
	    	count=resultSet.getInt(1);
	    }
	   
		if(count==1){
			System.out.println("登录成功");
		}else{
			System.out.println("登录不成功");
		}
		statement.close();
		resultSet.close();
		conn.close();

	}
}
