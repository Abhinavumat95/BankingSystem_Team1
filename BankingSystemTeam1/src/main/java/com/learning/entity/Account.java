package com.learning.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "account")
public class Account {
	@Id
	private long accountNumber;
	private int customerID;
	private String accountType;
	private String status;
	private float balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accountNumber, int customerID, String accountType, String status, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerID = customerID;
		this.accountType = accountType;
		this.status = status;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerID=" + customerID + ", accountType=" + accountType
				+ ", status=" + status + ", balance=" + balance + "]";
	}
	
	
}
