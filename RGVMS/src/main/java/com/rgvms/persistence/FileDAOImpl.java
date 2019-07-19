package com.rgvms.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rgvms.domain.FileVO;

@Repository
public class FileDAOImpl implements FileDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.rgvms.mapper.ApplyMapper";
	
	@Override
	public void insert(FileVO fVo) throws Exception {
		session.insert(namespace+".insertFiles", fVo);
	}

	@Override
	public void delete(FileVO fVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
