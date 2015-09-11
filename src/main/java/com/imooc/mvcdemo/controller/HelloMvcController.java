package com.imooc.mvcdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.mvcdemo.model.UserInfo;
import com.imooc.mvcdemo.service.UserService;

@Controller
@RequestMapping("/hello.do")
public class HelloMvcController {
	
	@Autowired
	private UserService userService;
	@RequestMapping(params = "method=mvc")
	//host:8080/hello/mvc
	public String helloMvc(){
		return "home";
	}
	
	@RequestMapping(params = "method=baidu")
	public String link(ModelMap modelMap){
		UserInfo userInfo = userService.getUserById(3);
		modelMap.addAttribute("userInfo", userInfo);
		return "link";
	}
	
	@RequestMapping(params = "method=about")
	public String about(){
		return "about";
	}
	
	@RequestMapping(params = "method=caselist")
	public String caselist(){
		return "caselist";
	}
	
	@RequestMapping(params = "method=knowledge")
	public String knowledge(){
		return "knowledge";
	}
	
	@RequestMapping(params = "method=moodlist")
	public String moodlist(){
		return "moodlist";
	}
	
	@RequestMapping(params = "method=new")
	public String news(){
		return "new";
	}
	
	@RequestMapping(params = "method=newlist")
	public String newlist(){
		return "newlist";
	}
	
	@RequestMapping(params = "method=share")
	public String share(){
		return "share";
	}
	
	@RequestMapping(params = "method=template")
	public String template(){
		return "template";
	}
}
