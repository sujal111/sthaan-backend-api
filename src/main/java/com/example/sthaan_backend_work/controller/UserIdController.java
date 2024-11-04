package com.example.sthaan_backend_work.controller;

//import com.example.microdoc.dto.UserIdDto;
//import com.example.microdoc.model.UserId;
//import com.example.microdoc.service.UserIdService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.sthaan_backend_work.DTO.UserIdDto;
import com.example.sthaan_backend_work.model.UserId;
import com.example.sthaan_backend_work.services.UserIdService;

@RestController
@RequestMapping("/api/v1/user-id")
public class UserIdController {

    @Autowired
    private UserIdService userIdService;

    @PostMapping("/create")
    public ResponseEntity<UserId> createUserId(@RequestBody UserIdDto userIdDto) {
        UserId userId = userIdService.createUserId(userIdDto);
        return ResponseEntity.ok(userId);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserId> getUserId(@PathVariable String userId) {
        UserId retrievedUserId = userIdService.getUserId(userId);
        return retrievedUserId != null ? ResponseEntity.ok(retrievedUserId) : ResponseEntity.notFound().build();
    }
}
