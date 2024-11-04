//package com.example.sthaan_backend_work;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SthaanBackendWorkApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SthaanBackendWorkApplication.class, args);
//	}
//
//}

package com.example.sthaan_backend_work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.sthaan_backend_work")
public class SthaanBackendWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SthaanBackendWorkApplication.class, args);
    }
}