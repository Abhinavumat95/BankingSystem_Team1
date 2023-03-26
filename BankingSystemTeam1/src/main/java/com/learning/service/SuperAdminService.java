package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import com.learning.entity.Authority;
import com.learning.entity.User;
import com.learning.entity.UserRole;
import com.learning.exception.UserAlreadyExistException;
import com.learning.repo.AuthorityRepository;
import com.learning.repo.UserRepository;


import org.springframework.web.bind.annotation.RequestBody;
import com.learning.entity.SuperAdmin;
import com.learning.repo.SuperAdminRepo;


@Service
public class SuperAdminService {
	// Original Field
//	@Autowired
//	SuperAdminRepo superAdminRepo;
	
	
	
	
	// Original Method
//	public SuperAdmin registerSuperAdmin(@RequestBody SuperAdmin newSuperAdmin) {
//		System.out.println("Admin Registered");
//		return superAdminRepo.save(newSuperAdmin);
//
//	}
	
	
	private UserRepository userRepository;
	private AuthorityRepository authorityRepositoy;
	private PasswordEncoder passwordEncoder;
	

	@Autowired
	public SuperAdminService(UserRepository userRepository, AuthorityRepository authorityRepositoy,
			PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.authorityRepositoy = authorityRepositoy;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public User signUp(User user) {
		String username = user.getUsername();
		if(userRepository.existsById(username)) {
			throw new UserAlreadyExistException("Username: " + username + " already exists.");
		}
		
		authorityRepositoy.save(new Authority(username, UserRole.SUPER_ADMIN.name()));
		
		user.setId(username.hashCode());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setEnabled(true);
		return userRepository.save(user);
	}

}
