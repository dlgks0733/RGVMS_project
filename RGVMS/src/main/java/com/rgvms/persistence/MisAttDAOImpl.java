package com.rgvms.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.MisAttVO;
import com.rgvms.domain.UserVO;

@Repository
public class MisAttDAOImpl implements MisAttDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.rgvms.mapper.MisAttMapper";
	
	@Override
	public List<UserVO> stuList() throws Exception {
		return session.selectList(namespace + ".stuList");
	}

	@Override
	public void insert(MisAttVO mVo) throws Exception {
		session.insert(namespace +".insert", mVo);

	}

	@Override
	public List<MisAttVO> list(int misAttNo) throws Exception {
		return session.selectList(namespace + ".list");
	}

	@Override
	public void delete(int misAttNo) throws Exception {
		session.delete(namespace + ".delete", misAttNo);

	}

	@Override
	public List<MisAttVO> myMisList(int userNo) throws Exception {
		return session.selectList(namespace + ".list");
	}

}
