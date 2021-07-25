Feature: Amazon Home Search Page

Background:
Given User Logins to the FedApp
When User Enters Username
Then User Logins to the App

Scenario: Check Previous App Order Details
    When user clicks on App Order link
    Then user checks the previous app order detials

  Scenario: Check Open App Order Details
    When user clicks on App Open Orders link
    Then user checks the app open order details

  Scenario: Check Cancelled App Order Details
    When user clicks on App Cancelled Orders link
    Then user checks the app cancelled order details