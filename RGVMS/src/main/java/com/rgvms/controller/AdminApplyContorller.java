package com.rgvms.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rgvms.domain.PageMaker;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.domain.UserVO;
import com.rgvms.service.ApplyService;

@Controller
@RequestMapping("admin/apply/*")
public class AdminApplyContorller {

	@Inject
	private ApplyService service;

	private static Logger logger = LoggerFactory.getLogger(AdminApplyContorller.class);

	// 관리자 :: 졸업인증신청 관리 - 신청 목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		logger.info("Admin Apply List Form.....");
		logger.info(cri.toString());
		System.out.println("=====" + cri.toString());
		model.addAttribute("allList", service.adApplyList(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.adApplyListSearchCount(cri));

		model.addAttribute("pageMaker", pageMaker);

	}

	// 관리자 :: 졸업인증신청 관리 - 신청 상세조회
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("applyNo") int applyNo, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception {
		logger.info("readPage.........");
		model.addAttribute(service.adApplyRead(applyNo));
		logger.info("readPage.fileVO: " + service.fileList(applyNo).size());
		model.addAttribute("fileVO", service.fileList(applyNo));

	}

	// 관리자 :: 졸업인증신청 관리 - 신청 승인
	@RequestMapping(value = "/accept", method = RequestMethod.POST)
	public String accept(@RequestParam("applyNo") int applyNo, @RequestParam("reason") String reason,
			@ModelAttribute("cri") SearchCriteria cri, RedirectAttributes rttr) throws Exception {
		logger.info("Accept Apply");
		service.accept(applyNo, reason);

		rttr.addFlashAttribute("msg", "처리 완료되었습니다.");

		return "redirect:/admin/apply/waitList";
	}

	// 관리자 :: 졸업인증신청 관리 - 신청 거절
	@RequestMapping(value = "/deny", method = RequestMethod.POST)
	public String deny(@RequestParam("applyNo") int applyNo, @RequestParam("reason") String reason,
			@ModelAttribute("cri") SearchCriteria cri, RedirectAttributes rttr) throws Exception {
		logger.info("Deny Apply");
		service.deny(applyNo, reason);

		rttr.addFlashAttribute("msg", "처리 완료되었습니다.");

		return "redirect:/admin/apply/waitList";
	}

	// 관리자 :: 졸업인증신청 관리 - 승인대기 신청내역 목록
	@RequestMapping(value = "/waitList", method = RequestMethod.GET)
	public void waitList(Model model) throws Exception {
		logger.info("Admin Apply WaitList");
		model.addAttribute("waitList", service.waitList());
		
	}

}
