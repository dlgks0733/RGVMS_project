package com.rgvms.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rgvms.domain.UserVO;
import com.rgvms.service.UserService;

@Controller
@RequestMapping("/user/mypage/*")
public class myPageController {

	@Inject
	private UserService service;

	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	//1. 내정보확인 페이지
	@RequestMapping(value = "/myInfo", method=RequestMethod.GET)
	public void registerGET(HttpServletRequest request, Model model) throws Exception {
		
		logger.info("user myPageGET..............");
		
		HttpSession session = request.getSession();
	
	    UserVO uVo = (UserVO) session.getAttribute("login");
	    int userNo = uVo.getUserNo();
	    System.out.println(userNo);
	    
	    model.addAttribute(service.myInfo(userNo));

		}
	
	//2. 내정보 수정폼으로 이동
	@RequestMapping(value="/myInfoUpdate", method=RequestMethod.GET)
	public void mpModifyGET(@RequestParam("userNo") int userNo, Model model) throws Exception {
		
		logger.info("user mpModifyGET...............");
		
		model.addAttribute(service.myInfo(userNo));
	}
	
	//3. 내정보 수정
	@RequestMapping(value="/myInfoUpdate", method=RequestMethod.POST)
	public String mpModifyPOST(UserVO uVo, RedirectAttributes rttr, Model model) throws Exception {

		logger.info("user mpModifyPOST...............");
		
		service.myInfoModify(uVo);
		
		rttr.addFlashAttribute("user", "SUCCESS");
		
		return "redirect:/user/mypage/myInfo";
	}
}
