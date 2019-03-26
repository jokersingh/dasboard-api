package com.fullstack.spring.dashboardapi.model;

import java.io.Serializable;
import java.util.List;

public class TableData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7527937591350589876L;
	
	private List<Header> headers;
	private List<FileDetail> fileDetails;
	
	public List<Header> getHeaders() {
		return headers;
	}
	public void setHeaders(List<Header> headers) {
		this.headers = headers;
	}
	public List<FileDetail> getFileDetails() {
		return fileDetails;
	}
	public void setFileDetails(List<FileDetail> fileDetails) {
		this.fileDetails = fileDetails;
	}
	
	
}
