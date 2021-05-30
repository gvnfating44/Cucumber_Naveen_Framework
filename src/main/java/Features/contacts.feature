Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact Scenario
    Given User is already on Login Page
    When title of login page is Cogmento CRM
    Then user enter "<username>" and "<password>"
    Then user click on login button
    Then user is on home page 
    Then user moves to new contact page
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then close the browser 
    
    Examples:
    | username               | password  | firstname | lastname | position |
    | govind.ukd19@gmail.com | govindukd | Tom       | peter    | manager  |
    | govind.ukd19@gmail.com | govindukd | devid     | dsouza   | director |	
    			 