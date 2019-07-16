package com.rgvms.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;

@Repository
public class SubjectDAOImpl implements SubjectDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.rgvms.mapper.SubjectMapper";

	@Override
	//1. 인증항목 등록
	public void insert(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace +  ".insert", sVo);
	}

	@Override
	//2. 검색과 페이징이 가능한 인증항목 전체목록
	public List<SubjectVO> list(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	//4. 인증항목 상세보기
	public SubjectVO select(int subNo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".select", subNo);
	}

	@Override
	//5. 인증항목 수정
	public void update(SubjectVO sVo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace + ".update", sVo);
	}

	@Override
	//6. 인증항목 삭제
	public void delete(int subNo) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace + ".delete", subNo);
	}

	
}
