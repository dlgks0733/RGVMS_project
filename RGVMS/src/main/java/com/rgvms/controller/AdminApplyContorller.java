package com.rgvms.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.service.ApplyService;

@Controller
@RequestMapping("admin/apply/*")
public class AdminApplyContorller {

	@Inject
	private ApplyService service;
	
	private static Logger logger = LoggerFactory.getLogger(AdminApplyContorller.class);
	
	
	// 학생 :: 졸업인증신청 관리 - 신청 - 항목 명 검색 팝업 + 졸업인증항목리스트
	@RequestMapping(value = "/searchPopup", method=RequestMethod.GET)
	public void searchPopup(Model model) throws Exception {
		logger.info("saerchPopup......");
		List<SubjectVO> subList = service.subList();
		model.addAttribute("subList", subList);
		
	}
	
	
	// 학생 :: 졸업인증신청 관리 - 신청 - 항목 명 검색
	@RequestMapping(value = "/searchSub", method = RequestMethod.POST)
	public SubjectVO searchSub(@RequestParam("subName") String subName) throws Exception {
		SubjectVO sVo = new SubjectVO();
		
		sVo = service.searchSub(subName);
		
		logger.info("searchSub : " + sVo.toString());
		
		return sVo; 
	}
	
	
	// 학생 :: 졸업인증신청 관리 - 신청 등록 화면
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register() throws Exception {
		logger.info("Apply Register Form.....");
	}
	

	// 학생 :: 졸업인증신청 관리 - 한 학생의 신청 내역 목록 화면
	@RequestMapping(value = "/stuApplyList", method = RequestMethod.GET)
	public String stuApplyList(@RequestParam("userNo") int userNo, @ModelAttribute("cri") SearchCriteria cri)
			throws Exception {
		logger.info("stuApplyList Form.....");
		
		return "/user/stuApplyList";
		
	}

}
