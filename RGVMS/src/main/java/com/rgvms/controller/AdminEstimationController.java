package com.rgvms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rgvms.domain.PageMaker;
import com.rgvms.domain.SearchCriteria;

@Controller
@RequestMapping("/admin/estimation/*")
public class AdminEstimationController {

	private static Logger logger = LoggerFactory.getLogger(AdminApplyContorller.class);
	
	// 관리자 :: 졸업인증신청 관리 - 신청 목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		logger.info("Admin Estimation List....");

	}

}
