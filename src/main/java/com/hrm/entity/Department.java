package com.hrm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import java.math.BigDecimal;

import java.util.List;
 
@Entity

@Table(name = "departments")

public class Department {

    @Column(name = "department_id", columnDefinition = "DECIMAL(4,0)", insertable = false, updatable = false)

    private BigDecimal departmentIdDecimal;
 

    @Id

    @Column(name = "department_id")

    private Long id;
 

    @Column(name = "department_name")

    private String departmentName;
 

    @Column(name = "department_name", nullable = false, insertable = false, updatable = false)

    private String name;

    @ManyToOne

    @JsonIgnore

    @JoinColumn(name = "manager_id", insertable = false, updatable = false)

    private Employee manager;

    @Column(name = "manager_id")

    private Long managerId;

    @ManyToOne

    @JsonIgnore

    @JoinColumn(name = "location_id")

    private Location location;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)

    @JsonIgnore

    private List<Employee> employees;
 
    public BigDecimal getDepartmentIdDecimal() {

        return departmentIdDecimal;

    }
 
    public void setDepartmentIdDecimal(BigDecimal departmentIdDecimal) {

        this.departmentIdDecimal = departmentIdDecimal;

    }
 
    public Long getId() {

        return id;

    }
 
    public void setId(Long id) {

        this.id = id;

    }
 
    public String getDepartmentName() {

        return departmentName;

    }
 
    public void setDepartmentName(String departmentName) {

        this.departmentName = departmentName;

    }
 
    public String getName() {

        return name;

    }
 
    public void setName(String name) {

        this.name = name;

    }
 
    public Employee getManager() {

        return manager;

    }
 
    public void setManager(Employee manager) {

        this.manager = manager;

    }
 
    public Long getManagerId() {

        return managerId;

    }
 
    public void setManagerId(Long managerId) {

        this.managerId = managerId;

    }
 
    public Location getLocation() {

        return location;

    }
 
    public void setLocation(Location location) {

        this.location = location;

    }
 
    public List<Employee> getEmployees() {

        return employees;

    }
 
    public void setEmployees(List<Employee> employees) {

        this.employees = employees;

    }

}
 