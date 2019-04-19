@regression @amazon
Feature: Amazon feature


  @amazon-1
  Scenario: Verify amazon search result
    Given I am on home page of amazon
    When I select Sports and Outdoors department dropdown
    And I enter spalding basketball into search text field
    And I click on search icon in amazon site
    Then I verify total search result value should be greater than 2000

  @amazon-2
  Scenario: Verify invalid registration in amazon
    Given I am on home page of amazon
    When I click on sign in button
    And I click on create your amazon account on login screen
    And I enter name as Bibi Begum on field on create account screen
    And I enter email as begumnur502@gmail.com on field on create account screen
    And I enter password as test12345 on field on create account screen
    And I enter re-enter-password as test12345 on field on create account screen
    And I click on create your amazon account button on create account screen
    Then I verify validation message header There was a problem
