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

import com.rgvms.domain.GoalVO;
import com.rgvms.domain.UserVO;
import com.rgvms.service.ApplyService;
import com.rgvms.service.UserService;

@Controller
@RequestMapping("/user/mypage/*")
public class MyPageController {

	@Inject
	private UserService service;
	
	@Inject
	private ApplyService ApplyService;

	private static Logger logger = LoggerFactory.getLogger(MyPageController.class);
	
	//1. 내정보확인 페이지
	@RequestMapping(value = "/myInfo", method=RequestMethod.GET)
	public void myInfoGET(HttpServletRequest request, Model model) throws Exception {
		
		logger.info("user myPageGET..............");
		
		HttpSession session = request.getSession();
	
	    UserVO uVo = (UserVO) session.getAttribute("login");
	    
	    int userNo = uVo.getUserNo();
	    System.out.println(userNo);
	    
	    model.addAttribute(service.myInfo(userNo));

		}
	
	//2. 내정보 수정폼으로 이동
	@RequestMapping(value="/myInfoUpdate", method=RequestMethod.GET)
	public void myInfoUpdateGET(@RequestParam("userNo") int userNo, Model model) throws Exception {
		
		logger.info("user mpModifyGET...............");
		
		model.addAttribute(service.myInfo(userNo));
	}
	
	//3. 내정보 수정
	@RequestMapping(value="/myInfoUpdate", method=RequestMethod.POST)
	public String myInfoUpdatePOST(UserVO uVo, RedirectAttributes rttr, Model model) throws Exception {

		logger.info("user mpModifyPOST...............");
		
		service.myInfoModify(uVo);
		
		rttr.addFlashAttribute("user", "SUCCESS");
		
		
		
		return "redirect:/";
	}
	
	//4. 내 점수
	@RequestMapping(value = "/myScore", method=RequestMethod.GET)
	public void myScore(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession();
		UserVO uVo = (UserVO) session.getAttribute("login");
		int userNo = uVo.getUserNo();
		
		model.addAttribute(ApplyService.esSelect(userNo));
		model.addAttribute("acceptList", ApplyService.acceptList(userNo));
	}
	
	// 5. 내 목표 - 리스트
	@RequestMapping(value = "/myGoal", method = RequestMethod.GET)
	public void myGoal(Model model, HttpServletRequest request) throws Exception{
		logger.info("myGoal page....");
		
		HttpSession session = request.getSession();
		UserVO uVo = (UserVO) session.getAttribute("login");
		int userNo = uVo.getUserNo();
		
		model.addAttribute("goalList", service.goalList(userNo));
		
	}
	
	// 6. 내 목표 - 등록 페이지
	@RequestMapping(value = "/myGoalRegister", method = RequestMethod.GET)
	public void myGoalRegisterGET() throws Exception {
		logger.info("myGoal RegisterGET.....");
	}
	
	@RequestMapping(value = "/myGoalRegister", method = RequestMethod.POST)
	public String myGoalRegisterPOST(GoalVO gVo, RedirectAttributes rttr) throws Exception {
		logger.info("myGoal RegisterPOST.....");
		
		service.goalInsert(gVo);
		
		rttr.addFlashAttribute("msg", "처리가 완료되었습니다.");
		
		return "redirect:/user/mypage/myGoal";
	}
	
	@RequestMapping(value = "/myGoalRead", method = RequestMethod.GET)
	public void myGoalRead(@RequestParam("goalNo") int goalNo, Model model) throws Exception {
		
		logger.info("myGoalRead.....");
		model.addAttribute(service.goalRead(goalNo));
		
	}
	
	
}
