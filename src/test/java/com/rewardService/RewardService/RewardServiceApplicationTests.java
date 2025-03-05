package com.rewardService.RewardService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.calculateRewardPoints.model.Transaction;
import com.calculateRewardPoints.service.RewardsService;

@SpringBootTest
class RewardServiceApplicationTests {
	@Autowired
	private RewardsService rewardsService;
	@Test
    void testRewardsCalculation() {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1L, 9001L, 120.0, LocalDate.of(2024, 1, 15)),
            new Transaction(2L, 9001L, 75.0, LocalDate.of(2024, 2, 10))
        );
        assertEquals(90, rewardsService.getRewardsByCustomer(101L).getTotalPoints());
    }

}
