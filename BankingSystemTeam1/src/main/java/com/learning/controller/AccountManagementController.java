package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Account;
import com.learning.service.AccountManagementService;

@RestController
@RequestMapping("/api/customer")
public class AccountManagementController {

	@Autowired
	AccountManagementService accountManagementService;

	public AccountManagementController(AccountManagementService accountManagementService) {
		super();
		this.accountManagementService = accountManagementService;
	}

	@PostMapping("/{username}/account")
	public ResponseEntity<String> createCustomerAccount(@PathVariable("username") String username,
			@RequestBody Account newAccount) {
		String accountInfo = accountManagementService.createAccount(username, newAccount).toString();
		return new ResponseEntity<String>(accountInfo, HttpStatus.CREATED);
	}

	@GetMapping("/{username}/account")
	public List<Object[]> getCustomerAccounts(@PathVariable("username") String username) {
		return accountManagementService.getCustomerInfoAccounts(username);
	}
	
	@GetMapping("/{username}/account/{accountNumber}")
	public Account getCustomerAccountDetails(@PathVariable("username") String username,
			@PathVariable("accountNumber") Long accountNumber) {
		return accountManagementService.getCustomerInfoAccountDetails(username, accountNumber);
	}
}
