package com.example.sthaan_backend_work.services;

//import com.example.microdoc.dto.UserIdDto;
//import com.example.microdoc.model.UserId;
//import com.example.microdoc.repository.UserIdRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sthaan_backend_work.DTO.UserIdDto;
import com.example.sthaan_backend_work.model.UserId;
import com.example.sthaan_backend_work.repository.UserIdRepository;

@Service
public class UserIdService {

    @Autowired
    private UserIdRepository userIdRepository;

    public UserId createUserId(UserIdDto userIdDto) {
        UserId userId = new UserId();
        userId.setUserId(userIdDto.getUserId());
//        return userIdRepository.save(userId);
        return userIdRepository.save(userId);
    }

    public UserId getUserId(String userId) {
//        return userIdRepository.findByUserId(userId);
    	
    	return userIdRepository.findByUserId(userId);
    }
}
