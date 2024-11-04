package com.example.sthaan_backend_work.services;

//import com.example.microdoc.dto.UserProfileDto;
//import com.example.microdoc.model.UserProfile;
//import com.example.microdoc.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
import com.example.sthaan_backend_work.DTO.UserProfileDto;
import com.example.sthaan_backend_work.model.UserProfile;
//import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
//import com.example.sthaan_backend_work.DTO.UserProfileDto;
//import com.example.sthaan_backend_work.DTO.UserProfileRequestDTO;
//import com.example.sthaan_backend_work.model.UserProfile;
import com.example.sthaan_backend_work.repository.UserProfileRepository;

import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public UserProfile createUserProfile(UserProfileDto userProfileDto) {
        UserProfile userProfile = new UserProfile();
        // Map DTO to Entity
        userProfile.setUserId(userProfileDto.getUserId());
        userProfile.setPhoneNumber(userProfileDto.getPhoneNumber());
        userProfile.setEmail(userProfileDto.getEmail());
        userProfile.setAvailability(userProfileDto.getAvailability());
        userProfile.setInstructions(userProfileDto.getInstructions());
        userProfile.setAddressLine1(userProfileDto.getAddressLine1());
        userProfile.setAddressLine2(userProfileDto.getAddressLine2());
        userProfile.setCity(userProfileDto.getCity());
        userProfile.setState(userProfileDto.getState());
        userProfile.setPostalCode(userProfileDto.getPostalCode());
        userProfile.setCountry(userProfileDto.getCountry());
        userProfile.setGeocode(userProfileDto.getGeocode());
        userProfile.setLandmark(userProfileDto.getLandmark());
        userProfile.setVoiceNote(userProfileDto.getVoiceNote());
        userProfile.setImage(userProfileDto.getImage());

        return userProfileRepository.save(userProfile);
    }

    public Optional<UserProfile> getUserProfile(String userId) {
        return Optional.ofNullable(userProfileRepository.findByUserId(userId));
    }
    
//    public void sendOTP(UserProfileRequestDTO request) {
//    	
//    }
    
    public boolean verifyOTP(OTPVerificationDTO request) {
		return false;
    	
    }
}
