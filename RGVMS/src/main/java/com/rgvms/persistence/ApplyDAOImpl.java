package com.rgvms.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.ApplyVO;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;

@Repository
public class ApplyDAOImpl implements ApplyDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.rgvms.mapper.ApplyMapper";
	
	
	@Override
	public SubjectVO searchSub(String subName) throws Exception {
		
		return session.selectOne(namespace+".searchSub", subName);
	}

	@Override
	public void insert(ApplyVO aVo) throws Exception {
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
	public ApplyVO stuApplySelect(int applyNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApplyVO> adApplyList(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<ApplyVO> waitList(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplyVO adApplySelect(int applyNo) throws Exception {
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
		return session.selectList(namespace+".subList");
	}

	

}
