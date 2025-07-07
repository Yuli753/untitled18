Feature: login to SauceDemo

  Scenario: Successful login with valid credentials
      Given I am on the SaucaDemo login page
      When I enter username "standard_user"
      And I enter paswword "secret_sauce"
      And I click the login button
      Then I should be redirected to the inventory page