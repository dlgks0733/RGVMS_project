package com.rgvms.controller;

import java.util.Date;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rgvms.domain.MisAttVO;
import com.rgvms.domain.MisVO;
import com.rgvms.domain.PageMaker;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.UserVO;
import com.rgvms.service.MisAttService;
import com.rgvms.service.MisService;

@Controller
@RequestMapping("/admin/mis/*")
public class MisController {

	// inject 서비스마다 각각 하나씩 해줘야됨
	@Inject
	private MisService service;

	@Inject
	private MisAttService attService;

	private static final Logger logger = LoggerFactory.getLogger(MisController.class);

	// 리스트 띄우기
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {

		logger.info(cri.toString());

		System.out.println("=====" + cri.toString());
		model.addAttribute("list", service.list(cri));

		PageMaker pageMaker = new PageMaker();

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listSearchCount(cri));

		model.addAttribute("pageMaker", pageMaker);

	}

	// 글 등록 화면
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(Model model) throws Exception {
		logger.info("register get..");
		
		List<UserVO> stuList = attService.stuList();
		model.addAttribute("stuList", stuList);
		

	}

	// 글 등록
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(MisVO mis, MisAttVO aVo, @RequestParam("misAttDate") Date attDate, 
			 RedirectAttributes rttr) throws Exception {
		logger.info("register post...");
		logger.info(mis.toString());
		logger.info(attDate.toString());
		Integer misNo = service.register(mis);
		logger.info("misAttNo : " + misNo);
		aVo.setMisNo(misNo);
		logger.info("misAttNo : " + misNo);
		attService.register(aVo);
		
		logger.info(mis.toString());
		
//		service.register(mis);
//		attService.register(att);
		
		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/admin/mis/list";
	}

	// 삭제하기
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String removePage(@RequestParam("misNo") int misNo, SearchCriteria cri, RedirectAttributes rttr)
			throws Exception {

		service.remove(misNo);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/admin/mis/list";
	}

	// 수정하기
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void updateGET(@RequestParam("misNo") int misNo, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception {

		model.addAttribute(service.read(misNo));
	}

	// 수정 유지해서 값 넘김
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String updatePOST(MisVO mis, SearchCriteria cri, RedirectAttributes rttr) throws Exception {

		logger.info(cri.toString());
		service.modify(mis);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addFlashAttribute("searchType", cri.getSearchType());

		rttr.addFlashAttribute("msg", "SUCCESS");

		logger.info(rttr.toString());

		return "redirect:/admin/mis/list";
	}

	// 상세보기
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("misNo") SearchCriteria cri, int misNo, Model model) throws Exception {

		model.addAttribute(service.read(misNo));

	}
}
