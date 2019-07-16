package com.rgvms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.persistence.SubjectDAO;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Inject
	private SubjectDAO dao;

	@Override
	public void register(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(sVo);
	}

	@Override
	public List<SubjectVO> list(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listSearchCount(cri);
	}

	@Override
	public SubjectVO read(int subNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(subNo);
	}

	@Override
	public void modify(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(sVo);
	}

	@Override
	public void remove(int subNo) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(subNo);
	}

}
