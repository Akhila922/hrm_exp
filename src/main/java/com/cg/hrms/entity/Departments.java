package com.cg.hrms.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @Column(name = "department_id")
    private Long id;

    @Column(name = "department_name", nullable = false)
    private String name;

    @Column(name = "manager_id")
    private Long managerId;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "location_id")
    private Locations location;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Employees> employees;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getManagerId() { return managerId; }
    public void setManagerId(Long managerId) { this.managerId = managerId; }

    public Locations getLocation() { return location; }
    public void setLocation(Locations location) { this.location = location; }

    public List<Employees> getEmployees() { return employees; }
    public void setEmployees(List<Employees> employees) { this.employees = employees; }
}