@All
Feature: Uber Booking feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber application
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Regression
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from uber application
When User selects car "SUV" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking Cab Mini
Given User wants to select a car type "Mini" from uber application
When User selects car "Mini" and pick up point "Bangalore" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

