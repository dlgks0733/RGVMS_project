package com.rgvms.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rgvms.domain.UserVO;
import com.rgvms.dto.LoginDTO;
import com.rgvms.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Inject
	private UserService service;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(@RequestParam("auth") int auth) throws Exception {

		if (auth == 1) {// 관리자 이동

			logger.info("user/NewFile2");
			return "user/NewFile2";

		} else {

			// 기본 사용자 이동
			logger.info("user/NewFile");
			return "user/NewFile";
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto) throws Exception {

		logger.info("login Page........");

	}

	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public String loginPost(LoginDTO dto, HttpSession session, Model model, RedirectAttributes rttr) throws Exception {

		UserVO uVo = service.login(dto);

		if (uVo == null) {
			rttr.addFlashAttribute("msg", "fail");
			return "redirect:/login";
		}

		logger.info("UserVO : " + uVo.toString());

		model.addAttribute("uVo", uVo);

		return "loginPost";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {

		Object obj = session.getAttribute("login");

		if (obj != null) {
			logger.info("logout: session.invalidate() ");

			session.removeAttribute("login");
			session.invalidate();

		}

		return "redirect:/login";
	}

//	@RequestMapping(value = "/loginAuth", method = RequestMethod.GET)
//	public String usermain(@RequestParam("authority") String authority) {
//		logger.info("UserMain");
//
//		if (authority.equals("1"))// 관리자
//		{
//			logger.info("adminmain...........");
//			return "adminmain";
//
//		} else {// 사용자
//
//			logger.info("usermain............");
//			return "usermain";
//		}
//
//	}
	
	@RequestMapping(value = "/loginAuth", method = RequestMethod.GET)
	public String usermain(@ModelAttribute("userVO") UserVO uVo) {
		logger.info("UserMain");
		logger.info(uVo.toString());

		if (uVo.getAuthority().equals("1"))// 관리자
		{
			logger.info("adminmain...........");
			return "adminmain";

		} else {// 사용자

			logger.info("usermain............");
			return "usermain";
		}

	}

}
