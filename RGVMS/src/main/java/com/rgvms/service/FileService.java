package com.rgvms.service;

import com.rgvms.domain.FileVO;

public interface FileService {

	// 1. ���� ���ε�
	public void register(FileVO fVo) throws Exception;

	// 2. ���� ����
	public void remove(FileVO fVo) throws Exception;

}
