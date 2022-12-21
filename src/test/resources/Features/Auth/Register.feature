@register
Feature: register
  As a user
  I want to create account
  So I can have my own account

  Scenario Outline: register with email username and password
    Given I set url register
    When I input Email "<email>"
    And I input username "<username>"
    And I input password "<password>"
    And I input confirm password "<cpassword>"
    And I click next button
    And I input merchant name "<merchantname>" and merchant address "<merchantaddress>"
    And I add bank
    And I input card number "<cardnumber>"
    And card holder name "<cardholdername>"
    Then I get register message "<result>"

    Examples:
      | email             | username | password | cpassword | merchantname | merchantaddress| cardnumber  | cardholdername | result |
      | rand@gmail.com    | rand     | test1234 |  test1234 |    rand      |   jalan bagus  | 12345678910 |     rand       |success |
      | rand@gmail.com    | test     | test1234 |  test1234 |    rand      |   jalan bagus  | 12345678910 |                |failed  |
      | rand@gmail.com    | coba     | test1234 |  test1234 |    rand      |                |             |     rand       |failed  |
      | rand@gmail.com    | rand     | test1234 |  test1234 |              |   jalan bagus  | 12345678910 |     rand       |failed  |
      | rand@gmail.com    | test     | test1234 |  test1234 |    test      |                |             |                |failed  |
