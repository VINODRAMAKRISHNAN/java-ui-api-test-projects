Feature: As a user, I use multiple browsers and 
	I enter values in the first two text boxes and
	hit add button to get the result in the third text box 
	and navigate to the next page

@mytag1
Scenario Outline: Use multiple browsers and add two numbers in home apge then navigate to about page
	Given I use the <browser> browser in Scenario1:          
	And I am using "http://192.168.1.78:97/" to navigate to the Home page
	And I have entered "70" into the first text box
	And Then I have entered "80" into the second text box
	When I press add button
	Then the result should be "7080" on the third text box
	When I click on about link on top menu 
	Then I can see the about screen
	Examples:
	| browser |
	| firefox |
	| chrome |
	| ie |
	| edge |
	| opera | 
@mytag2
Scenario Outline: Use multiple browsers and add two numbers in about page then navigate to contact page
	Given I use the <browser> browser in Scenario2:
	And I am using "http://192.168.1.78:97/Home/About" to navigate to the about page
	And I entered "100" into the first text box of the about screen
	And Then I have entered "70" into the second text box of the about screen
	When I press add button of about screen
	Then the result should be "10070" on the third text box of the about screen
	When I click on contact link on top menu 
	Then I can see the contact screen
	Examples:
	| browser |
	| firefox |
	| chrome |
	| ie |
	| edge |
	| opera | 
@mytag3
Scenario Outline: Use multiple browsers browsers and add two numbers in contact page then finish
	Given I use the <browser> browser in Scenario3:          
	And I am using "http://192.168.1.78:97/Home/Contact" to navigate to the contact page
	And I entered "200" into the first text box of the contact screen
	And Then I have entered "70" into the second text box of the contact screen
	When I press add button of contact screen
	Then the result should be "20070" on the third text box of the contact screen
	Examples:
	| browser |
	| firefox |
	| chrome |
	| ie |
	| edge |
	| opera | 
