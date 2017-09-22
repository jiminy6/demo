package com.transfer;

import java.sql.Connection;
import java.sql.SQLException;

public class Service {
	public static void main(String[] args) {
		
	}
	public boolean transfer(String outname, String inname, int money)  {
		Dao dao = new Dao();
		try {
			Connection conn = JdbcUtils.getConnection();
			dao.outmoney(outname,money);
			dao.inmoney(inname,money);
			conn.commit();
			System.out.println("转账成功");
		} catch (Exception e) {
		System.out.println("服务器异常,转账失败");
		}
		return false;
	}
}
