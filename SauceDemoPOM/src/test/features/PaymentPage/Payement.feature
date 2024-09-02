@Paiyment_SauceDemo
Feature: Payment of the product
  I want to pay the product

  Background: 
    Given I enter  url "https://www.saucedemo.com/"
    When I enter  username "standard_user"
    And I enter  password "secret_sauce"
    And I click  login button
    Then I validate  page "https://www.saucedemo.com/inventory.html"
    Given Choose the first product and click add_to_cart1
    When Choose the seecond product and click add_to_cart2
    And click the cart button
    Then verify that the two product are added successfully to my cart "Sauce Labs Backpack" and "Sauce Labs Onesie"

  @Payment_with_4_cart
  Scenario Outline: Payment with foor carts
    Given i click the checkout button
    When i enter the First Name "<first name>"
    And i enter the Last Name  "<last name>"
    And i enter the Zip Code "<Zip>"
    And i click the continue button
    And i click the finish button
    Then i verify the payment with the message "Thank you for your order!"

    Examples: 
      | first name | last name | zip  |
      | mohamed    | medini    | 9030 |
      | mouadh     | zouaghi   | 1500 |
      | maysem     | zouaghi   | 1910 |
      | tasnim     | medini    | 5864 |
