package com.rgvms.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.MisVO;
import com.rgvms.domain.SearchCriteria;

@Repository
public class MisDAOImpl implements MisDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.rgvms.mapper.MisMapper";

	@Override
	public Integer insert(MisVO mVo) throws Exception {
		session.insert(namespace +  ".insert", mVo);
		return mVo.getMisNo();
	}

	@Override
	public List<MisVO> list(SearchCriteria cri) throws Exception {
		return session.selectList(namespace + ".list", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	public void delete(int misNo) throws Exception {
		session.delete(namespace + ".delete", misNo);
	}

	@Override
	public MisVO select(int misNo) throws Exception {
		return session.selectOne(namespace + ".select", misNo);
	}

	@Override
	public void update(MisVO mVo) throws Exception {
		session.update(namespace + ".update", mVo);
	}

	@Override
	public MisVO read(MisVO mvo) throws Exception {
		return session.selectOne(namespace + ".read", mvo);
		
	}

}
