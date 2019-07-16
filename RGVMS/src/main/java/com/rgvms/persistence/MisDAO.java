package com.rgvms.persistence;

import java.util.List;

import com.rgvms.domain.MisVO;
import com.rgvms.domain.SearchCriteria;

public interface MisDAO {

	// 1. MIS 출결 관리 - MIS 게시물 등록
	public void insert(MisVO mVo) throws Exception;
	
	// 2. MIS 출결 관리 - MIS 게시물 목록
	public List<MisVO> list(SearchCriteria cri) throws Exception;
	
	// 3. 리스트 카운트
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	// 4. MIS 출결 관리 - MIS 게시물 삭제
	public void delete(int misNo) throws Exception;
	
	// 5. MIS 출결관리 - MIS 게시물 상세조회
	public MisVO select(int misNo) throws Exception;
	
	// 6. MIS 출결관리 - MIS 게시물 수정
	public void update(MisVO mVo) throws Exception;
	
	
	
}