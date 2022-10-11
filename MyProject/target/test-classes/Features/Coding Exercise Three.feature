Feature: Validate coding Exercise Three

Scenario: Verify that user purchase 9 pizzas at 4.55 each and 6 tubs of ice cream at 1.00 each 
			and total amount should not exceed 50 per day

Given user has purchase limit 50 euro per day 
When day one user purchase 9 pizza at 4.55 each 
And user purchase 6 cube of ice cream at 1 each
Then verify that total amount should not exceed 50 euro


Scenario: Verify that user purchase 8 buckets of chicken and chips at 6.00 each and total amount should not exceed 50 per day

Given user has purchase limit 50 euro per day 
When day two user purchase 8 buckets of chicken at 6 each  
And user purchase 8 buckets of chips at 6 each
And user also purchase 4 tubs of ice cream at 1 each
Then verify that total amount should not exceed 50 euro



Scenario: Verify that user purchase 7 Biryani at 7 each and total amount should not exceed 50 per day

Given user has purchase limit 50 euro per day 
When day three user purchase 7 biryani at 7 each  
Then verify that total amount should not exceed 50 euro

