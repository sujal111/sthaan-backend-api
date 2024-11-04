package com.example.sthaan_backend_work.DTO;

public class SthaanIdDto {
    private String userId;
    private String sthaanId;
    private String linkedSystem;

    // Constructor
    public SthaanIdDto(String userId, String sthaanId, String linkedSystem) {
        this.userId = userId;
        this.sthaanId = sthaanId;
        this.linkedSystem = linkedSystem;
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getSthaanId() {
        return sthaanId;
    }

    public String getLinkedSystem() {
        return linkedSystem;
    }

    // Setters (if needed)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSthaanId(String sthaanId) {
        this.sthaanId = sthaanId;
    }

    public void setLinkedSystem(String linkedSystem) {
        this.linkedSystem = linkedSystem;
    }
}