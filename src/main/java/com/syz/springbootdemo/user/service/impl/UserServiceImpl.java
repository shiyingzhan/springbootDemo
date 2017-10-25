package com.syz.springbootdemo.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syz.springbootdemo.user.dao.UserDao;
import com.syz.springbootdemo.user.model.User;
import com.syz.springbootdemo.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	public List<User> getUserList() {
		return dao.getUserList();
	}

}
