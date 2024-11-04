package com.example.sthaan_backend_work.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SthaanId {
    @Id
    private String sthaanId;
    private String userId;
    private String linkedSystem;

    // Getters and Setters
    public String getSthaanId() {
        return sthaanId;
    }

    public void setSthaanId(String sthaanId) {
        this.sthaanId = sthaanId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLinkedSystem() {
        return linkedSystem;
    }

    public void setLinkedSystem(String linkedSystem) {
        this.linkedSystem = linkedSystem;
    }
}