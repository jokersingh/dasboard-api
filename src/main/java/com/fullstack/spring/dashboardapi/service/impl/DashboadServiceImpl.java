package com.fullstack.spring.dashboardapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.spring.dashboardapi.model.TableData;
import com.fullstack.spring.dashboardapi.repo.FileDetailRepo;
import com.fullstack.spring.dashboardapi.repo.HeaderRepo;
import com.fullstack.spring.dashboardapi.service.DashboadService;

@Service("dashboadService")
public class DashboadServiceImpl implements DashboadService {

	@Autowired
	private FileDetailRepo fileDetailRepo;
	
	@Autowired
	private HeaderRepo headerRepo;
	
	@Override
	public TableData getTableData() {
		TableData tableData = new TableData();
		tableData.setHeaders(headerRepo.findAll());
		tableData.setFileDetails(fileDetailRepo.findAll());
		return tableData;
	}

}
