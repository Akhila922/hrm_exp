package com.cg.hrms.entity;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "countries")
public class Countries {

    @Id
    @Column(name = "country_id", length = 4)
    private String id;

    @Column(name = "country_name", length = 60)
    private String name;

    @Column(name = "region_id")
    private Long regionId; 

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Locations> locations;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getRegionId() { return regionId; }
    public void setRegionId(Long regionId) { this.regionId = regionId; }

    public List<Locations> getLocations() { return locations; }
    public void setLocations(List<Locations> locations) { this.locations = locations; }
}