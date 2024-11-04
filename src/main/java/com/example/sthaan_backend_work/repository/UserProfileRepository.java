package com.example.sthaan_backend_work.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sthaan_backend_work.model.UserProfile;
import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    Optional<UserProfile> findByContactInfo(String contactInfo);
    UserProfile findByUserId(String userId);
}