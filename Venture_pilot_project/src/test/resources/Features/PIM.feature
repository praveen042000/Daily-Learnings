Feature: Acessing the new user

  Scenario: Adding new user in PIM
    Given User is on the orangehrm.com homepage
    When User enters the valid username and password
    And User clicks the login button
    And User select the pim feature
    And Select the add employee category
    And user fills the add employee details
    Then user is able to see the new employee added details
