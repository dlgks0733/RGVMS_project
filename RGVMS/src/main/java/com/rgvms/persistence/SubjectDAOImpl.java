package com.rgvms.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;

@Repository
public class SubjectDAOImpl implements SubjectDAO {

	@Override
	public void insert(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubjectVO> list(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SubjectVO select(int subNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int subNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
