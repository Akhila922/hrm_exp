package com.cg.hrms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.cg.hrms.entity.Job;
import com.cg.hrms.entity.Employee;
import com.cg.hrms.service.JobServiceVishnu;
import com.cg.hrms.service.EmployeeServiceVishnu;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobControllerVishnu {

    private final JobServiceVishnu jobService;
    private final EmployeeServiceVishnu employeeService;

    public JobControllerVishnu(JobServiceVishnu jobService, EmployeeServiceVishnu employeeService) {
        this.jobService = jobService;
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{jobId}/employees")
    public List<Employee> getEmployeesByJob(@PathVariable String jobId) {
        return employeeService.getEmployeesByJobId(jobId);
    }
}