package org.payment.debitsc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditAccount {
	@Id
	private Long id;

	@Column(name = "account_number")
	private Long accountNumber;

	@Column(name = "beneficiary_name")
	private String beneficiaryName;

	public CreditAccount() {

	}
	
	public CreditAccount(Long id, Long accountNumber, String beneficiaryName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.beneficiaryName = beneficiaryName;
	}

	public String getAccountType() {
		return beneficiaryName;
	}

	public void setAccountType(String accountType) {
		this.beneficiaryName = accountType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "CreditAccount [id=" + id + ", accountNumber=" + accountNumber + ", beneficiaryName=" + beneficiaryName
				+ "]";
	}
	
}
