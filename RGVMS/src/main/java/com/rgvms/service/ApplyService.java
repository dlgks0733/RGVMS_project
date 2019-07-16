package com.rgvms.service;

import java.util.List;

import com.rgvms.domain.ApplyVO;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;

public interface ApplyService {

	// 1. 학생 :: 졸업인증신청 관리 - 항목 명 검색
	public SubjectVO searchSub(String subName) throws Exception;

	// 2. 학생 :: 졸업인증신청 관리 - 신청 등록
	public void register(ApplyVO aVo) throws Exception;

	// 3. 학생 :: 졸업인증신청 관리 - 한 학생의 신청 내역
	public List<ApplyVO> stuApplyList(int userNo, SearchCriteria cri) throws Exception;

	// 4. 리스트 카운트
	public int listSearchCount(SearchCriteria cri) throws Exception;

	// 5. 학생 :: 졸업인증신청 관리 - 신청 내역 상세조회
	public ApplyVO stuApplyRead(int applyNo) throws Exception;

	// 6. 관리자 :: 졸업인증신청 관리 - 모든 학생 신청 내역
	public List<ApplyVO> adApplyList(SearchCriteria cri) throws Exception;

	// 7. 관리자 :: 졸업인증신청 관리 - 상세조회
	public ApplyVO adApplyRead(int applyNo) throws Exception;

	// 8. 관리자 :: 졸업인증신청 관리 - 신청
	public void accept(int applyNo) throws Exception;

	// 9. 관리자 :: 졸업인증신청 관리 - 거절
	public void deny(int applyNo) throws Exception;

}
