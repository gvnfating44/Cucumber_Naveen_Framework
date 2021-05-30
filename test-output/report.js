$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Govind/SeleniumWorkspace/Naveen_FreeCrmDD_Framework_May2021/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new contact Scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-contact-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Cogmento CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "govind.ukd19@gmail.com",
        "govindukd"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 8180020400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.title_of_login_page_is_Cogmento_CRM()"
});
formatter.result({
  "duration": 10015600,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 8135740400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 199384400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 1441629900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 1705830500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 8768992700,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 974751300,
  "status": "passed"
});
});