package com.example.sthaan_backend_work.services;
//
//import com.example.microdoc.dto.SthaanIdDto;
//import com.example.microdoc.model.SthaanId;
//import com.example.microdoc.repository.SthaanIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sthaan_backend_work.DTO.SthaanIdDto;
import com.example.sthaan_backend_work.model.SthaanId;
import com.example.sthaan_backend_work.repository.SthaanIdRepository;

import java.util.List;

@Service
public class SthaanIdService {

    @Autowired
    private SthaanIdRepository sthaanIdRepository;

    public SthaanId createSthaanId(SthaanIdDto sthaanIdDto) {
        SthaanId sthaanId = new SthaanId();
        sthaanId.setUserId(sthaanIdDto.getUserId());
        sthaanId.setSthaanId(sthaanIdDto.getSthaanId());
        sthaanId.setLinkedSystem(sthaanIdDto.getLinkedSystem());
        return sthaanIdRepository.save(sthaanId);
    }

    public List<SthaanId> getSthaanIds(String userId) {
        return sthaanIdRepository.findByUserId(userId);
    }
}
