Feature: Deal data creation 

Scenario: Free CRM Create a new deal Scenario
	Given User is already on Login Page 
	When title of login page is Cogmento CRM 
	Then user enter username and password 
		| username               | password  |
		| govind.ukd19@gmail.com | govindukd |
		
	Then user click on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		| title      | amount | probability | commition |
		| test deal1 | 1000   | 50          | 10        |
		| test deal2 | 2000   | 60          | 20        |
		| test deal3 | 3000   | 70          | 30        |
		
	Then close the browser