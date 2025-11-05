package com.cg.task.entity;

import jakarta.persistence.*;
import java.util.Date;
 
@Entity
@Table(name = "job_history")
@IdClass(JobHistoryId.class)
public class JobHistory {
 
    @Id
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;
 
    @Id
    @Column(name = "start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;
 
    @Column(name = "end_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date endDate;
 
    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Jobs job;
 
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department;
 
    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employees employee;
 
    // Getters and Setters
 
    public Long getEmployeeId() {
        return employeeId;
    }
 
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
 
    public Date getStartDate() {
        return startDate;
    }
 
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
 
    public Date getEndDate() {
        return endDate;
    }
 
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
 
    public Jobs getJob() {
        return job;
    }
 
    public void setJob(Jobs job) {
        this.job = job;
    }
 
    public Departments getDepartment() {
        return department;
    }
 
    public void setDepartment(Departments department) {
        this.department = department;
    }
 
    public Employees getEmployee() {
        return employee;
    }
 
    public void setEmployee(Employees employee) {
        this.employee = employee;
    }
}