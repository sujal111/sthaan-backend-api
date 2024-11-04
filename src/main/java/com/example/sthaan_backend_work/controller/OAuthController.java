//package com.example.sthaan_backend_work.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.sthaan_backend_work.DTO.OAuthRequestDTO;
//import com.example.sthaan_backend_work.services.OAuthService;
//
//@RestController
//@RequestMapping("/api/v1/oauth")
//public class OAuthController {
//
//    @Autowired
//    private OAuthService oauthService;
//
//    @PostMapping("/token")
//    public ResponseEntity<String> getToken(@RequestBody OAuthRequestDTO request) {
//        String token = oauthService.generateToken(request);
//        return ResponseEntity.ok(token);
//    }
//}
