Feature: User Login
  As a user
  I want to log into my account
  So that I can access my profile

  Scenario: Successful Login
    Given I am on the login page
    When I enter my username "tunahan" and password "password123"
    And I click the login button
    Then I should be logged into my account

  Scenario: Unsuccessful Login with Invalid username or password
    Given I am on the login page
    When I enter my username "gecersiz_kullanici" and password "yanlis_password"
    And I click the login button
    Then I should see an error message