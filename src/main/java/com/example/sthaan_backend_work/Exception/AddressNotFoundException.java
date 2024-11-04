package com.example.sthaan_backend_work.Exception;


public class AddressNotFoundException extends RuntimeException {
    public AddressNotFoundException(String sthaanId) {
        super("Address not found with SthaanId: " + sthaanId);
    }
}
