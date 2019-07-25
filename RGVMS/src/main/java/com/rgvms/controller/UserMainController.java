package com.rgvms.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rgvms.domain.UserVO;
import com.rgvms.service.ApplyService;
import com.rgvms.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserMainController {

	@Inject
	private ApplyService service;
	
	@Inject
	private UserService userService;

	private static Logger logger = LoggerFactory.getLogger(AdminApplyContorller.class);

	@RequestMapping("/main")
	public void main(HttpServletRequest request, Model model) throws Exception {
		logger.info("User Main........");

		HttpSession session = request.getSession();

		UserVO uVo = (UserVO) session.getAttribute("login");
		int userNo = uVo.getUserNo();

		model.addAttribute(service.esSelect(userNo));
		model.addAttribute("mainApplyWaitList", userService.mainApplyWaitList(userNo));

	}

}
