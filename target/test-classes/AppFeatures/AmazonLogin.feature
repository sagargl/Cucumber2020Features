Feature: Amazon Login Page
In order to Test login page
As a Registered user
I want to specify the login conditions
  
    Scenario: Amazon Login Page
    Given User is on Amazon Landing Page
    And Sign In Button Present in Screen 
    When User Clicks on Sign In Button
    Then User is displayed Login Screen
    When User Enters "sagar@gmail.com" in username field
    And User Enters "test@123" in password field
    And User Clicks Sign In Button
    Then User is On Home Page
    And title of the login page is "Amazon"
    But Sign In Button  is not Present
    And some other action
    
 