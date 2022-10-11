Feature: Coding Exercise four

Scenario: Verify that user is able to purchase items online at Ebay and total amount should not exceed more than 100 euro

Given user has account balance of 100 euro 
When day one user purchase cricket shirt for 10 euro 
Then verify user account should have a balance of 90 euro 


Scenario: Verify that user is able to purchase items online at Ebay and total amount should not exceed more than 100 euro

Given user has account balance of 90 euro 
When day two user purchase signed photo of Aamir Khan for 35 euro
And user also purchase signed photo of Sachin Tendulkar for 35 euro 
Then verify user account should have a balance of 20 euro 



Scenario: Verify that user is able to purchase items online at Ebay and total amount should not exceed more than 100 euro

Given user has account balance of 20 euro 
When day three user clicks to purchase cd of Shreya Ghoshal for 22 euro
Then verify user is getting error message insufficient funds
 

Scenario: Verify that user is able to purchase items online at Ebay and total amount should not exceed more than 100 euro

Given user has account balance of 20 euro 
When day four user added 10 euro into paypal account
And user clicks to purchase cd of Shreya Ghosal for 22 euro
Then verify user account should have a balance of 8 euro
