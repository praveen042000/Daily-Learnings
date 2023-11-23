Feature: Login an account in orangehrm.com

  Scenario: Adding new skill
    Given User is on the orangehrm.com homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks admin feature
    And user select the qualification category
    And user select the add skills category
    And user enter the skill name and typedescription cliked save button
    Then user is able to see the added skilled details
