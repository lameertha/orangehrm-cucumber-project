#Feature: Employee Records Display
#  As a user I am able to see the Employee information on PIM Page
#
#  Scenario: User should be able to view valid Employee Records
#    Given I am on Welcome Admin Page
#    When I select Employee Name " Fiona Grace"
#    And I click on search button
#    Then I am able to see the Name in the results
#
#  Scenario: User should not be able to view Invalid Employee Records
#    Given I am on Welcome Admin Page
#    When I select Employee Name "Lameertha Thevarajah"
#    And I click on search button
#    Then I get No Records Message in the results
