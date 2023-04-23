package com.customerrewards.model;

public class Rewards {

	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public long getLastMonthRewardPoints() {
		return lastMonthRewardPoints;
	}
	public void setLastMonthRewardPoints(long lastMonthRewardPoints) {
		this.lastMonthRewardPoints = lastMonthRewardPoints;
	}
	public long getLastSecondMonthRewardPoints() {
		return lastSecondMonthRewardPoints;
	}
	public void setLastSecondMonthRewardPoints(long lastSecondMonthRewardPoints) {
		this.lastSecondMonthRewardPoints = lastSecondMonthRewardPoints;
	}
	public long getLastThirdMonthRewardPoints() {
		return lastThirdMonthRewardPoints;
	}
	public void setLastThirdMonthRewardPoints(long lastThirdMonthRewardPoints) {
		this.lastThirdMonthRewardPoints = lastThirdMonthRewardPoints;
	}
	public long getLastFourthMonthRewardPoints() {
		return lastFourthMonthRewardPoints;
	}
	public void setLastFourthMonthRewardPoints(long lastFourthMonthRewardPoints) {
		this.lastFourthMonthRewardPoints = lastFourthMonthRewardPoints;
	}
	public long getLastFifthMonthRewardPoints() {
		return lastFifthMonthRewardPoints;
	}
	public void setLastFifthMonthRewardPoints(long lastFifthMonthRewardPoints) {
		this.lastFifthMonthRewardPoints = lastFifthMonthRewardPoints;
	}
	public long getLastSixthMonthRewardPoints() {
		return lastSixthMonthRewardPoints;
	}
	public void setLastSixthMonthRewardPoints(long lastSixthMonthRewardPoints) {
		this.lastSixthMonthRewardPoints = lastSixthMonthRewardPoints;
	}
	public long getTotalRewards() {
		return totalRewards;
	}
	public void setTotalRewards(long totalRewards) {
		this.totalRewards = totalRewards;
	}
	private long lastMonthRewardPoints;
    private long lastSecondMonthRewardPoints;
    private long lastThirdMonthRewardPoints;
    private long lastFourthMonthRewardPoints;
    private long lastFifthMonthRewardPoints;
    private long lastSixthMonthRewardPoints;
    private long totalRewards;
	
}
