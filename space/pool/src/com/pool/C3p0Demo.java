package com.pool;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Demo {
	public static void main(String[] args) throws PropertyVetoException, SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
//		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/dayday");
//		dataSource.setUser("root");
//		dataSource.setPassword("root");
//		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		String sql="select * from student";
		Connection conn = dataSource.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()){
			String name = resultSet.getString("name");
			String city = resultSet.getString("city");
			System.out.println(name+"---"+city);
		}
		resultSet.close();
		statement.close();
		conn.close();
	}
}
