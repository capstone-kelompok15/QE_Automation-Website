@dashboard
Feature: Dashboard
  As a user
  I want to looking all invoice
  So I can find a invoice

  Scenario: show stats last 7 days
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to dashboard
    When I set show stat last seven days
    Then show stat change to seven days