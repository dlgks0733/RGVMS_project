package com.rgvms.service;

import java.util.List;

import com.rgvms.domain.MisVO;
import com.rgvms.domain.SearchCriteria;

public interface MisService {

	// 1. MIS 출결 관리 - MIS 게시물 등록
	public Integer register(MisVO mVo) throws Exception;

	// 2. MIS 출결 관리 - MIS 게시물 목록
	public List<MisVO> list(SearchCriteria cri) throws Exception;

	// 3. 리스트 카운트
	public int listSearchCount(SearchCriteria cri) throws Exception;

	// 4. MIS 출결 관리 - MIS 게시물 삭제
	public void remove(int misNo) throws Exception;

	// 5. MIS 출결관리 - MIS 게시물 상세조회
	public MisVO read(int misNo) throws Exception;

	// 6. MIS 출결관리 - MIS 게시물 수정
	public void modify(MisVO mVo) throws Exception;

	//7. MIS 출결관리 - 상세정보
	public MisVO read(MisVO mvo) throws Exception;
}
