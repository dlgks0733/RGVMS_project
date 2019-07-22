package com.rgvms.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rgvms.domain.ApplyVO;
import com.rgvms.domain.FileVO;
import com.rgvms.domain.SearchCriteria;
import com.rgvms.domain.SubjectVO;
import com.rgvms.persistence.ApplyDAO;
import com.rgvms.persistence.FileDAO;

@Service
public class ApplyServiceImpl implements ApplyService {

	@Inject
	ApplyDAO dao;
	
	@Inject
	FileDAO fDao;
	
	@Override
	public List<SubjectVO> searchSub(String subName) throws Exception {
		// TODO Auto-generated method stub
		return dao.searchSub(subName);
	}

	@Override
	public void register(ApplyVO aVo) throws Exception {
		// 1. 텍스트에어리어 줄바꿈 적용
		aVo.setContent(aVo.getContent().replace("\\r\\n", "<br>"));
		
		// 2. 기본 신청 내역 등록 (파일 등록 x) -> 등록된 신청내역의 PK 가져오기
		int applyNo = dao.insert(aVo);
		System.out.println("applyNo =====> " + applyNo);
		
		// 4. 추가 이미지 존재 여부 IF문
	      if (aVo.getFiles() != null) {

	         // 4. 추가 이미지 저장 FOR문
	         for (int i = 0; i < aVo.getFiles().length; i++) {

	            // 4-1.추가 이미지 저장

	            FileVO fVo = new FileVO();
	            fVo.setApplyNo(applyNo);
	            fVo.setFileName(aVo.getFiles()[i]);

	            System.out.println("fVo : " + fVo.toString());

	            // 4-2.추가 이미지 저장
	            fDao.insert(fVo);

	         }
	      }
	}

	@Override
	public List<ApplyVO> stuApplyList(int userNo, SearchCriteria cri) throws Exception {
		
		return dao.stuApplyList(userNo, cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return dao.listSearchCount(cri);
	}

	@Override
	public ApplyVO stuApplyRead(int applyNo) throws Exception {

		return dao.stuApplySelect(applyNo);
	}

	@Override
	public List<ApplyVO> adApplyList(SearchCriteria cri) throws Exception {

		return dao.adApplyList(cri);
	}

	@Override
	public ApplyVO adApplyRead(int applyNo) throws Exception {
		
		return dao.adApplySelect(applyNo);
	}

	@Override
	public void accept(int applyNo, String reason) throws Exception {
		dao.accept(applyNo, reason);
		
	}

	@Override
	public void deny(int applyNo, String reason) throws Exception {
		dao.deny(applyNo, reason);
		
	}

	@Override
	public List<SubjectVO> subList() throws Exception {
		// TODO Auto-generated method stub
		return dao.subList();
	}

	@Override
	public List<ApplyVO> waitList(SearchCriteria cri) throws Exception {
		
		return dao.waitList(cri);
	}

	@Override
	public List<FileVO> fileList(int applyNo) throws Exception {
		
		return fDao.list(applyNo);
	}
	
	

}
