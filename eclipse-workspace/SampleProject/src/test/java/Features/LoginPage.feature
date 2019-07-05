
Feature: phptravels Automation testing
  I want to use this template for my feature file

  Scenario Outline: Login functionality
    Given I want navigate to login page
    When I enter username <user>
    And I enter password <pass>
    And I click login button
    Then I check cofirmation message
    
    Examples:
    |   user             |   pass      |
    |dummy.dum@gmail.com |   dummy123       |
    |dum23@gmail.com     |   dum234         |
    

  
