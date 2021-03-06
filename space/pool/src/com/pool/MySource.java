package com.pool;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MySource implements DataSource {
	static String url="";
	static String password="";
	static String  driverclass="";
	static String  user ="";
	static {
		    Properties ps = new Properties();
			try {
				ps.load(new FileInputStream("java.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			 driverclass = ps.getProperty("driverclass");
			 url = ps.getProperty("url");
			 password = ps.getProperty("password");
			 user = ps.getProperty("user");
			 try {
				Class.forName(driverclass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
	//初始化配置文件
	private LinkedList<Connection>pools=new LinkedList<Connection>();
	//在链表上对链接的加入和删除操作.
	public MySource(){
		//加载一些驱动写在构造方法里面
	System.out.println("初始化数据库连接池");
	for (int i = 0; i <5; i++) {
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			pools.add(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	System.out.println("初始化成功,数据库池里面有"+pools.size()+"个连接");
	}
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return null;
	}
	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
	}
	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
	}
	@Override
	public int getLoginTimeout() throws SQLException {
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection() {
		
		System.out.println("从池子中取出连接");
		 final Connection  conn = pools.removeLast();
		 Class<? extends Connection> clazz = conn.getClass();
		 ClassLoader loader=clazz.getClassLoader();
		 Class<?>[] interfaces=clazz.getInterfaces();
		 InvocationHandler h=new InvocationHandler() {
			 //这个是方法选择器
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if(method.getName().equals("close")){
					pools.add(conn);
					System.out.println("池子里面还有"+pools.size()+"个连接");
					return null;
				}
				else{
					return method.invoke(conn, args);
				}
			}
		};
		 Connection proxyCon = (Connection) Proxy.newProxyInstance(loader, interfaces, h);
		 System.out.println("来,快夸我");
		 System.out.println("数据库还有"+pools.size()+"个连接");
		 return proxyCon;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public static void release (Connection conn,Statement statement,ResultSet resultset){
		if(resultset!=null){
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(statement!=null){
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
