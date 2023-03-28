package com.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.entity.CustomerInfo;

@Repository
public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, String>{

}
