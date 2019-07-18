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
	//1. 인증항목 등록
	public void register(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(sVo);
	}

	@Override
	//2. 인증항목 전체목록
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
	//3. 인증항목 상세내역
	public SubjectVO read(int subNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(subNo);
	}

	@Override
	//4. 인증항목 수정
	public void modify(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(sVo);
	}

	@Override
	//5. 인증항목 삭제
	public void remove(int subNo) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(subNo);
	}

}
