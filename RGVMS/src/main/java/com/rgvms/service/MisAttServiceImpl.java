package com.rgvms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rgvms.domain.MisAttVO;
import com.rgvms.domain.UserVO;
import com.rgvms.persistence.MisAttDAO;

@Service
public class MisAttServiceImpl implements MisAttService {

	@Inject
	private MisAttDAO dao;

	@Override
	public List<UserVO> stuList() throws Exception {
		return null;
	}

	@Override
	public void register(MisAttVO mVo) throws Exception {

	}

	@Override
	public List<MisAttVO> list(int misNo) throws Exception {
		return null;
	}

	@Override
	public void removeAtt(int misNo) throws Exception {

	}

	@Override
	public List<MisAttVO> myMisList(int userNo) throws Exception {
		return null;
	}

}
