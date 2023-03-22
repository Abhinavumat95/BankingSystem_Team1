package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GenerationType;

@Entity
@Table(name="superadmin")
public class SuperAdmin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int superAdminID;
	private String username;
	private String password;
	
	public int getSuperAdminId() {
		return superAdminID;
	}
	public void setSuperAdminId(int superAdminId) {
		this.superAdminID = superAdminId;
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
	public SuperAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperAdmin(int superAdminID, String username, String password) {
		super();
		this.superAdminID = superAdminID;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "SuperAdmin [superAdminId=" + superAdminID + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
