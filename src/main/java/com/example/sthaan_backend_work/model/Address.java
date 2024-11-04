package com.example.sthaan_backend_work.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Address {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String sthaanId;
//    private boolean isPublic;
//    private String addressDetails;
//    // Getters, Setters
//}



@Entity
public class Address {
    @Id
    private Long id;
    private String sthaanId;
    private String street;
    private String city;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSthaanId() {
        return sthaanId;
    }

    public void setSthaanId(String sthaanId) {
        this.sthaanId = sthaanId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}