package com.rgvms.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rgvms.domain.MisVO;
import com.rgvms.domain.SearchCriteria;

@Repository
public class MisDAOImpl implements MisDAO{

	@Override
	public void insert(MisVO mVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MisVO> list(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int misNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MisVO select(int misNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MisVO mVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
