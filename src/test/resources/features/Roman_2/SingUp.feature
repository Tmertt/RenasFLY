Feature: Sign Up Functionality

  Background: Open app and Sing Up navigation
    Given the user navigate to Sing Up page

  @TC-1 @Regression_2 @UI @SignUP @Positive
  Scenario: Validating the user registration function on UI (Client side) with valid credentials
    When user fills out a form with valid credentials
    And click sing up button
    Then verify message “User Created”

  @TC-1 @Regression_2 @UI @SignUP @Negative
  Scenario: Validating the user registration function on UI (Client side) where password and password repeat fields do not match
    When user fills out a form where password and password repeat fields do not match
    Then verify message “Password mismatch.”