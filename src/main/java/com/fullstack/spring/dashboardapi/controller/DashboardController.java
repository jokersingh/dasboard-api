package com.fullstack.spring.dashboardapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.spring.dashboardapi.model.TableData;
import com.fullstack.spring.dashboardapi.service.DashboadService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class DashboardController {

	@Autowired
	private DashboadService dashboadService;
	
	@GetMapping("/dashboard/datatable")
	public TableData getTableData() {
		return dashboadService.getTableData();
	}
	
	@GetMapping("/dashboard/chart/allfiledetails")
	public void getChartAllFileDetails() {
		
	}
	
	@GetMapping("/dashboard/chart/validationfailed")
	public void getChartValidationDetails() {
		
	}
	
	@GetMapping("/dashboard/chart/missingdetails")
	public void getChartMissingDetailsDetails() {
		
	}
}
