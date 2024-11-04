package com.example.sthaan_backend_work.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sthaan_backend_work.model.SthaanId;

import java.util.List;

@Repository
public interface SthaanIdRepository extends JpaRepository<SthaanId, Long> {
    List<SthaanId> findByUserId(String userId);
}

