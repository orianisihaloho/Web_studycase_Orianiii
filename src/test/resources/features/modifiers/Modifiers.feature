@Web @Categories
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "orianisihaloho@gmail.com" on backoffice login page
    And User input password "ani301097" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    When User click Create Modifier button
    When User input modifier name "Topping Choco"
    When User click add or manage options
    When User click add options
    When User input nameoption "Choco Oreo"
    When User input priceoption "50000"
    When User click save on add option pop up
    When User click save on modifier
