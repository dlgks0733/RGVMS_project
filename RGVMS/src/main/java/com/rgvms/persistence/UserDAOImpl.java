package com.rgvms.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.Criteria;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.UserVO;
import com.rgvms.dto.LoginDTO;
import com.rgvms.dto.TotalDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.rgvms.mapper.UserMapper";
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		
		return session.selectOne(namespace+".login", dto);
	}

	@Override
	//1. 사용자(학생) 등록
	public void insert(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		
		session.selectOne(namespace + ".insert", uVo);
	}

	@Override
	//2. 검색과 페이징이 가능한 사용자(학생) 목록
	public List<UserVO> list(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list", cri);
	}

	//3. 사용자(학생) 상세내역
	@Override
	public UserVO read(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", userNo);
	}
	
	@Override
	//4. 사용자(학생) 수정
	public void update(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace + ".update", uVo);
	}

	@Override
	//5. 사용자(학생) 삭제
	public void delete(int userNo) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace + ".delete", userNo);
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

	@Override
	public List<TotalDTO> esList(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	// 11. 페이징처리
	@Override
	public List<UserVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".countPaging", cri);
	}
	
	// 12. 검색처리
	@Override
	public List<UserVO> listSearch(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

}
