package com.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.SuperAdmin;

public interface SuperAdminRepo extends JpaRepository<SuperAdmin, Integer>{

}
