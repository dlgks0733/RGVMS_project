package com.rgvms.service;

import java.util.List;

import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;

public interface SubjectService {

	// 1. 기초정보관리 - 인증항목 등록
		public void register(SubjectVO sVo) throws Exception;
		
		// 2. 기초정보관리 - 인증항목 목록
		public List<SubjectVO> list(SearchCriteria cri) throws Exception;
		
		// 3. 리스트 카운트
		public int listSearchCount(SearchCriteria cri) throws Exception;
		
		// 4. 기초정보관리 - 인증항목 상세보기
		public SubjectVO read(int subNo) throws Exception;
		
		// 5. 기초정보관리 - 인증항목  수정
		public void modify(SubjectVO sVo) throws Exception;
		
		// 6. 기초정보관리 - 인증항목 삭제
		public void remove(int subNo) throws Exception;
	
}
