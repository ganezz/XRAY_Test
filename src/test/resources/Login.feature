Feature: Login Scenario on User Application

  Scenario: Login Button Validation
    Given user login to the application
    When user input the user name and password
    And user clicks the login button
    Then user should login to Dashboard