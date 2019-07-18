package com.rgvms.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rgvms.service.MisAttService;

@Controller
@RequestMapping("/misAtt/*")


public class MisAttController {

	@Inject
	private MisAttService service;

	private static final Logger logger = LoggerFactory.getLogger(MisAttController.class);
}
