package com.rgvms.persistence;

import java.util.List;

import com.rgvms.domain.Criteria;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.domain.UserVO;

public interface SubjectDAO {

   // 1. 기초정보관리 - 인증항목 등록
   public void insert(SubjectVO sVo) throws Exception;
   
   // 2. 기초정보관리 - 인증항목 전체목록
   public List<SubjectVO> list(SearchCriteria cri) throws Exception;
   
   // 3. 리스트 카운트
   public int listSearchCount(SearchCriteria cri) throws Exception;
   
   // 4. 기초정보관리 - 인증항목 상세보기 
   public SubjectVO select(int subNo) throws Exception;
   
   // 5. 기초정보관리 - 인증항목  수정
   public void update(SubjectVO sVo) throws Exception;
   
   // 6. 기초정보관리 - 인증항목 삭제
   public void delete(int subNo) throws Exception;
   
   // 7. 페이징처리
   public List<UserVO> listCriteria(Criteria cri) throws Exception;
	
   public int countPaging(Criteria cri) throws Exception;
   
}