package com.calculateRewardPoints.model;

import java.util.Map;

public class PointsResponse {
	private Long customerId;
    private Map<String, Integer> monthlyPoints;
    public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Map<String, Integer> getMonthlyPoints() {
		return monthlyPoints;
	}
	public void setMonthlyPoints(Map<String, Integer> monthlyPoints) {
		this.monthlyPoints = monthlyPoints;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	private int totalPoints;
	public PointsResponse(Long customerId, Map<String, Integer> monthlyPoints, int totalPoints) {
		super();
		this.customerId = customerId;
		this.monthlyPoints = monthlyPoints;
		this.totalPoints = totalPoints;
	}
	public PointsResponse() {
		// TODO Auto-generated constructor stub
	}

}
