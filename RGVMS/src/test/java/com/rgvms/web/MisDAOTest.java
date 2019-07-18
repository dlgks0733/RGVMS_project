package com.rgvms.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rgvms.domain.MisVO;
import com.rgvms.persistence.MisDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MisDAOTest {
	
	@Inject
	private MisDAO dao;
	private static Logger logger = LoggerFactory.getLogger(MisDAOTest.class);
	
	/*@Test
	public void insert() throws Exception {

		MisVO mis = new MisVO();
		
		mis.setTitle("새로운 글을 넣습니다");
		mis.setTimes(1);
		
		dao.insert(mis);
	}*/
	
	
	@Test public void delete() throws Exception {
		dao.delete(4);
		
		
	}
	
}
