package com.cg.hrm.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "country_id", length = 4)
    private String countryId;

    @Column(name = "country_name", length = 60)
    private String countryName;

    @Column(name = "region_id")
    private Long regionId;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Location> locations;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

    
}