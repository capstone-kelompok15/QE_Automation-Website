@payment
Feature: payment
  As a user
  I want to see all my payment
  So I can manage my payment

  Scenario: filter payment by success
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to payment
    When I click filter icon
    And I click success radio button
    And I click show result button
    Then success payment is display

  Scenario: filter by pending
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to payment
    When I click filter icon
    And I click pending radio button
    And I click show result button
    Then failed payment is display