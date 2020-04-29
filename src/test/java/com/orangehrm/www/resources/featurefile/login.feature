@Login
Feature: Login funtionality
  As a user,I want to login to orangehrm website

  Scenario: User should login successfully with valid credentials
    Given I am on Home page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    Then I should login successfully

  Scenario: User should not login successfully with invalid credentials
    Given User is login scenario
    When User enter the below credentials
    |admin|admin321|
    And User click on login button
    Then User should not login successfully

