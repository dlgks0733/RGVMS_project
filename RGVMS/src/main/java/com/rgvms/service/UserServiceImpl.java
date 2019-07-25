package com.rgvms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rgvms.domain.Criteria;
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
	//1. 사용자(학생) 등록
	public void register(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(uVo);
	}

	@Override
	//2. 사용자(학생) 전체목록
	public List<UserVO> list(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(cri);
	}

	@Override
	//3. 사용자(학생) 상세내역
	public UserVO read(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(userNo);
	}
	
	@Override
	//3. 사용자(학생) 수정
	public void modify(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(uVo);
	}

	@Override
	//4. 사용자(학생) 삭제
	public void remove(int userNo) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(userNo);
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
	
	//5. 내정보 확인하기
	@Override
	public UserVO myInfo(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.myInfo(userNo);
	}

	//6. 내정보 수정하기
	@Override
	public void myInfoModify(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		dao.myInfoUpdate(uVo);
	}

	@Override
	public List<UserVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listCriteria(cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.countPaging(cri);
	}

	@Override
	public List<UserVO> listSearch(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listSearchCount(cri);
	}

	@Override
	public int applyCount() throws Exception {
		
		return dao.applyCount();
	}

	@Override
	public int graduateCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.graduateCount();
	}
	
	//7. 비밀번호 체크
	/*@Override
	public boolean checkPw(int userNo, String userPw) throws Exception {
		// TODO Auto-generated method stub
		return dao.checkPw(userNo, userPw);
	}*/

}
