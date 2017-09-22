package com.kaiyuan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class Demo1 {
	public static void main(String[] args) throws Exception {
//		
		Properties properties = new Properties();
		properties.load(new FileInputStream("dbcp.properties"));
		DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
		//通过basicDataSourceFactory 的方式来创建数据池
		Connection conn = dataSource.getConnection();
		String sql="select * from student";
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

	private static void method1() {
		BasicDataSource dataSource = new BasicDataSource();
		//这个是通过
		String driverclass = "com.mysql.jdbc.Driver";
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/dayday";
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverclass);
	}
}
