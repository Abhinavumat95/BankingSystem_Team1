package com.learning.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="customerInfo")
public class CustomerInfo implements Serializable {
	private static final long serialVersionUID = 2652327633296064143L;
	
	@Id
	private String username;
//	private String customerID;

	private String securityQuestion;
	private String securityAnswer;
	private String phone;
	private String pan;
	private String aadhar;
	private String fullname;
	

	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerInfo(String username, String securityQuestion, String securityAnswer, String phone, String pan,
			String aadhar, String fullname) {
		super();
		this.username = username;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.phone = phone;
		this.pan = pan;
		this.aadhar = aadhar;
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "CustomerInfo [username=" + username + ", securityQuestion=" + securityQuestion + ", securityAnswer="
				+ securityAnswer + ", phone=" + phone + ", pan=" + pan + ", aadhar=" + aadhar + ", fullname=" + fullname
				+ "]";
	}


}
