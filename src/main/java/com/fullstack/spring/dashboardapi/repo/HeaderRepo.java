package com.fullstack.spring.dashboardapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.spring.dashboardapi.model.Header;

@Repository("headerRepo")
public interface HeaderRepo extends JpaRepository<Header, Long> {

}
