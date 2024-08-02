Feature: General User View
  Scenario: Validate General User able to view product page without logged in
    Given User navigate to the online product page
    When User clicks on formal shoes dropdown
    Then User should be able to view the Product
