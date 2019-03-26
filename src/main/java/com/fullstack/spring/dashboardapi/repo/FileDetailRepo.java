package com.fullstack.spring.dashboardapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.spring.dashboardapi.model.FileDetail;

@Repository("fileDetailRepo")
public interface FileDetailRepo extends JpaRepository<FileDetail, Long> {

}
