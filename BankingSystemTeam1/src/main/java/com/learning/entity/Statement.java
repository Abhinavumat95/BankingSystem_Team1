package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="statement")
public class Statement {
	
	@Id
	private long accountNumber;
	private int transactionID;
	private String date;
	private String reference;
	private float balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Statement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Statement(long accountNumber, int transactionID, String date, String reference, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.transactionID = transactionID;
		this.date = date;
		this.reference = reference;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Statement [accountNumber=" + accountNumber + ", transactionID=" + transactionID + ", date=" + date
				+ ", reference=" + reference + ", balance=" + balance + "]";
	}
	
	
	

}
