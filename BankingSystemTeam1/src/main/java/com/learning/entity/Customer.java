package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int customerID;
	private String username;
	private String password;
	private String fullName;
	private String status;
	private String securityQuestion;
	private String securityAnswer;
	private String PAN;
	private String AADHAR;
	
	public Customer() {
		super();
	}

	public Customer(int customerID, String username, String password, String fullName, String status,
			String securityQuestion, String securityAnswer, String pAN, String aADHAR) {
		super();
		this.customerID = customerID;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.status = status;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		PAN = pAN;
		AADHAR = aADHAR;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getAADHAR() {
		return AADHAR;
	}

	public void setAADHAR(String aADHAR) {
		AADHAR = aADHAR;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", username=" + username + ", password=" + password
				+ ", fullName=" + fullName + ", status=" + status + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + ", PAN=" + PAN + ", AADHAR=" + AADHAR + "]";
	}
	
	

}
