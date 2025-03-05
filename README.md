#OverView
This project is build to calculate monthly and total reward Points for each customer
based on their transactions.

#Logic used for Calculating reward
A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent between $50 and $100 in each transaction. 

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points). 

#Rest End Point

http://localhost:8080/calculateRewardPoints?customerId=9001
