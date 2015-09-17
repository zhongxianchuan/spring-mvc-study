package com.imooc.mvcdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.mvcdemo.model.UserInfo;
import com.imooc.mvcdemo.service.UserService;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/mvc")
	//host:8080/hello/mvc
	public String helloMvc(){
		return "home";
	}
	
	@RequestMapping("/baidu")
	public String link(ModelMap modelMap){
		UserInfo userInfo = userService.getUserById(3);
		modelMap.addAttribute("userInfo", userInfo);
		return "link";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "about";
	}
	
	@RequestMapping("/caselist")
	public String caselist(){
		return "caselist";
	}
	
	@RequestMapping("/knowledge")
	public String knowledge(){
		return "knowledge";
	}
	
	@RequestMapping("/moodlist")
	public String moodlist(){
		return "moodlist";
	}
	
	@RequestMapping("/new")
	public String news(){
		return "new";
	}
	
	@RequestMapping("/newlist")
	public String newlist(){
		return "newlist";
	}
	
	@RequestMapping("/share")
	public String share(){
		return "share";
	}
	
	@RequestMapping("/book")
	public String template(){
		return "template";
	}
}
