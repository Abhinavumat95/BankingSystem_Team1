package com.learning.entity;
import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "accountNumber")
	private long accountNumber;
	
//	@Column(name = "username")
//	private String username;
	
	@Column(name = "accountType")
	private AccountType accountType;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@Column(name = "balance")
	private float balance;
	
	@Column(name = "creationDate")
	LocalDate creationDate = LocalDate.now();
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "username")
	private CustomerInfo customerInfo;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long accountNumber, AccountType accountType, boolean enabled, float balance, LocalDate creationDate,
			CustomerInfo customerInfo) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.enabled = enabled;
		this.balance = balance;
		this.creationDate = creationDate;
		this.customerInfo = customerInfo;
	}

//	@Override
//	public String toString() {
//		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", enabled=" + enabled
//				+ ", balance=" + balance + ", creationDate=" + creationDate + ", customerInfo=" + customerInfo + "]";
//	}

	

	
	
	
}
