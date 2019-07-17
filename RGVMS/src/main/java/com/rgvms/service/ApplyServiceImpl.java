package com.rgvms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rgvms.domain.ApplyVO;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.persistence.ApplyDAO;

@Service
public class ApplyServiceImpl implements ApplyService {

	@Inject
	ApplyDAO dao;
	
	@Override
	public SubjectVO searchSub(String subName) throws Exception {
		// TODO Auto-generated method stub
		return dao.searchSub(subName);
	}

	@Override
	public void register(ApplyVO aVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ApplyVO> stuApplyList(int userNo, SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ApplyVO stuApplyRead(int applyNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApplyVO> adApplyList(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplyVO adApplyRead(int applyNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(int applyNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deny(int applyNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubjectVO> subList() throws Exception {
		// TODO Auto-generated method stub
		return dao.subList();
	}
	
	

}
