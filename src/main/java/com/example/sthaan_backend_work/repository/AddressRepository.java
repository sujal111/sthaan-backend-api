//package com.example.sthaan_backend_work.repository;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.example.sthaan_backend_work.model.Address;
//
//public interface AddressRepository extends JpaRepository<Address,Long>{
//
//	Optional<Address>findSthaanId(String sthaanId);
//	
//}


package com.example.sthaan_backend_work.repository;

import com.example.sthaan_backend_work.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Optional<Address> findBySthaanId(String sthaanId);
}