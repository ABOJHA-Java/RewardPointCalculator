package com.calculateRewardPoints.model;

import java.time.LocalDate;

public class Transaction {
	private Long transactionId;
	private Long customerId;
	private double amount;
	private LocalDate transactionDate;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Transaction(Long transactionId, Long customerId, double amount, LocalDate transactionDate) {
		super();
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}
	

}
