package com.example.sthaan_backend_work.DTO;

public class OTPVerificationDTO {
    private String sthaanId;
    private String otp;

    // Constructor
    public OTPVerificationDTO(String sthaanId, String otp) {
        this.sthaanId = sthaanId;
        this.otp = otp;
    }

    // Getters
    public String getSthaanId() {
        return sthaanId;
    }

    public String getOtp() {
        return otp;
    }

    // Setters (if needed)
    public void setSthaanId(String sthaanId) {
        this.sthaanId = sthaanId;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}