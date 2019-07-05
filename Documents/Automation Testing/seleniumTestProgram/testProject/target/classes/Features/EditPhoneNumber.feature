Feature: Edit Phone number in Eligibility
  I want to use this template for my feature file

  Background: 
    Given I navigate to Search page

  Scenario Outline: Edit Phone Number
    And I enter "<FirstName>" in the First Name text field
    And I enter "<LastName>" in the Last Name text field
    When I click the Search button
    And I click the "<Record>" record from the search results
    Then I am on the Home page
    When I click the Edit link
    And I enter "6142225555" in the Home Phone phone field
    And I enter "6148884444" in the Cell Phone phone field
    And I enter "6148888888" in the Work Phone phone field
    And I click the Save link
    Then I verify that Home Phone text field has "(614)222-5555"
    And I verify that Cell Phone text field has "(614)888-4444"
    And I verify that Work Phone text field has "(614)888-8888"

    Examples: 
      | FirstName | LastName | Record |
      | Jon       | Miller   | Fourth |
      | Jonas     | Miller   | Second |

  @sample
  Scenario: Edit Phone Number
    And I enter search criteria using the following
      | FirstName | LastName |
      | Jon       | Miller   |
    When I click the Search button
    And I click the "Fourth" record from the search results
    Then I am on the Home page
    When I click the Edit link
    And I enter "6142225555" in the Home Phone phone field
    And I enter "6148884444" in the Cell Phone phone field
    And I enter "6148888888" in the Work Phone phone field
    And I click the Save link
    Then I verify that Home Phone text field has "(614)222-5555"
    And I verify that Cell Phone text field has "(614)888-4444"
    And I verify that Work Phone text field has "(614)888-8888"
