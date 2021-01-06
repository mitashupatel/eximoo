package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class NewsLetterController {
	@RequestMapping(value="/newsletter",method= {RequestMethod.GET})
	public String newsLetter(Model model) {
		
		return "NewsLetter";
		
	}
	@RequestMapping(value="/newslettersend",method= {RequestMethod.GET})
	public String newsLettersend(Model model) {
		
		return "NewsLetterSend";
		
	}
}
