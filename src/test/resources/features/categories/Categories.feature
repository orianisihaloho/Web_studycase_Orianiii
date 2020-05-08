@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "orianisihaloho@gmail.com" on backoffice login page
    And User input password "ani301097" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    When User click Create Category
    When User input random Category name on BackOffice Categories
    When User click save on category page
