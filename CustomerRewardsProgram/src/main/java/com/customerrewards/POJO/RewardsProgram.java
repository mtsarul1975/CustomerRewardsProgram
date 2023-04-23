package com.customerrewards.POJO;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RewardsProgram")
public class RewardsProgram {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Transaction_Id")
	private Long transationId;
	
	@Column(name = "Cusotmer_Id")
	private int customerId;
	
	@Column(name = "Trans_Amnt")
	private Double TransactionAmnt;
	
	public Double getTransactionAmnt() {
		return TransactionAmnt;
	}

	public void setTransactionAmnt(Double transactionAmnt) {
		TransactionAmnt = transactionAmnt;
	}

	@Column(name = "Rewards_date")
	private Date RewardsDate;

	
	public Long getTransationId() {
		return transationId;
	}

	public void setTransationId(Long transationId) {
		this.transationId = transationId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	public Date getRewardsDate() {
		return RewardsDate;
	}

	public void setRewardsDate(Date rewardsDate) {
		RewardsDate = rewardsDate;
	}

	
}
