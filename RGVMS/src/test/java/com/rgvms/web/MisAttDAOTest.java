package com.rgvms.web;

import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rgvms.domain.MisAttVO;
import com.rgvms.persistence.MisAttDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MisAttDAOTest {
	
	@Inject
	private MisAttDAO dao;
	private static Logger logger = LoggerFactory.getLogger(MisAttDAOTest.class);
	/*
	@Test
	public void insert() throws Exception {

		MisAttVO mis = new MisAttVO();
		Date date = new Date(19/07/17);
//		date.setYear(2019);
//		date.setMonth(7);
//		date.setDate(17);
		
		mis.setMisAttDate(date);
		mis.setUserNo(20152511);
		mis.setMisNo(1);
		
		
		dao.insert(mis);
	}
	*/
	
	@Test
	public void delete() throws Exception {
		dao.delete(5);
	}

}
