package com.rgvms.service;

import com.rgvms.domain.FileVO;

public interface FileService {

	// 1. 파일 업로드
	public void register(FileVO fVo) throws Exception;

	// 2. 파일 삭제
	public void remove(FileVO fVo) throws Exception;

}
