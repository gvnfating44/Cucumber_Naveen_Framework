Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario
    Given User is already on Login Page
    When title of login page is Cogmento CRM
    Then user enter "govind.ukd19@gmail.com" and "govindukd"
    Then user click on login button
    Then user is on home page  