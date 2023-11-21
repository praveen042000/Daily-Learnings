Feature: SelectingOrganization

  Scenario: Adding new Organaization Structure
    Given User is on the orangehrm.com homepage
    When User enters the valid username and password
    And User clicks the login button
    And User clicks admin feature
    And user selects Organization category
    And User selects Structure in organaization category
    And User enables Edit function
    And User clicks Add button
    And User enters unit identification number,name,description
    And user clicks save
    Then User should be able to see structure added sucessfully
