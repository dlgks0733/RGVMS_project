package com.rgvms.service;

import java.util.List;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.UserVO;
import com.rgvms.dto.LoginDTO;
import com.rgvms.dto.TotalDTO;

public interface UserService {

	public UserVO login(LoginDTO dto) throws Exception;

	// 2. 관리자 :: 기초정보관리 - 학생 등록
	public void register(UserVO uVo) throws Exception;

	// 3. 관리자 :: 학생 목록
	public List<UserVO> list(SearchCriteria cri) throws Exception;

	// 4. 리스트 카운트
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	// 5. 관리자 :: 기초정보관리 - 학생상세내역
	public UserVO read(int userNo) throws Exception;

	// 6. 관리자 :: 기초정보관리 - 학생 수정
	public void modify(UserVO uVo) throws Exception;

	// 7. 관리자 :: 기초정보관리 - 학생 삭제
	public void remove(int userNo) throws Exception;

	// 8. MY PAGE - 내 점수(MIS 총점)
	public TotalDTO misTotal(int userNo) throws Exception;

	// 9. MY PAGE - 내 점수(인증항목 총점)
	public TotalDTO subTotal(int userNo) throws Exception;

	// 10. MY PAGE - 내 정보
	public UserVO myInfo(int userNo) throws Exception;

	// 11 . MY PAGE - 내 정보 수정
	public void myInfoModify(UserVO uVo) throws Exception;

}
