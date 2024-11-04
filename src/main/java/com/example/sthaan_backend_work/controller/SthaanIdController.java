package com.example.sthaan_backend_work.controller;

//import com.example.microdoc.dto.SthaanIdDto;
//import com.example.microdoc.model.SthaanId;
//import com.example.microdoc.service.SthaanIdService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.sthaan_backend_work.DTO.SthaanIdDto;
import com.example.sthaan_backend_work.model.SthaanId;
import com.example.sthaan_backend_work.services.SthaanIdService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sthaan-id")
public class SthaanIdController {

    @Autowired
    private SthaanIdService sthaanIdService;

    @PostMapping("/create")
    public ResponseEntity<SthaanId> createSthaanId(@RequestBody SthaanIdDto sthaanIdDto) {
        SthaanId sthaanId = sthaanIdService.createSthaanId(sthaanIdDto);
        return ResponseEntity.ok(sthaanId);
    }

    @GetMapping("/list")
    public ResponseEntity<List<SthaanId>> getSthaanIds(@RequestParam String userId) {
        List<SthaanId> sthaanIds = sthaanIdService.getSthaanIds(userId);
        return ResponseEntity.ok(sthaanIds);
    }
}
