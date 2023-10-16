Feature: Login Functionality

  Background: Open app and login page navigation.
    Given the user navigate to Login page

  @TC-1 @Regression_2 @UI @LogIn @Positive
  Scenario: Validating the login function on UI (Client side) with valid credentials.
    And  fill out the login form fields entering valid email and password
    When click on login button
    Then verify redirection to the Search Flight Page.

  @TC-2 @Regression_2 @UI @LogIn @Negative
  Scenario: Validating the login function on UI (Client side) with invalid credentials.
    And  fill out the login form fields entering invalid email and password
    When click on login button
    Then verify “Wrong Email Or Password” message