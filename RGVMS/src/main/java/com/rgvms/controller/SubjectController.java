package com.rgvms.controller;

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

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.service.SubjectService;

@Controller
@RequestMapping("admin/subject/*")
public class SubjectController {

	private static final Logger logger = LoggerFactory.getLogger(SubjectController.class);

	@Inject
	private SubjectService service;

	// 1. 인증항목 등록폼으로 이동
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(SubjectVO sVo, Model model) throws Exception {

		logger.info("subject registerGET................");
	}

	// 2. 인증항목 등록
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(SubjectVO sVo, RedirectAttributes rttr) throws Exception {

		logger.info("subject registerPOST...............");
		logger.info(sVo.toString());

		service.register(sVo);

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/admin/subject/list";

	}

	// 3. 인증항목 목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listGET(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {

		logger.info("subject listGET..................");
		logger.info(cri.toString());

		System.out.println("***********" + cri.toString());
		model.addAttribute("list", service.list(cri));

	}

	// 4. 인증항목 상세내역
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("subNo") int subNo, Model model) throws Exception {

		logger.info("subject readGET..................");
		model.addAttribute(service.read(subNo));
	}

	// 5. 인증항목 수정폼으로 이동
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(@RequestParam("subNo") int subNo, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception {

		logger.info("subject modifyGET....");
		model.addAttribute(service.read(subNo));
	}

//	// 6. 인증항목 수정
//	@RequestMapping(value = "/modify", method = RequestMethod.POST)
//	public String modifyPOST(SubjectVO sVo, @ModelAttribute("cri") SearchCriteria cri, RedirectAttributes rttr) throws Exception {
//
//		logger.info("subject modifyPOST.............");
//		logger.info(cri.toString());
//
//		service.modify(sVo);
//
//		rttr.addAttribute("searchType", cri.getSearchType());
//		rttr.addAttribute("keyword", cri.getKeyword());
//
//		rttr.addFlashAttribute("msg", "SUCCESS");
//
//		logger.info(rttr.toString());
//
//		return "redirect:/admin/subject/list";
//	}
	
	// 6. 인증항목 수정
		@RequestMapping(value = "/modify", method = RequestMethod.POST)
		public void modifyPOST(SubjectVO sVo) throws Exception {

			logger.info("subject modifyPOST.............");

		}

	// 7. 인증항목 삭제
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("subNo") int subNo, SearchCriteria cri, RedirectAttributes rttr)
			throws Exception {

		logger.info("subject removePOST..............");

		service.remove(subNo);

		rttr.addAttribute("SearchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/admin/subject/list";
	}
}
