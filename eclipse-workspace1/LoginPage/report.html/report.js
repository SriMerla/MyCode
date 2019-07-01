$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login1.feature");
formatter.feature({
  "line": 2,
  "name": "Test on login functionality",
  "description": "I want to use this template for my feature file",
  "id": "test-on-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "The user must login with valid username and password",
  "description": "",
  "id": "test-on-login-functionality;the-user-must-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user checks confirmation message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});