package com.calculateRewardPoints.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculateRewardPoints.model.PointsResponse;
import com.calculateRewardPoints.service.RewardsService;

@RestController
public class RewardController {
	
	@Autowired
	private RewardsService rewardsService;
	@GetMapping("/calculateRewardPoints")
	public PointsResponse calculateRewardPoints(@RequestParam Long customerId) 
	{
		PointsResponse rewardPointDetails = rewardsService.getRewardsByCustomer(customerId);
		return rewardPointDetails;
	}
}

