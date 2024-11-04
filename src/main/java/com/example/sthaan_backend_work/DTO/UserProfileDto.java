package com.example.sthaan_backend_work.DTO;



import lombok.Data;

@Data
public class UserProfileDto {
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
    
    
   
}
