@invoice
Feature: Invoice
  As a user
  I want to see all my invoice
  So I can manage my invoice


  Scenario: filter by paid
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to invoice
    When I click filter icon
    And I click paid radio button
    And I click show result button
    Then paid invoice is display

  Scenario: filter by unpaid
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to invoice
    When I click filter icon
    And I click unpaid radio button
    And I click show result button
    Then unpaid invoice is display


  Scenario: create invoice
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to invoice
    When I click new invoice
    And I set client email
    And I set due date
    And I input item name
    And I input qty
    And I input price
    And I click create invoice
    Then invoice is created

  Scenario: create invoice with no client email
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to invoice
    When I click new invoice
    And I set due date
    And I input item name
    And I input qty
    And I input price
    And I click create invoice
    Then invoice is not created

  Scenario: create invoice with empty item data
    Given I set url login
    And I input valid email
    And I input valid password
    And I click show password
    And I click login button
    And I go to invoice
    When I click new invoice
    And I set client email
    And I set due date
    And I click create invoice
    Then invoice is not created
