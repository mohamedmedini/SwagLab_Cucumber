@Sauce_Demo_Ahtnentification
Feature: Sauce Demo connect
  I want to login to sauce demo 

  @connect_data
  Scenario: connect to sauce demo data
    Given I enter  url "https://www.saucedemo.com/"
    When I enter  username "standard_user"
    And I enter  password "secret_sauce"
    And I click  login button
    Then I validate  page "https://www.saucedemo.com/inventory.html"

  