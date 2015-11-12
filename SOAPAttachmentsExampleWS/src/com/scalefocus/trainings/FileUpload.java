package com.scalefocus.trainings;

import javax.activation.DataHandler;

public class FileUpload {

	private String fileName;
	private String fileType;
	private DataHandler fileData;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public DataHandler getFileData() {
		return fileData;
	}
	public void setFileData(DataHandler fileData) {
		this.fileData = fileData;
	}
	
	
 	
}
