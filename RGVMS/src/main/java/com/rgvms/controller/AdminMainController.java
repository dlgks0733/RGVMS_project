package com.rgvms.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rgvms.service.UserService;

@Controller
@RequestMapping("/admin/*")
public class AdminMainController {

	@Inject
	private UserService service;
	
	private static Logger logger = LoggerFactory.getLogger(AdminApplyContorller.class);
	
	@RequestMapping("/main")
	public void main(Model model) throws Exception {
		logger.info("Admin Main.......");
		model.addAttribute("applyCount", service.applyCount());
		model.addAttribute("graduateCount", service.graduateCount());
		model.addAttribute("graduateToBeCount", service.graduateToBeCount());
		
		model.addAttribute("misList", service.misInfo());
		
		
	}
	
	
}
