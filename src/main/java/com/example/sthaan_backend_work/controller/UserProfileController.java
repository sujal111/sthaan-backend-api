package com.example.sthaan_backend_work.controller;
//
//import com.example.microdoc.dto.UserProfileDto;
//import com.example.microdoc.model.UserProfile;
//import com.example.microdoc.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
import com.example.sthaan_backend_work.DTO.UserProfileDto;
//import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
//import com.example.sthaan_backend_work.DTO.UserProfileDto;
//import com.example.sthaan_backend_work.DTO.UserProfileRequestDTO;
import com.example.sthaan_backend_work.model.UserProfile;
import com.example.sthaan_backend_work.services.UserProfileService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user-profile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping("/create")
    public ResponseEntity<UserProfile> createUserProfile(@RequestBody UserProfileDto userProfileDto) {
        UserProfile userProfile = userProfileService.createUserProfile(userProfileDto);
        return ResponseEntity.ok(userProfile);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable String userId) {
        Optional<UserProfile> userProfile = userProfileService.getUserProfile(userId);
        return userProfile.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
//    
//    @PostMapping("/validate-contact")
//    public ResponseEntity<String> validateContact(@RequestBody UserProfileRequestDTO request) {
//        userProfileService.sendOTP(request);
//        return ResponseEntity.ok("OTP sent successfully");
//    }

    @PostMapping("/verify-otp")
    public ResponseEntity<String> verifyOTP(@RequestBody OTPVerificationDTO request) {
        boolean isVerified = userProfileService.verifyOTP(request);
        return isVerified ? ResponseEntity.ok("OTP verified") : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("OTP verification failed");
    }

}
