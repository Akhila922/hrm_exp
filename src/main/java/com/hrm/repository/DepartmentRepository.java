package com.hrm.repository;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrm.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, BigDecimal> {
	
	List<Department> findByDepartmentNameContainingIgnoreCase(String name);
}
