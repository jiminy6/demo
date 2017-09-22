package com.pool.service;

import com.pool.dao.UserDao;
import com.pool.domain.User;

public class UserService {
	public User login(User user) {
		UserDao userDao = new UserDao();
		user = userDao.findByNameAndPassword(user);
		return user;
	}
}
