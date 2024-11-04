//package com.example.sthaan_backend_work.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.sthaan_backend_work.DTO.AuthorizationRequestDTO;
//import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
//import com.example.sthaan_backend_work.model.Address;
//import com.example.sthaan_backend_work.repository.AddressRepository;
//
//@Service
//public class AddressService {
//
//    @Autowired
//    private AddressRepository addressRepository;
//
//    public Address getPublicAddress(String sthaanId) {
//        // Retrieve public address logic here
//    }
//
//    public Address getAddressByOTP(OTPVerificationDTO request) {
//        // Retrieve address by OTP
//    }
//
//    public void associateAddress(AuthorizationRequestDTO request) {
//        // Logic to associate address based on request type
//    }
//}
//





package com.example.sthaan_backend_work.services;

import com.example.sthaan_backend_work.DTO.AuthorizationRequestDTO;
import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
import com.example.sthaan_backend_work.Exception.AddressNotFoundException;
import com.example.sthaan_backend_work.model.Address;
import com.example.sthaan_backend_work.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Service
public class AddressService {

    private static final Logger logger = LoggerFactory.getLogger(AddressService.class);

    @Autowired
    private AddressRepository addressRepository;

    public Address getPublicAddress(String sthaanId) {
        logger.info("Fetching public address for sthaanId: {}", sthaanId);
        Optional<Address> addressOpt = addressRepository.findBySthaanId(sthaanId);
        if (addressOpt.isPresent()) {
            return addressOpt.get();
        }
        throw new AddressNotFoundException(sthaanId);
    }

    public Address getAddressByOTP(OTPVerificationDTO request) {
        boolean isOtpValid = verifyOTP(request);
        if (isOtpValid) {
            Optional<Address> addressOpt = addressRepository.findBySthaanId(request.getSthaanId());
            if (addressOpt.isPresent()) {
                return addressOpt.get();
            }
            throw new AddressNotFoundException(request.getSthaanId());
        }
        throw new RuntimeException("Invalid OTP for SthaanId: " + request.getSthaanId());
    }

    public void associateAddress(AuthorizationRequestDTO request) {
        // Implement your logic here
    }

    private boolean verifyOTP(OTPVerificationDTO request) {
        // Implement your OTP verification logic here
        return true;
    }
}
