$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zeroHomework.step_definitions.AccountActivityNavigationStepsDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to \"Online Banking\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zeroHomework.step_definitions.AccountActivityNavigationStepsDefs.go_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select \"Account Summary\" in Online Banking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zeroHomework.step_definitions.AccountActivityNavigationStepsDefs.select_in_Online_Banking_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Savings\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zeroHomework.step_definitions.AccountActivityNavigationStepsDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zeroHomework.step_definitions.AccountActivityNavigationStepsDefs.the_page_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Savings\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zeroHomework.step_definitions.AccountActivityNavigationStepsDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});