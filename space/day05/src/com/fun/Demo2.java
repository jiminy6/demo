package com.fun;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

public class Demo2 {
	@Test
	public void dem1o2() throws SQLException{
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		String sql="select * from student;";
		Map<User, Map<String, Object>> map = queryRunner.query(sql,new KeyedHandler<User>("name"));
		Set<Entry<User,Map<String,Object>>> entrySet = map.entrySet();
		for (Entry<User, Map<String, Object>> entry : entrySet) {
			System.out.println(entry);
		}
	}

	private void method7(QueryRunner queryRunner, String sql) throws SQLException {
		List<String> list = queryRunner.query(sql,new ColumnListHandler<String>("city"));
		System.out.println(list);
	}

	private void method6(QueryRunner queryRunner, String sql) throws SQLException {
		List<Object[]> list = queryRunner.query(sql,new ArrayListHandler());
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}

	private void method5(QueryRunner queryRunner, String sql) throws SQLException {
		List<Map<String, Object>> query = queryRunner.query(sql,new MapListHandler());
	    for (Map<String, Object> map : query) {
		}
	}

	private void method4(QueryRunner queryRunner, String sql) throws SQLException {
		Map<String, Object> map = queryRunner.query(sql,new MapHandler());
		Set<Entry<String,Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+value);
		}
	}

	private void method3(QueryRunner queryRunner) throws SQLException {
		String sql="select count(*) from user";
		Long query = queryRunner.query(sql,new ScalarHandler<Long>());
		System.out.println(query);
	}

	private void method2(QueryRunner queryRunner) throws SQLException {
		String sql="select * from user";
		
		List<User> list = queryRunner.query(sql,new BeanListHandler<User>(User.class));
		for (User user : list) {
			System.out.println(user);
		}
	}

	private void method1(QueryRunner queryRunner) throws SQLException {
		String sql="select * from user where id=?";
		User user = queryRunner.query(sql, new BeanHandler<User>(User.class), 5);
		System.out.println(user);
	}
}
