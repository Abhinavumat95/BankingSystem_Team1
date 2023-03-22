package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int staffID;
	private String username;
	private String password;
	private String fullName;
	private String status;
	
	public int getStaffId() {
		return staffID;
	}
	public void setStaffId(int staffId) {
		this.staffID = staffId;
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
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int staffID, String username, String password, String fullName, String status) {
		super();
		this.staffID = staffID;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffID + ", username=" + username + ", password=" + password + ", fullName="
				+ fullName + ", status=" + status + "]";
	}
	
	

}
