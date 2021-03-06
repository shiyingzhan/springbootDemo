package com.syz.springbootdemo.controller.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syz.springbootdemo.model.user.User;
import com.syz.springbootdemo.service.UserService.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("getUserList")
	public String getUserList(Model model){
		List<User> list = userService.getUserList();
		model.addAttribute("userList", list);
		return "/user/userlist";
	}
}
