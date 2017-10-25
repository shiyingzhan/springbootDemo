package com.syz.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class Index {
	@RequestMapping("index")
	public String index(Model model){
		model.addAttribute("msg","hello world");
		return "index";
	}
}
