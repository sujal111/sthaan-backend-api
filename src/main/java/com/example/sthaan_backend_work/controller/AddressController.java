//package com.example.sthaan_backend_work.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.sthaan_backend_work.DTO.AuthorizationRequestDTO;
//import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
//import com.example.sthaan_backend_work.model.Address;
//import com.example.sthaan_backend_work.services.AddressService;
//
//@RestController
//@RequestMapping("/api/v1/address")
//public class AddressController {
//
//    @Autowired
//    private AddressService addressService;
//
//    @GetMapping("/public")
//    public ResponseEntity<Address> getPublicAddress(@RequestParam String sthaanId) {
//        Address address = addressService.getPublicAddress(sthaanId);
//        return ResponseEntity.ok(address);
//    }
//
//    @PostMapping("/otp/initiate")
//    public ResponseEntity<Address> getAddressWithOTP(@RequestBody OTPVerificationDTO request) {
//        Address address = addressService.getAddressByOTP(request);
//        return ResponseEntity.ok(address);
//    }
//
//    @PostMapping("/authorization/update")
//    public ResponseEntity<String> updateAuthorization(@RequestBody AuthorizationRequestDTO request) {
//        addressService.associateAddress(request);
//        return ResponseEntity.ok("Address association updated");
//    }
//}



package com.example.sthaan_backend_work.controller;

import com.example.sthaan_backend_work.DTO.OTPVerificationDTO;
import com.example.sthaan_backend_work.Exception.AddressNotFoundException;
import com.example.sthaan_backend_work.model.Address;
import com.example.sthaan_backend_work.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressService addressService;

    @GetMapping("/public")
    public ResponseEntity<Address> getPublicAddress(@RequestParam String sthaanId) {
        logger.info("Received request for public address with sthaanId: {}", sthaanId);
        try {
            Address address = addressService.getPublicAddress(sthaanId);
            return new ResponseEntity<>(address, HttpStatus.OK);
        } catch (AddressNotFoundException ex) {
            logger.error("Address not found for sthaanId: {}", sthaanId);
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/otp")
    public ResponseEntity<Address> getAddressByOTP(@RequestBody OTPVerificationDTO request) {
        logger.info("Received request for address with OTP verification, sthaanId: {}", request.getSthaanId());
        try {
            Address address = addressService.getAddressByOTP(request);
            return new ResponseEntity<>(address, HttpStatus.OK);
        } catch (AddressNotFoundException ex) {
            logger.error("Address not found for sthaanId: {}", request.getSthaanId());
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}