package com.rgvms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rgvms.domain.ApplyVO;
import com.rgvms.domain.PageMaker;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.domain.UserVO;
import com.rgvms.service.ApplyService;

@Controller
@RequestMapping("/user/apply/*")
public class UserApplyController {

	@Inject
	private ApplyService service;

	private static Logger logger = LoggerFactory.getLogger(UserApplyController.class);

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public void registerGET() throws Exception {
		logger.info("User Apply Register .......");
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String registerPOST(ApplyVO aVo, RedirectAttributes attr) throws Exception {
		logger.info("User Apply Register .......");
		logger.info("aVo : " + aVo);
		logger.info("acScore : " + aVo.getAcScore());

		service.register(aVo);

		return "redirect:list";
	}

	// 학생 :: 졸업인증신청 관리 - 신청 - 항목 명 검색 팝업 + 졸업인증항목리스트
	@RequestMapping(value = "/searchPopup", method = RequestMethod.GET)
	public void searchPopup(Model model) throws Exception {
		logger.info("saerchPopup......");
		List<SubjectVO> subList = service.subList();
		model.addAttribute("subList", subList);

	}

	// 학생 :: 졸업인증신청 관리 - 신청 - 항목 명 검색
	@RequestMapping(value = "/searchSub", method = RequestMethod.GET)
	public void searchSub(@RequestParam("subName") String subName, Model model) throws Exception {

		List<SubjectVO> searchSubList = service.searchSub(subName);

		logger.info("searchSub : " + searchSubList.toString());
		model.addAttribute("searchSubList", searchSubList);

	}

	// 학생 :: 졸업인증신청 관리 - 한 학생의 신청 내역 목록 화면
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(HttpServletRequest request, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		logger.info("User Apply List Form.....");
		logger.info(cri.toString());
		System.out.println("=====" + cri.toString());
		
		HttpSession session = request.getSession();
		UserVO uVo = (UserVO) session.getAttribute("login");
		int userNo = uVo.getUserNo();

		model.addAttribute("list", service.stuApplyList(userNo, cri));

		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);

		pageMaker.setTotalCount(service.listSearchCount(cri));

		model.addAttribute("pageMaker", pageMaker);

	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("applyNo") int applyNo, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		logger.info("readPage.........");
		//신청내용
		model.addAttribute(service.stuApplyRead(applyNo));
		//신청한 파일 리스트
		
		logger.info("readPage.fileVO: " + service.fileList(applyNo).size());
		model.addAttribute("fileVO",service.fileList(applyNo));
	}

}
