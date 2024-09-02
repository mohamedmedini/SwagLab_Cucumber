@Add_Product
Feature: Add product to my cart
  I want to add three product to my cart

  Background: 
    Given I enter  url "https://www.saucedemo.com/"
    When I enter  username "standard_user"
    And I enter  password "secret_sauce"
    And I click  login button
    Then I validate  page "https://www.saucedemo.com/inventory.html"

  @Poduct
  Scenario: add product
    Given Choose the first product and click add_to_cart1
    When Choose the seecond product and click add_to_cart2
    And click the cart button
    Then verify that the two product are added successfully to my cart "Sauce Labs Backpack" and "Sauce Labs Onesie" 
