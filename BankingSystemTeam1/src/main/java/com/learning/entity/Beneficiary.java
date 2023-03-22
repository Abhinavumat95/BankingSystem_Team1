package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiary")
public class Beneficiary {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int beneficiaryID;
	private int customerID;
	private long accountNumber;
	private String fullName;
	private String status;
	private String accountType;
	private String date;
	
	
	
	public Beneficiary() {
		super();
	}



	public Beneficiary(int beneficiaryID, int customerID, long accountNumber, String fullName, String status,
			String accountType, String date) {
		super();
		this.beneficiaryID = beneficiaryID;
		this.customerID = customerID;
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		this.status = status;
		this.accountType = accountType;
		this.date = date;
	}




	public int getBeneficiaryID() {
		return beneficiaryID;
	}



	public void setBeneficiaryID(int beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}



	public int getCustomerID() {
		return customerID;
	}



	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}



	public long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Beneficiary [beneficiaryID=" + beneficiaryID + ", customerID=" + customerID + ", accountNumber="
				+ accountNumber + ", fullName=" + fullName + ", status=" + status + ", accountType=" + accountType
				+ ", date=" + date + "]";
	}
	
	
	
	
	
	
	
	

}
