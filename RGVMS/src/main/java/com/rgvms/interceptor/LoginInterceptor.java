package com.rgvms.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

   private static final String LOGIN = "login";
   private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

   // UserVO 객체 확인(로그인 가능한지 아닌지) 후 HttpSession 저장   
   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
         ModelAndView modelAndView) throws Exception {

      HttpSession session = request.getSession();

      ModelMap modelMap = modelAndView.getModelMap();
      Object userVO = modelMap.get("userVO");

      if (userVO != null) {

         logger.info("new login success");
         session.setAttribute(LOGIN, userVO);
         // response.sendRedirect("/");

         // 사용자가 로그인 전에 보고 있던 경로 = dest
         Object dest = session.getAttribute("dest");

         response.sendRedirect(dest != null ? (String) dest : "/review/list");
      }
   }

   // HttpSession 초기화
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
         throws Exception {

      HttpSession session = request.getSession();

      if (session.getAttribute(LOGIN) != null) {
         logger.info("clear login data before");
         session.removeAttribute(LOGIN);
      }

      return true;
   }

   

}