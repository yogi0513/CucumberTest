Feature: Perform coding Exercise two

Scenario: verify that user is able to buy orange at 20p

Given user navigates to fruits section
When user buy orange with cost 20
Then verify that product purchase successfully


Scenario: verify that user is able to purchase orange & apple fruits with different quantity and price combination 

Given user is already on fruits section
When user buy 2 oranges for 25 rp each 
And user buy 1 apple for 35 rp each
Then verify user is able to select different combination of quanity & price


Scenario: verify that user is able to purchase fruits after two days with different price variation 

Given user is already on fruits section
When user buy 1 oranges for 35 rp each 
And user buy 2 apple for 30 rp each
Then verify user purchase both fruits successfully


