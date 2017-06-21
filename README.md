# Problem1
Cucumber-Problem1

Prerequisite: This project requires apache maven (version 3.2.3 and above) to be installed on the system.

To run the test go to the root of the project and run the following command:
   mvn clean test -Dtest=com.massmutual.problem1.CucumberRunner
   
The output of the test is created inside target\Test-report directory
And cucumber-html report is created inside target\cucumber-html-report directory

The feature file is availabe in the following location: src\test\resources

Here is a sample of what the HTML report looks like

@myTest
Feature: To test Problem1 page
Scenario: Navigate to problem page and verify individual values

    Given I load Problem1 Page
    When the Problem page is loaded
    Then verify the right number of values appear on the screen
    Then verify values on the screen are greater than 0
    Then total balance is correct
    Then values are formatted as currencies
    Then total balance matches the sum of the values

    org.junit.ComparisonFailure: Check if balanced matches sum of values  expected:<$1000[,000].00> but was:<$1000[].00>

    	at org.junit.Assert.assertEquals(Assert.java:115)

    	at com.massmutual.problem1.stepDefinition.total_balance_matches_the_sum_of_the_values(stepDefinition.java:126)

    	at ✽.Then total balance matches the sum of the values(problem1.feature:12)


