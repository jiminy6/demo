package com.fun;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

public class Demo1 {
	public static void main(String[] args) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		String sql="select * from user where id=?";
		User user = queryRunner.query(sql, new ResultSetHandler<User>() {
			@Override
			public User handle(ResultSet rs) throws SQLException {
				if(rs.next()){
					int id = rs.getInt("id");
					String name = rs.getString("name");
//					System.out.println(id);
					String password = rs.getString("password");
					User user = new User();
					user.setId(id);
					user.setName(name);
					user.setPassword(password);
					return user;
				}
				return null;
			}
		},3);
		System.out.println(user);
	}
}
