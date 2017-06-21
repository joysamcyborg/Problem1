$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("problem1.feature");
formatter.feature({
  "line": 2,
  "name": "To test Problem1 page",
  "description": "",
  "id": "to-test-problem1-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@myTest"
    }
  ]
});
formatter.before({
  "duration": 4341924846,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to problem page and verify individual values",
  "description": "",
  "id": "to-test-problem1-page;navigate-to-problem-page-and-verify-individual-values",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I load Problem1 Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the Problem page is loaded",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify the right number of values appear on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify values on the screen are greater than 0",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "total balance is correct",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "values are formatted as currencies",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "total balance matches the sum of the values",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.i_load_problem1_page()"
});
formatter.result({
  "duration": 4140186727,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_enter_and()"
});
formatter.result({
  "duration": 5362146,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verify_the_right_number_of_values_appear_on_the_screen()"
});
formatter.result({
  "duration": 72632,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verify_values_on_the_screen_are_greater_than_0()"
});
formatter.result({
  "duration": 91580,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.total_balance_is_correct()"
});
formatter.result({
  "duration": 93159,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.values_are_formatted_as_currencies()"
});
formatter.result({
  "duration": 92764,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.total_balance_matches_the_sum_of_the_values()"
});
formatter.result({
  "duration": 1416722,
  "error_message": "org.junit.ComparisonFailure: Check if balanced matches sum of values  expected:\u003c$1000[,000].00\u003e but was:\u003c$1000[].00\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.massmutual.problem1.stepDefinition.total_balance_matches_the_sum_of_the_values(stepDefinition.java:126)\r\n\tat ✽.Then total balance matches the sum of the values(problem1.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1599272336,
  "status": "passed"
});
});