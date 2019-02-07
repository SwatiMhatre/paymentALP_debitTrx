package org.payment.debitsc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DebitAccount {
	@Id
	private int id;

	@Column(name = "account_number")
	private Long accountNumber;

	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "current_balance")
	private String currentBalance;

	public DebitAccount() {

	}
	
	public DebitAccount(int id, Long accountNumber, String accountType, String currentBalance) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.currentBalance = currentBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

}
