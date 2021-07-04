
Feature: Calculations are correct

  Background: The truth is out there
    Given true is true

  Scenario: We calculate 4+2
    When I add 4 and 2
    Then I expect 6 as result

