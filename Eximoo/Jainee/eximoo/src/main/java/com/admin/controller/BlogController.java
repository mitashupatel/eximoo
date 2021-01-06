package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class BlogController {
	@RequestMapping(value="/createblog",method= {RequestMethod.GET})
	public String createBlog(Model model) {
		
		return "CreateBlog";
		
	}
	@RequestMapping(value="/showblogs",method= {RequestMethod.GET})
	public String showBlogs(Model model) {
		
		return "ShowBlogs";
		
	}
}
