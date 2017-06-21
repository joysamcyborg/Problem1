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
    