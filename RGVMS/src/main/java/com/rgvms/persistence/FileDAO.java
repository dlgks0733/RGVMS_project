package com.rgvms.persistence;

import com.rgvms.domain.FileVO;

public interface FileDAO {

	// 1. ���� ���ε�
	public void insert(FileVO fVo) throws Exception;
	
	// 2. ���� ����
	public void delete(FileVO fVo) throws Exception;
	
	// 3. ���� �ٿ�ε�
	
}
