package com.rgvms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user/apply/*")
public class UserApplyController {

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public void register() throws Exception{
		
	}
	
}
