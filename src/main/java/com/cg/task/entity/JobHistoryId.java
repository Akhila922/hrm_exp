package com.cg.task.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
 
public class JobHistoryId implements Serializable {
 
    private Long employeeId;
    private Date startDate;
 
    // Constructors
    public JobHistoryId() {}
 
    public JobHistoryId(Long employeeId, Date startDate) {
        this.employeeId = employeeId;
        this.startDate = startDate;
    }
 
    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobHistoryId)) return false;
        JobHistoryId that = (JobHistoryId) o;
        return Objects.equals(employeeId, that.employeeId) &&
               Objects.equals(startDate, that.startDate);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(employeeId, startDate);
    }
}