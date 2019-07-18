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
import com.rgvms.domain.UserVO;
import com.rgvms.service.UserService;

@Controller
@RequestMapping("admin/user")
public class UserController {

	@Inject
	private UserService service;

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	//1. 사용자(학생) 등록폼으로 이동
	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public void registerGET(UserVO uVo, Model model) throws Exception {
		
		logger.info("user registerGET..............");
	}
	
	//2. 사용자(학생) 등록
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String registerPOST(UserVO uVo, RedirectAttributes rttr) throws Exception {
		
		logger.info("user registerPOST.............");
		logger.info(uVo.toString());
		
		service.register(uVo);
		
		rttr.addAttribute("user", "SUCCESS");
		
		return "redirect:/user/list";
	}
	
	//3. 사용자(학생)목록
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public void listGET(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		
		logger.info("user listGET..................");
		logger.info(cri.toString());
		
		System.out.println("***********" + cri.toString());
		model.addAttribute("list", service.list(cri));
	}
	
	//4. 사용자(학생) 수정폼으로 이동
	@RequestMapping(value = "/modify", method=RequestMethod.GET)
	public void modifyGET(@RequestParam("userNo") int userNo, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		
		logger.info("user modifyGET...............");
		model.addAttribute(service.read(userNo));
	}
	
	//5. 사용자(학생) 수정
	@RequestMapping(value = "/modify", method=RequestMethod.POST)
	public String modifyPOST(UserVO uVo, SearchCriteria cri, RedirectAttributes rttr) throws Exception {
		
		logger.info("user modifyPOST..............");
		
		service.modify(uVo);
		rttr.addFlashAttribute("user", "SUCCESS");
		
		return "redirect:/user/list";
	}
	
	//6. 사용자(학생) 삭제
	@RequestMapping(value = "/remove", method=RequestMethod.POST)
	public String remove(@RequestParam("userNo") int userNo, SearchCriteria cri, RedirectAttributes rttr) throws Exception {
		
		logger.info("user removePOST..............");
		
		service.remove(userNo);
		
		rttr.addAttribute("SearchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		rttr.addFlashAttribute("user", "SUCCESS");
		
		return "redirect:/user/list";
	}
}
