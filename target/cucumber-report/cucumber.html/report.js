$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/orangehrm/www/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login funtionality",
  "description": "As a user,I want to login to orangehrm website",
  "id": "login-funtionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13122288300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "login-funtionality;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 151153800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 274392500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 194772100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 51487406600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 62405400,
  "status": "passed"
});
formatter.after({
  "duration": 760159000,
  "status": "passed"
});
formatter.before({
  "duration": 11339249200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should not login successfully with invalid credentials",
  "description": "",
  "id": "login-funtionality;user-should-not-login-successfully-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is login scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User enter the below credentials",
  "rows": [
    {
      "cells": [
        "admin",
        "admin321"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should not login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs1.userIsLoginScenario()"
});
formatter.result({
  "duration": 68200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs1.userEnterTheBelowCredentials(DataTable)"
});
formatter.result({
  "duration": 362241500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs1.userClickOnLoginButton()"
});
formatter.result({
  "duration": 924826300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs1.userShouldNotLoginSuccessfully()"
});
formatter.result({
  "duration": 60602700,
  "status": "passed"
});
formatter.after({
  "duration": 942214400,
  "status": "passed"
});
});