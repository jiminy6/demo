package com.pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) throws SQLException {
//		Connection conn = null;
		MySource mm = new MySource();
		Connection conn = mm.getConnection();
		String sql="insert into student values(?,?,?,?)";
//id name city age		
		// 从数据库池中取连接
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(2,"zhanzhan");
		prepareStatement.setString(3, "东京");
		prepareStatement.setInt(1, 40);
		prepareStatement.setInt(4, 22);
		int update = prepareStatement.executeUpdate();
		System.out.println(update);
		prepareStatement.close();
		conn.close();
	}

	private static void method(Connection conn) throws SQLException {
		Statement statement = conn.createStatement();
		String sql="select * from student ";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			String city = resultSet.getString("city");
			String name = resultSet.getString("name");
			System.out.println(name+"--"+city);
		}
		statement.close();
		conn.close();
	}
}
