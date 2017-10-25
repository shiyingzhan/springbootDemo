package com.syz.springbootdemo.user.dao;

import java.util.List;

import com.syz.springbootdemo.user.model.User;

public interface UserDao {
	List<User> getUserList();
}
