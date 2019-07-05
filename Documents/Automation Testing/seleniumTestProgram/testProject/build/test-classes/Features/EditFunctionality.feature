@edit-functionality
Feature: Edit functionality in Eligibility
  I wanted to make sure that the edit functionality via eligibility is working as expected

  Background: 
    Given I navigate to Search page

  @mutiple-iterations @regression @edit-phone
  Scenario Outline: Edit Phone Number for mutiple iterations
  	Given I navigate to Search page
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

  @data-table @non-core-regression @edit-phone
  Scenario: Edit Phone Number using Data table
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

  @single-iteration @smoke @edit-phone
  Scenario: Edit Phone Number for a single iteration
    And I enter "Jon" in the First Name text field
    And I enter "Miller" in the Last Name text field
    When I click the Search button
    And I click the "Third" record from the search results
    Then I am on the Home page
    When I click the Edit link
    And I enter "6142225555" in the Home Phone phone field
    And I enter "6148884444" in the Cell Phone phone field
    And I enter "6148888888" in the Work Phone phone field
    And I click the Save link
    Then I verify that Home Phone text field has "(614)222-5555"
    And I verify that Cell Phone text field has "(614)888-4444"
    And I verify that Work Phone text field has "(614)888-8888"
