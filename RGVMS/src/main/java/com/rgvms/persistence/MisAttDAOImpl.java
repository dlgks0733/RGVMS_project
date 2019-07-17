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
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list");
	}

	@Override
	public void insert(MisAttVO mVo) throws Exception {
		session.insert(namespace +  ".insert", mVo);

	}

	@Override
	public List<MisAttVO> list(int misNo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list");
	}

	@Override
	public void deleteAtt(int misNo) throws Exception {
		session.delete(namespace + ".delete", misNo);

	}

	@Override
	public List<MisAttVO> myMisList(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list");
	}

}
