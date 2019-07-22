package com.rgvms.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<SubjectVO> searchSub(String subName) throws Exception {
		
		return session.selectList(namespace+".searchSub", subName);
	}

	@Override
	public int insert(ApplyVO aVo) throws Exception {
		session.insert(namespace+".insert", aVo);
		
		return aVo.getApplyNo();
	}

	@Override
	public List<ApplyVO> stuApplyList(int userNo, SearchCriteria cri) throws Exception {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userNo", userNo);
		paramMap.put("cri", cri);
		return session.selectList(namespace+".stuApplyList", paramMap);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		
		return session.selectOne(namespace+".listSearchCount", cri);
	}

	@Override
	public ApplyVO stuApplySelect(int applyNo) throws Exception {

		return session.selectOne(namespace+".stuApplySelect", applyNo);
	}

	@Override
	public List<ApplyVO> adApplyList(SearchCriteria cri) throws Exception {
		
		return session.selectList(namespace+".adApplyList", cri);
	}
	
	@Override
	public List<ApplyVO> waitList(SearchCriteria cri) throws Exception {
		
		return session.selectList(namespace+".waitList", cri);
	}

	@Override
	public ApplyVO adApplySelect(int applyNo) throws Exception {
		
		return session.selectOne(namespace+".adApplySelect", applyNo);
	}

	@Override
	public void accept(int applyNo, String reason) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("applyNo", applyNo);
		paramMap.put("reason", reason);
		
		session.update(namespace+".accept", paramMap);
		
	}

	@Override
	public void deny(int applyNo, String reason) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("applyNo", applyNo);
		paramMap.put("reason", reason);
		
		session.update(namespace+".deny", paramMap);
		
	}

	@Override
	public List<SubjectVO> subList() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".subList");
	}

	

}
