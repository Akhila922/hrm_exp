package com.cg.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.hrms.entity.Department;
import com.cg.hrms.repositories.DepartmentRepositoryAkhila;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/akhila/departments")
@Tag(name = "Department API - Akhila", description = "Endpoints managed by Akhila")
public class DepartmentControllerAkhila {

    @Autowired
    private DepartmentRepositoryAkhila departmentRepository;

    @Operation(summary = "Get all departments")
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Operation(summary = "Get department by ID")
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long id) {
        return departmentRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Search departments by name")
    @GetMapping("/search")
    public List<Department> searchDepartments(@RequestParam("name") String name) {
        return departmentRepository.findByDepartmentNameContainingIgnoreCase(name);
    }
}
