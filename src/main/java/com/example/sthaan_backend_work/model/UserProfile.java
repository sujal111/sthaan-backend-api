package com.example.sthaan_backend_work.model;

import lombok.Data;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_profiles")
@Data
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String phoneNumber;
    private String email;
    private String availability;
    private String instructions;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String geocode;
    private String landmark;
    private String voiceNote;
    private String image;
    
    
    //Adding extra stuff and otp
    private String contactInfo;
    private String otp;
    
    
   
    private LocalDateTime otpExpiration;
    
    // Getters and Setters
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public LocalDateTime getOtpExpiration() {
        return otpExpiration;
    }

    public void setOtpExpiration(LocalDateTime otpExpiration) {
        this.otpExpiration = otpExpiration;
    }
}
