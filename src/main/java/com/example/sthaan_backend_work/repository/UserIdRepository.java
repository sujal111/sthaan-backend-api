package com.example.sthaan_backend_work.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sthaan_backend_work.model.UserId;

@Repository
public interface UserIdRepository extends JpaRepository<UserId, Long> {
    UserId findByUserId(String userId);
}
