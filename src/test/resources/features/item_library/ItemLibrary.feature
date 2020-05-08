@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "orianisihaloho@gmail.com" on backoffice login page
    And User input password "ani301097" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    When User click create item button
    When user input random item name on BackOffice Item Library
    When User click categorized
    When user input price "50000"
    When User input SKU "Reg"
    When User add variant
    When User click add variant button
    When User input variant "Large"
    When User input variant price "50000"
    When User input variant sku "Reg"
    When User clcik confirm
    When User choose modifier
    When User click save

