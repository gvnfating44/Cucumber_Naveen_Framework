Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario
    Given User is already on Login Page
    When title of login page is Cogmento CRM
    Then user enter username and password
    Then user click on login button
    Then user is on home page
    
Scenario: User is able to create a new contact
    Given user is already on home page
    When user mouse over on contact link
    Then user click on new contact link
    Then user enter firstname and lastname
    Then user click on save button
    Then verify new contact created    