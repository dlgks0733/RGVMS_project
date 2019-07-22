package com.rgvms.persistence;

import java.util.List;

import com.rgvms.domain.FileVO;

public interface FileDAO {

	// 1. ���� ���ε�
	public void insert(FileVO fVo) throws Exception;
	
	// 2. ���� ����
	public void delete(FileVO fVo) throws Exception;
	
	// 3. 파일 목록
	public List<FileVO> list(int applyNo) throws Exception;
	
}
