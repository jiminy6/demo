package com.pool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pool.domain.User;

public class UserDao {
	public User findByNameAndPassword(User user) {
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		Statement statement =null;
		try {
			 conn = JdbcUtils.getConnection();
			String sql = "select * from user where name=? and password=?;";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, user.getName());
			prepareStatement.setString(2, user.getPassword());
			resultSet = prepareStatement.executeQuery();
			if (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String password = resultSet.getString("password");
				user.setId(id);
				user.setName(name);
				user.setPassword(password);
				return user;
			}
			
		} catch (SQLException e) {
			System.out.println("服务器异常");
		} finally {
			JdbcUtils.release(conn, prepareStatement, resultSet);
		}
		return null;

	}
}
