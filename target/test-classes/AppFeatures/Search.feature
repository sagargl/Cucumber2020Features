Feature: Amazon Search

@Smoke
Scenario: Search a Product Apple MacBook Pro
Given I have a Search field on Amazon Page
When I search a product with name "Apple MacBook Pro" and price 1000
Then I search with name "Apple MacBook Pro" should be displayed
Then User buy the App

@Regression
Scenario: Search a Product Iphone
Given I have a Search field on Amazon Page
When I search a product with name "IPhone" and price 100
Then I search with name "Iphone" should be displayed


