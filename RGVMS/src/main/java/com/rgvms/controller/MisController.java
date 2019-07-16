package com.rgvms.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rgvms.domain.PageMaker;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.service.MisService;

public class MisController {

	@Inject
	private MisService service;

	private static final Logger logger = LoggerFactory.getLogger(MisController.class);
	
	// 리스트 띄우기
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {

			logger.info(cri.toString());

			System.out.println("=====" + cri.toString());
			model.addAttribute("list", service.listSearchCount(cri));

			PageMaker pageMaker = new PageMaker();

			pageMaker.setCri(cri);
			pageMaker.setTotalCount(service.listSearchCount(cri));

			model.addAttribute("pageMaker", pageMaker);

		}
}
