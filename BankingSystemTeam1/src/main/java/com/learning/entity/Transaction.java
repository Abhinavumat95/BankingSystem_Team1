package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionID;
	private long senderAccountNumber;
	private int receiverBeneficiaryID;
	private float amount;
	private String comments;
	private String date;
	

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(int transactionID, long senderAccountNumber, int receiverBeneficiaryID, float amount,
			String comments, String date) {
		super();
		this.transactionID = transactionID;
		this.senderAccountNumber = senderAccountNumber;
		this.receiverBeneficiaryID = receiverBeneficiaryID;
		this.amount = amount;
		this.comments = comments;
		this.date = date;
	}
	
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public long getSenderAccountNumber() {
		return senderAccountNumber;
	}
	public void setSenderAccountNumber(long senderAccountNumber) {
		this.senderAccountNumber = senderAccountNumber;
	}
	public int getReceiverBeneficiaryID() {
		return receiverBeneficiaryID;
	}
	public void setReceiverBeneficiaryID(int receiverBeneficiaryID) {
		this.receiverBeneficiaryID = receiverBeneficiaryID;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", senderAccountNumber=" + senderAccountNumber
				+ ", receiverBeneficiaryID=" + receiverBeneficiaryID + ", amount=" + amount + ", comments=" + comments
				+ ", date=" + date + "]";
	}
	
	
}
