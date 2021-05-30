Feature: Deal data creation

Scenario: Free CRM Create a new dael Scenario
    Given User is already on Login Page
    When title of login page is Cogmento CRM
    Then user enter username and password
    | govind.ukd19@gmail.com | govindukd |
    
    Then user click on login button
    Then user is on home page 
    Then user moves to new deal page
    Then user enters deal details 
    | test deal | 1000 | 50 | 10 |
    Then close the browser