Feature: SignUp Form Validation
Background:
  Given the user is on the SignUp page
  And the user clicks the Sign Up button
  @Regression_SignUp_73
  Scenario: Sign Up with Valid Information


    When the user enters the following valid information:
      | Field          | Value                       |
      | First Name     | <FirstName>                 |
      | Last Name      | <LastName>                  |
      | Email          | <Email>                     |
      | Phone          | <Phone>                     |
      | Password       | <Password>                  |
      | Password Repeat| <Password>                  |
      | Gender         | <Gender>                    |
    Then the "User Created" banner message with a green background should appear

  @Regression_SignUp_73
  Scenario: Sign Up with Invalid Email
    When the user enters invalid email "<InvalidEmail>"
    And the user clicks the Sign Up button
    Then the user should see an error message "Invalid email format"

  @Regression_SignUp_73
  Scenario: Sign Up with Invalid Phone
    When the user enters an invalid phone number "<InvalidPhone>"
    And the user clicks the Sign Up button
    Then the user should see an error message "Invalid phone number format"

  @Regression_SignUp_73
  Scenario: Sign Up with Missing Fields
    When the user clicks the Sign Up button without filling in all mandatory fields
    Then the user should see error messages for missing fields

  @Regression_SignUp_73
  Scenario: Sign Up with Password Mismatch
    When the user enters different passwords in the Password and Password Repeat fields
    And the user clicks the Sign Up button
    Then the user should see an error message "Password mismatch"

  @Regression_SignUp_73
  Scenario: Sign Up with Special Characters in Password
    When the user enters a password with special characters "<SpecialPassword>"
    And the user clicks the Sign Up button
    Then the user should see an error message "Password should not contain special characters"






