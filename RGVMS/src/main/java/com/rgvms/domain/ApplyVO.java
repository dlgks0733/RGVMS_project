package com.rgvms.domain;

import java.util.Date;

/*CREATE TABLE TBL_APPLY
(
	APPLY_NO             NUMBER NOT NULL ,
	USER_NO              NUMBER NOT NULL ,
	SUB_NO               NUMBER NOT NULL ,
	APPLY_STATE          VARCHAR2(20) DEFAULT '승인대기'	NOT NULL ,
	REASON               VARCHAR2(100) NULL ,
	SERIAL_NUM           VARCHAR2(50) NULL ,
	AC_DATE              DATE NULL ,
	APPLY_DATE           DATE DEFAULT SYSDATE NOT NULL ,
	CONTENT              VARCHAR2(3000) NULL 
);*/

public class ApplyVO {

	private int applyNo;
	private int userNo;
	private int subNo;
	private String applyState;
	private String reason;
	private String serialNum;
	private Date acDate;
	private Date applyDate;
	private String content;

	public int getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(int applyNo) {
		this.applyNo = applyNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getSubNo() {
		return subNo;
	}

	public void setSubNo(int subNo) {
		this.subNo = subNo;
	}

	public String getApplyState() {
		return applyState;
	}

	public void setApplyState(String applyState) {
		this.applyState = applyState;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public Date getAcDate() {
		return acDate;
	}

	public void setAcDate(Date acDate) {
		this.acDate = acDate;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ApplyVO [applyNo=" + applyNo + ", userNo=" + userNo + ", subNo=" + subNo + ", applyState=" + applyState
				+ ", reason=" + reason + ", serialNum=" + serialNum + ", acDate=" + acDate + ", applyDate=" + applyDate
				+ ", content=" + content + "]";
	}

}