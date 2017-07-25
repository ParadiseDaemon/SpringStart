package com.gmw.skype.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmw.skype.bean.User;
import com.google.gson.Gson;

@Controller
public class GetUserInfoController {
	
	@RequestMapping("/getUserInfo.html")
	@ResponseBody
	public String getUserInfo(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user =  (User) context.getBean("user");
		
		user.setUsername("wjc");
		user.setSex("man");
		user.setAge(26);
		
		return new Gson().toJson(user);
	}
}
