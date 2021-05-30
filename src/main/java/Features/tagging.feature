@FunctionalTest
Feature: free CRM Aplication Testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login Test

@RegressionTest
Scenario: Login with Incorrect username and password
Given This is a Invalid login Test

@SmokeTest
Scenario: Create a contact
Given This is a contact Testcases

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal Testcases

@RegressionTest
Scenario: Create a task
Given This is a task Testcases

@SmokeTest
Scenario: Create a case
Given This is a case Testcases

@SmokeTest @RegressionTest
Scenario: verify left pannel links
Given clicking on left pannel link

@SmokeTest
Scenario: search a deal
Given This is a search deal test

@SmokeTest
Scenario: search a contact
Given This is a search contact test

@SmokeTest @RegressionTest
Scenario: search a case
Given This is a search case test

@SmokeTest @RegressionTest
Scenario: search a task
Given This is a search task test

@SmokeTest @End2End
Scenario: search a call
Given This is a search call test

@SmokeTest @End2End
Scenario: search an email
Given This is a search email test

@SmokeTest @End2End
Scenario: search a docs
Given This is a search docs test

@SmokeTest @End2End
Scenario: search a form
Given This is a search form test

@End2End
Scenario: validate report
Given This is a search report test

@End2End
Scenario: application Logout
Given This is a Logout test


Scenario: browser close
Given This is a close browser test