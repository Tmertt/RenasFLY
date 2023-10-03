Feature: Test Flight App FB-89

  @Regression_73
  Scenario:Verify that user lands on Search Flight page
    Given The user wants to navigate to Login page
    And The user verifies title as "React App"
    When the user wants to provide random email,password with API Request
    And the user wants to click on Login button
    Then the user wants to verify user lands on Search Flight page

  @Regression_73
  Scenario: Verify error message
    Given the user wants to navigate to Login page
    And the user verifies title as "React App"
    When the user provides invalid email,password with API request
    Then the user wants to verify error message as "wrong email or password"

  @Regression_73
  Scenario: Login with API
    Given The user wants to add request Payload
    When The user sends request
    Then the user verifies status code is 200

  @Regression_73
  Scenario:Invalid Login with API
    Given The user wants to add request Payload
    When The user sends invalid request
    Then User verifies status code is 401