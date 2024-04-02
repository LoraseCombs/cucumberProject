$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/CodefiosLoginDataFromDatabase.feature");
formatter.feature({
  "name": "Codefios page login functionality validation with data from MySQL server",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@codefiosFeature"
    }
  ]
});
formatter.scenario({
  "name": "- User should be able to login with valid credentials from Db",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@codefiosFeature"
    },
    {
      "name": "@codefiosLoginDbScenario1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be landing on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_be_landing_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});