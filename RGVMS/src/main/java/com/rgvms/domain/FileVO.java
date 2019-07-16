package com.rgvms.domain;

/*CREATE TABLE TBL_FILE
(
	FILE_NAME            VARCHAR2(100) NOT NULL ,
	FILE_NO              NUMBER NOT NULL ,
	APPLY_NO             NUMBER NOT NULL 
);*/

public class FileVO {

	private int fileNo;
	private int applyNo;
	private String fileName;

	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public int getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(int applyNo) {
		this.applyNo = applyNo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "FileVO [fileNo=" + fileNo + ", applyNo=" + applyNo + ", fileName=" + fileName + "]";
	}

}
