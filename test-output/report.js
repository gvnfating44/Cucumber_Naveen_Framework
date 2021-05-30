$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Govind/SeleniumWorkspace/Naveen_FreeCrmDD_Framework_May2021/src/main/java/Features/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal Scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
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
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "govind.ukd19@gmail.com",
        "govindukd"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commition"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 6152632700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.title_of_login_page_is_Cogmento_CRM()"
});
formatter.result({
  "duration": 12246100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 4243787000,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 85661200,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 1695254200,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 3525229700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 20753695700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "duration": 796463500,
  "status": "passed"
});
});