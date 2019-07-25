package com.rgvms.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.Criteria;
import com.rgvms.domain.MisVO;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.UserVO;
import com.rgvms.dto.LoginDTO;
import com.rgvms.dto.TotalDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.rgvms.mapper.UserMapper";
	private static String namespaceMyPage = "com.rgvms.mapper.MyPageMapper";
	
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
	//2. 사용자(학생) 목록
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
	
	//8. 사용자 내정보 확인
	@Override
	public UserVO myInfo(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespaceMyPage + ".myInfo", userNo);
	}
	
	//9. 사용자 내정보 수정하기(비밀번호 수정가능)
	@Override
	public void myInfoUpdate(UserVO uVo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespaceMyPage + ".myInfoUpdate", uVo);
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
	// 검색과 페이징이 포함된 리스트 띄우기(SearchCriteria와 Criteria)
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

	@Override
	public int applyCount() throws Exception {
		
		return session.selectOne(namespace+".applyCount");
	}

	@Override
	public int graduateCount() throws Exception {
		
		return session.selectOne(namespace+".graduateCount");
	}

	@Override
	public int graduateToBeCount() throws Exception {
		
		return session.selectOne(namespace+".graduateToBeCount");
	}

	@Override
	public List<MisVO> misInfo() throws Exception {
		
		return session.selectList(namespace+".misInfo");
	}
	
	// 13. 비밀번호 체크
	/*@Override
	public boolean checkPw(int userNo, String userPw) throws Exception {
		// TODO Auto-generated method stub
		
		boolean result = false;
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(userNo, "userNo");
		map.put("userPw", userPw);
		
		int count = session.selectOne(namespace + ".checkPw");
		if(count == 1) {
			result = true;
		}

		return result;
	}*/

}
