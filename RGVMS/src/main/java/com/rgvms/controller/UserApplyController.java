package com.rgvms.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rgvms.domain.SubjectVO;
import com.rgvms.service.ApplyService;

@Controller
@RequestMapping("/user/apply/*")
public class UserApplyController {

	@Inject
	private ApplyService service;

	private static Logger logger = LoggerFactory.getLogger(UserApplyController.class);

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public void register() throws Exception {
		logger.info("User Apply Register .......");
	}

	// 학생 :: 졸업인증신청 관리 - 신청 - 항목 명 검색 팝업 + 졸업인증항목리스트
	@RequestMapping(value = "/searchPopup", method = RequestMethod.GET)
	public void searchPopup(Model model) throws Exception {
		logger.info("saerchPopup......");
		List<SubjectVO> subList = service.subList();
		model.addAttribute("subList", subList);

	}

}
