Feature: As a user I should be able to buy orange

Scenario: verify user is able to buy orange at 35p costs

Given user navigates to fruits section on screen
When user select orange with costs 35 
And click on addToCart button
Then verify product added successfully
