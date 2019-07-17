package com.rgvms.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rgvms.persistence.ApplyDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class ApplyDAOTest {

	@Inject
	private ApplyDAO dao;
	private static Logger logger = LoggerFactory.getLogger(ApplyDAOTest.class);

	// public void searchSub() throws Exception {
	// String subName = "정보처리기사";
	// logger.info("searchSub : " + dao.searchSub(subName).toString());
	//
	// }

	@Test
	public void subList() throws Exception {
		logger.info("subList : " + dao.subList().toString());
	}
	
	@Test
	public void searchSub() throws Exception {
		String subName = "정보처리기사";
		logger.info("searchSub : " + dao.searchSub(subName).toString());
	}

}
