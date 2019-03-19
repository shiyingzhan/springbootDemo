package com.syz.springbootdemo.dao.user;

import java.util.List;

import com.syz.springbootdemo.model.user.User;

public interface UserDao {
	List<User> getUserList();
}
