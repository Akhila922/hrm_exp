
package com.cg.practicedb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "department_id")

    private Department department;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}

