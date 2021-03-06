package com.pool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo2 {
//	public static void main(String[] args) throws SQLException {
//		insert();
	@Test
	public void demo1() throws SQLException{
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		String sql="insert into user values(?,?,?);";
		Object[] params={5,"admin3","333"};
		int update = queryRunner.update(sql, params);
		System.out.println(update);
	}
		@Test
		public void demo2() throws SQLException{
			QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
			BeanHandler<User> rsh = new BeanHandler<User>(User.class);
			String sql="select * from user where id=?";
			User user = queryRunner.query(sql, rsh,1);
			System.out.println(user);
		}
//	}
		private ResultSetHandler<User> method1() {
			ResultSetHandler<User> rsh=new ResultSetHandler<User>() {
				@Override
				public User handle(ResultSet rs) throws SQLException {
					if(rs.next()){
						int id=rs.getInt("id");
						String name=rs.getString("name");
						String password = rs.getString("password");
						User user = new User(name, password, id);
						return user;
					}
					return null;
				}
				
			};
			return rsh;
		}

	private static void insert() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		String sql="insert into user values(?,?,?);";
		Object []param={2,"admin1","234"};
		queryRunner.update(sql, param);
	}
}
