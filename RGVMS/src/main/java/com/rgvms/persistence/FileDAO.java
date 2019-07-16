package com.rgvms.persistence;

import com.rgvms.domain.FileVO;

public interface FileDAO {

	// 1. 파일 업로드
	public void insert(FileVO fVo) throws Exception;
	
	// 2. 파일 삭제
	public void delete(FileVO fVo) throws Exception;
	
	// 3. 파일 다운로드
	
}
