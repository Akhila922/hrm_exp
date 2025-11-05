package com.cg.hrms.entity;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "locations")
public class Locations {

    @Id
    @Column(name = "location_id")
    private Long id;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state_province")
    private String stateProvince;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Departments> departments;
    
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries country;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getStateProvince() { return stateProvince; }
    public void setStateProvince(String stateProvince) { this.stateProvince = stateProvince; }

    public List<Departments> getDepartments() { return departments; }
    public void setDepartments(List<Departments> departments) { this.departments = departments; }
}