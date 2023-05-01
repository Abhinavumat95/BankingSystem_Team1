package com.learning.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.entity.Account;
import com.learning.entity.CustomerInfo;
import com.learning.exception.UserAlreadyExistException;
import com.learning.exception.UserNotExistException;
import com.learning.repo.AccountRepository;
import com.learning.repo.CustomerInfoRepository;
import com.learning.repo.UserRepository;

@Service
public class AccountManagementService {
	
	UserRepository userRepo;
	CustomerInfoRepository customerInfoRepo;
	AccountRepository accountRepository;
	
	@Autowired
	public AccountManagementService(UserRepository userRepo, CustomerInfoRepository customerInfoRepo,
			AccountRepository accountRepository) {
		super();
		this.userRepo = userRepo;
		this.customerInfoRepo = customerInfoRepo;
		this.accountRepository = accountRepository;
	}
	
	public Account createAccount(@PathVariable("username") String username, 
			@RequestBody Account newAccount) {
		
		if(!customerInfoRepo.existsById(username)) {
			throw new UserNotExistException("Username: " + username + " does not exist.");
		}
		
		Random random = new Random();   
		Long accountNo = 1000000 + random.nextLong(900000000000L);   
		
		if(accountRepository.existsById(accountNo)) {
			throw new UserAlreadyExistException("Account number: " + accountNo + " already exist.");
			
		}

		Optional<CustomerInfo> optional = customerInfoRepo.findById(username);
		
		CustomerInfo customer = optional.get();
		
		newAccount.setAccountNumber(accountNo);
		newAccount.setEnabled(false);
		newAccount.setCreationDate(LocalDate.now());
		newAccount.setCustomerInfo(customer);

		customer.setAccountList(newAccount.getAccountNumber());
		System.out.println(customer.getAccountList());
		

		return accountRepository.save(newAccount);
		
	}

	public List<Object[]> getCustomerInfoAccounts(@PathVariable("username") String username) {

		List<Object[]> optional = customerInfoRepo.fetchCustomerAccounts(username);
		if (optional.isEmpty()) {
			throw new UserNotExistException("User does not exist");
		}
		
		return optional;

	}
	
	public Account getCustomerInfoAccountDetails(@PathVariable("username") String username,
			@PathVariable("accountNumber") Long accountNumber) {

		Optional<CustomerInfo> customer = customerInfoRepo.findById(username);
		Optional<Account> account = accountRepository.findById(accountNumber);
		if (!customer.isPresent()) {
			throw new UserNotExistException("User does not exist");
		}
		if (!account.isPresent()) {
			throw new UserNotExistException("Account does not exist");
		}
		
		return account.get();

	}
	

	
	

}
