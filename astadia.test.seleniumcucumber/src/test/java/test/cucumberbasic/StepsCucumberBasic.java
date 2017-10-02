package test.cucumberbasic;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsCucumberBasic {
	int input = 0;
	@Given("^I have entered (\\d+) into the calculator$")
	public void i_have_entered_into_the_calculator(int arg1) throws Throwable {
		  input = input + arg1;
	}
	
	@Given("^You have entered (\\d+) into the calculator$")
	public void you_have_entered_into_the_calculator(int arg1) throws Throwable {
		input = input + arg1;
	}
	
	@When("^I press add$")
	public void i_press_add() throws Throwable {
		  input = input + 100;
	}
	
	@Then("^the result should be (\\d+) on the screen$")
	public void the_result_should_be_on_the_screen(int arg1) throws Throwable {
		 //Assert.areEqual(arg1.toS, , "Result Not matching expected value");
		Assert.assertEquals(arg1, input,"Result Not matching expected value");
	}
}
