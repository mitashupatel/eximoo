package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdvertisementController {
		
	@RequestMapping(value="/addads",method= {RequestMethod.GET})
	public String addAds(Model model) {
		
		return "AddAds";
		
	}
	@RequestMapping(value="/showad",method= {RequestMethod.GET})
	public String showAd(Model model) {
		
		return "showad";
		
	}
}
