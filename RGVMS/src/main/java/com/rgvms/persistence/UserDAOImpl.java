package com.rgvms.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.UserVO;
import com.rgvms.dto.LoginDTO;
import com.rgvms.dto.TotalDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.UserMapper";
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return session.selectOne(namespace+".login", dto);
	}

	@Override
	public void insert(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserVO> list(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TotalDTO misTotal(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TotalDTO subTotal(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO myInfo(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void myInfoUpdate(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
