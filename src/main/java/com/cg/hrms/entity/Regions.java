package com.cg.hrms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "regions")
public class Regions {

    @Id
    @Column(name = "region_id", nullable = false)
    private Long regionId;

    @Column(name = "region_name", length = 25)
    private String regionName;

    public Regions() {}

    public Regions(Long regionId, String regionName) {
        this.regionId = regionId;
        this.regionName = regionName;
    }

    // Getters and Setters
    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return "Regions{" +
                "regionId=" + regionId +
                ", regionName='" + regionName + '\'' +
                '}';
    }
}