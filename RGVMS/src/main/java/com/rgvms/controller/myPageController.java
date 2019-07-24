package com.rgvms.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rgvms.service.UserService;

@Controller
@RequestMapping("/user/mypage/*")
public class myPageController {

	@Inject
	private UserService service;

	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	//1. 내정보확인 페이지
	@RequestMapping(value = "/myPage", method=RequestMethod.GET)
	public void registerGET(@RequestParam("userNo") int userNo, Model model) throws Exception {
		
		logger.info("user myPageGET..............");
	}
	
	//2. 내정보 수정 페이지
	@RequestMapping(value="/mpModify", method=RequestMethod.GET)
	public void mpModifyGET(@RequestParam("userNo") int userNo, Model model) throws Exception {
		
		logger.info("user mpModifyGET...............");
		model.addAttribute(service);
	}
}
