package com.rgvms.controller;

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

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.service.ApplyService;

@Controller
@RequestMapping("admin/apply/*")
public class AdminApplyContorller {

	@Inject
	private ApplyService service;
	
	private static Logger logger = LoggerFactory.getLogger(AdminApplyContorller.class);
	
	
	
}
