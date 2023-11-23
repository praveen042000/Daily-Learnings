Feature: Adding the leave reason

  Scenario: Adding the leave details to the category
    Given User is on the orangehrm.com homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks the leave feature
    And user cliks to the configure to the field
    And user select the leavetype and user fills the details cliks the save
    Then user sees the adding the leave page switching
