package com.transfer;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class Dao {
	
	public void outmoney(String outname, int money) throws SQLException {
	QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
	String sql="update account set money=money-?,where name=?;";
	queryRunner.update(sql,money,outname);
	}

	public void inmoney(String inname, int money) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		String sql="update account set money=money+?,where name=?;";
		queryRunner.update(sql,money,inname);
	}

	

}
