package com.syz.springbootdemo.service.UserService.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syz.springbootdemo.dao.user.UserDao;
import com.syz.springbootdemo.model.user.User;
import com.syz.springbootdemo.service.UserService.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	public List<User> getUserList() {
		return dao.getUserList();
	}

}
