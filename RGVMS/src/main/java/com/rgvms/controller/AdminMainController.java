package com.rgvms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
public class AdminMainController {

	private static Logger logger = LoggerFactory.getLogger(ApplyContorller.class);
	
	@RequestMapping("/main")
	public void main() throws Exception {
		logger.info("Admin Main.......");
	}
	
}
