package com.rgvms.persistence;

import java.util.List;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.dto.StatisticsDTO;

public interface StatisticsDAO {

	// 1. 관리자 , 학생 - 졸업인증평가관리 - 자격증 통계
	public List<StatisticsDTO> statisticsList(SearchCriteria cri) throws Exception;
	
	public int listCount(SearchCriteria cri) throws Exception;
	
	public List<StatisticsDTO> excel() throws Exception;
	
	public List<StatisticsDTO> mainList() throws Exception;
	
}
