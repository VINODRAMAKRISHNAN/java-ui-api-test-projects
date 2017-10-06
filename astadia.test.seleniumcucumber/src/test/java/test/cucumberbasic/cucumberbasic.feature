Feature: Basic cucumber test
	In order to understand the cucumber example
	Add sum of two numbers and show me the result

@mytag
Scenario: Add two numbersUnitTest
	Given I have entered 50 into the calculator
	And I have entered 70 into the calculator
	And You have entered 80 into the calculator
	When I press add
	Then the result should be 300 on the screen
	
