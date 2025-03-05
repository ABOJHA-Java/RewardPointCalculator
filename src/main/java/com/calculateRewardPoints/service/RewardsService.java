package com.calculateRewardPoints.service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.calculateRewardPoints.model.PointsResponse;
import com.calculateRewardPoints.model.Transaction;

@Service
public class RewardsService {
	private static final List<Transaction> transactions = Arrays.asList(
        new Transaction(1L, 9001L, 1400.0, LocalDate.of(2025, 1, 15)),
        new Transaction(2L, 9001L, 785.0, LocalDate.of(2025, 2, 10)),
        new Transaction(3L, 9001L, 2500.0, LocalDate.of(2025, 1, 20)),
        new Transaction(4L, 9001L, 560.0, LocalDate.of(2025, 3, 5))
    );
	 /*Fetches customer details and calculate rewards*/
	 public PointsResponse getRewardsByCustomer(Long customerId) {
		 List<Transaction> transactionListOfCustomer = findByCustomerId(customerId);
		 int totalPoints = 0;
		 Map<String,Integer> pointsPerMonth= new HashMap<>();
		 for(Transaction transaction: transactionListOfCustomer) {
			 String getMonthlyTransaction = transaction.getTransactionDate().getMonth().toString();
			 int points = calculateMonthlyPoints(transaction.getAmount());
			 pointsPerMonth.put(getMonthlyTransaction, pointsPerMonth.getOrDefault(getMonthlyTransaction, 0) + points);
			 totalPoints+=points;
		 }
		 PointsResponse pointsResponse = new PointsResponse();
		 pointsResponse.setCustomerId(customerId);
		 pointsResponse.setMonthlyPoints(pointsPerMonth);
		 pointsResponse.setTotalPoints(totalPoints);
		 return pointsResponse;
	 }
	 /*Calculates Reward points based on amount*/
	 private int calculateMonthlyPoints(double amount) {
		 int points = 0;
	        
	        if (amount > 100) {
	            points += (amount - 100) * 2; 
	            amount = 100;
	        }
	        if (amount > 50) {
	            points += (amount - 50) * 1; 
	        }

	        return points;
	    }
		
	
	public List<Transaction> findByCustomerId(Long customerId) {
	        return transactions.stream()
	                .filter(txn -> txn.getCustomerId().equals(customerId))
	                .collect(Collectors.toList());
	    }
}

