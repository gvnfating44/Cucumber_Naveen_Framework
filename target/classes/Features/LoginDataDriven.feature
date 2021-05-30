Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario
    Given User is already on Login Page
    When title of login page is Cogmento CRM
    Then user enter "<username>" and "<password>"
    Then user click on login button
    Then user is on home page 
    Then close the browser 
    
    Examples:
    | username               | password  |
    | govind.ukd19@gmail.com | govindukd |
    | tom					 | tom456    |