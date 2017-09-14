@Ready
Feature: Credible site basic test feature

  Scenario: basic scenario
    Given Credible home page is opened
    And I proceed to personal loans page and enter loan amount
    And I enter personal loan request data
    Then I enter profile loan request data
    And I submit loan request

