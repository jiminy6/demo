package com.pool.web;

import org.junit.Test;

import com.pool.domain.User;
import com.pool.service.UserService;

public class WebDemo {
	@Test
//public static void main(String[] args) {
	public void demo2(){
	String name="admin";
	String password="123";
	User user = new User();
	user.setName(name);
	user.setPassword(password);
	UserService userService = new UserService();
	User login = userService.login(user);
	if(login==null){
		System.out.println("登录失败");
	}
	else{
		System.out.println("登录成功");
		System.out.println(login.getId());
		System.out.println(login.getName());
		System.out.println(login.getPassword());
	}
	}
}
