Feature: LoggedIn user feature
  Scenario: Validate user is able to view after login
    Given User navigate to the login page
    When User successfully enters the login details
    Then User should be able to product category page