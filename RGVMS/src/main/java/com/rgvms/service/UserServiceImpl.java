package com.rgvms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.UserVO;
import com.rgvms.dto.LoginDTO;
import com.rgvms.dto.TotalDTO;
import com.rgvms.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO dao;
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {

		return dao.login(dto);
	}

	@Override
	public void register(UserVO uVo) throws Exception {
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
	public void modify(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int userNo) throws Exception {
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
	public void myInfoModify(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
