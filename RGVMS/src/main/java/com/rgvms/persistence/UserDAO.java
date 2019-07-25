package com.rgvms.persistence;

import java.util.List;

import com.rgvms.domain.Criteria;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.UserVO;
import com.rgvms.dto.LoginDTO;
import com.rgvms.dto.TotalDTO;

public interface UserDAO {
	// 1. 로그인
	public UserVO login(LoginDTO dto) throws Exception;

	// 2. 관리자 :: 기초정보관리 - 학생 등록
	public void insert(UserVO uVo) throws Exception;

	// 3. 관리자 :: 학생 목록
	public List<UserVO> list(SearchCriteria cri) throws Exception;
	
	// 4. 관리자 :: 기초정보관리 - 학생상세내역
	public UserVO read(int userNo) throws Exception;

	// 5. 관리자 :: 기초정보관리 - 학생 수정
	public void update(UserVO uVo) throws Exception;

	// 6. 관리자 :: 기초정보관리 - 학생 삭제
	public void delete(int userNo) throws Exception;

	// 7. MY PAGE - 내 점수(MIS 총점)
	public TotalDTO misTotal(int userNo) throws Exception;

	// 8. MY PAGE - 내 점수(인증항목 총점)
	public TotalDTO subTotal(int userNo) throws Exception;

	// 9. MY PAGE - 내 정보
	public UserVO myInfo(int userNo) throws Exception;

	// 10 . MY PAGE - 내 정보 수정
	public void myInfoUpdate(UserVO uVo) throws Exception;
	
	// 11. MY PAGE - 비밀번호 체크
	//public boolean checkPw(int userNo, String userPw) throws Exception;

	// 11. 관리자 :: 졸업인증평가 관리 - 목록
	public List<TotalDTO> esList(int userNo) throws Exception;
	
	// 12. 페이징처리
	public List<UserVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;
	
	// 13. 검색처리
	public List<UserVO> listSearch(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	// 14. 관리자 :: 대시보드 - 신청 건수
	public int applyCount() throws Exception;
	
	// 15. 관리자 :: 대시보드 - 졸업예정자 수
	public int graduateCount() throws Exception;

}
