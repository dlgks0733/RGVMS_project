package com.rgvms.domain;

import java.util.Date;

/*CREATE TABLE TBL_MIS_ATT
(
	MIS_ATT_NO           NUMBER NOT NULL ,
	MIS_ATT_DATE         DATE NOT NULL ,
	USER_NO              NUMBER NOT NULL ,
	MIS_NO               NUMBER NOT NULL 
);*/

public class MisAttVO {

	private int misAttNo;
	private Date misAttDate;
	private int userNo;
	private int misNo;

	public int getMisAttNo() {
		return misAttNo;
	}

	public void setMisAttNo(int misAttNo) {
		this.misAttNo = misAttNo;
	}

	public Date getMisAttDate() {
		return misAttDate;
	}

	public void setMisAttDate(Date misAttDate) {
		this.misAttDate = misAttDate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getMisNo() {
		return misNo;
	}

	public void setMisNo(int misNo) {
		this.misNo = misNo;
	}

	@Override
	public String toString() {
		return "MisAttVO [misAttNo=" + misAttNo + ", misAttDate=" + misAttDate + ", userNo=" + userNo + ", misNo="
				+ misNo + "]";
	}

}
