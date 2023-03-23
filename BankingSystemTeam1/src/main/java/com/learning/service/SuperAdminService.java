package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.learning.entity.SuperAdmin;
import com.learning.repo.SuperAdminRepo;

@Service
public class SuperAdminService {
	
	@Autowired
	SuperAdminRepo superAdminRepo;
	
	public SuperAdmin registerSuperAdmin(@RequestBody SuperAdmin newSuperAdmin) {
		System.out.println("Admin Registered");
		return superAdminRepo.save(newSuperAdmin);

	}

}
