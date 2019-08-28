package com.rgvms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.dto.StatisticsDTO;
import com.rgvms.persistence.StatisticsDAO;

@Service
public class StatisticsServiceImpl implements StatisticsService {

	@Inject
	private StatisticsDAO dao;
	
	@Override
	public List<StatisticsDTO> statisticsList(SearchCriteria cri) throws Exception {
		
		return dao.statisticsList(cri);
	}

	@Override
	public int listCount(SearchCriteria cri) throws Exception {
		
		return dao.listCount(cri);
	}

	@Override
	public List<StatisticsDTO> excel() throws Exception {
		
		return dao.excel();
	}

	@Override
	public List<StatisticsDTO> mainList() throws Exception {
		
		return dao.mainList();
	}

}
