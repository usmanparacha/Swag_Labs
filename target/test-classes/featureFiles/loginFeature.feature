Feature: Login to saucedemo Application

  Background:
    Given User is on saucedemoLogin page

  @Login
  Scenario: Login with valid credentials
    When I enter the username
    And I enter the password
    When I click on the login button
    Then  I should be logged in successfully