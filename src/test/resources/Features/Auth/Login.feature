@login
Feature: Login
  As a user
  I want to login
  So I can manage my account

  Scenario Outline: Login with email and password
    Given I set url login
    When I input email "<email>"
    And I input password "<password>"
    Then I get login message "<result>"
    Examples:
      | email             | password | result |
      | abdullah.nouval@gmail.com | Test1234   | succes |
      | imanuel@gmail.com | 000000   | failed |
      | imanuel@gmail.com |          | failed |
      |                   | 123456   | failed |
      | test@mail.co      | 123456   | failed |

  Scenario: Login with show password
    Given I set url login
    When I input valid email
    And I input valid password
    And I click show password
    And I click login button
    Then I go to dashboard

  Scenario: forgot password
    Given I set url login
    When I click forgot password button
    Then I go to reset password page
