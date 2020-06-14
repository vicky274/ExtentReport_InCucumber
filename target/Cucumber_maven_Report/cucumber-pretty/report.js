$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Demo Site Form Filling",
  "description": "",
  "id": "demo-site-form-filling",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1929573,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 8596372272,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Demo Site Form Filling Test Scenario",
  "description": "",
  "id": "demo-site-form-filling;demo-site-form-filling-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user enters First Name text in first name field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters Last Name text in last name field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user selects State  in State field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicked on radio button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enters all other fields",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_First_Name_text_in_first_name_field()"
});
formatter.result({
  "duration": 5829009619,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_Last_Name_text_in_last_name_field()"
});
formatter.result({
  "duration": 744144024,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_selects_State_in_State_field()"
});
formatter.result({
  "duration": 192816389,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicked_on_radio_button()"
});
formatter.result({
  "duration": 635517987,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_all_other_fields()"
});
formatter.result({
  "duration": 33492,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 5509039610,
  "status": "passed"
});
});