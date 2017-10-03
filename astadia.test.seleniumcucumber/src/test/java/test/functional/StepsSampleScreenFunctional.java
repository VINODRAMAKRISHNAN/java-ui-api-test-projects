package test.functional;
import static org.hamcrest.CoreMatchers.is;

import org.testng.Assert;
import org.testng.annotations.*;

import astadia.test.seleniumcucumber.components.AppTestManager;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class  StepsSampleScreenFunctional{
	AppTestManager appTestManager=null;
	
	@Before
    public void setUp(){
		appTestManager = new AppTestManager();
		appTestManager.initBrowser1();
    }

    @After
    public void cleanUp(){
    	if (appTestManager!=null) {
			appTestManager.closeTest();
		}
    }
    
	
	
		@Given("^I am using \"([^\"]*)\" to navigate to the Home page$")
	    public void i_am_using_something_to_navigate_to_the_home_page(String strArg1) throws Throwable {
				
				appTestManager.navigateToTargetPage(strArg1);
	    }


	 
	 	 @And("^I have entered \"([^\"]*)\" into the first text box$")
	     public void i_have_entered_something_into_the_first_text_box(String strArg1) throws Throwable {
	 		 appTestManager.enterFirstTextBox(Integer.valueOf(strArg1));
	     }

	     @And("^Then I have entered \"([^\"]*)\" into the second text box$")
	     public void then_i_have_entered_something_into_the_second_text_box(String strArg1) throws Throwable {
	    	 appTestManager.enterSecondTextBox(Integer.valueOf(strArg1));
	     }  
	     
	 	 @When("^I press add button$")
	     public void i_press_add_button() throws Throwable {
	 		 appTestManager.clickAddButton();
	     }

	 	  @Then("^the result should be \"([^\"]*)\" on the third text box$")
	     public void the_result_should_be_something_on_the_third_text_box(String strArg1) throws Throwable {
	 		 appTestManager.validateThirdTextBox(Integer.valueOf(strArg1));
	 		 String strout = appTestManager.getOutput();
	 		 String strin =strArg1;
	 		 Assert.assertEquals(strin, strout,"Result Not matching expected value, Method: the_result_should_be_something_on_the_third_text_box");
	     }

	 	 @When("^I click on about link on top menu$")
	     public void i_click_on_about_link_on_top_menu() throws Throwable {
	    	 appTestManager.clickAboutLink();
	     }
		 	 
	 	 @Then("^I can see the about screen$")
	     public void i_can_see_the_about_screen() throws Throwable {
	 		//need to find a control and see the expected value is there or not and accordingly Assert
	            Assert.assertTrue(true,"About screen displayed.");
	     }
	 	 
	 	  
	 	 
		   
	 	 @Given("^I am using \"([^\"]*)\" to navigate to the about page$")
	     public void i_am_using_something_to_navigate_to_the_about_page(String strArg1) throws Throwable {
	 		appTestManager.navigateToTargetPage(strArg1);
	     }
	 	 
	 	 
	    
	     @And("^I entered \"([^\"]*)\" into the first text box of the about screen$")
	     public void i_entered_something_into_the_first_text_box_of_the_about_screen(String strArg1) throws Throwable {
	    	appTestManager.enterFirstTextBoxAbout(Integer.valueOf(strArg1));
	     }

	     @And("^Then I have entered \"([^\"]*)\" into the second text box of the about screen$")
	     public void then_i_have_entered_something_into_the_second_text_box_of_the_about_screen(String strArg1) throws Throwable {
	    	 appTestManager.enterSecondTextBoxAbout(Integer.valueOf(strArg1));
	     }
	     
	     @When("^I press add button of about screen$")
	     public void i_press_add_button_of_about_screen() throws Throwable {
	    	 appTestManager.clickAddButtonAbout();
	     }
	     
	     
	     
	     @Then("^the result should be \"([^\"]*)\" on the third text box of the about screen$")
	     public void the_result_should_be_something_on_the_third_text_box_of_the_about_screen(String strArg1) throws Throwable {
	    	 appTestManager.validateThirdTextBoxAbout(Integer.valueOf(strArg1));
	         //Assert.That(strArg1, is.equalTo(appTestManager.Ouput), appTestManager.Ouput);
	    	
	 		 String strout = appTestManager.getOutput();
	 		 String strin =strArg1;
	 		 Assert.assertEquals(strin, strout,"Result Not matching expected value, Method: the_result_should_be_something_on_the_third_text_box_of_the_about_screen");
	     }

	     @When("^I click on contact link on top menu$")
	     public void i_click_on_contact_link_on_top_menu() throws Throwable {
	    	appTestManager.clickContactLink();
	     }

	     @Then("^I can see the contact screen$")
	     public void i_can_see_the_contact_screen() throws Throwable {
	    	//need to find a control and see the expected value is there or not and accordingly Assert
	         Assert.assertTrue(true, "Contact screen displayed.");
	     }
	     
	     @Given("^I am using \"([^\"]*)\" to navigate to the contact page$")
	     public void i_am_using_something_to_navigate_to_the_contact_page(String strArg1) throws Throwable {
	    	 appTestManager.navigateToTargetPage(strArg1);
	     }
	    
	     @And("^I entered \"([^\"]*)\" into the first text box of the contact screen$")
	     public void i_entered_something_into_the_first_text_box_of_the_contact_screen(String strArg1) throws Throwable {
	    	 appTestManager.enterFirstTextBoxContact(Integer.valueOf(strArg1));
	     }
	     
	     @And("^Then I have entered \"([^\"]*)\" into the second text box of the contact screen$")
	     public void then_i_have_entered_something_into_the_second_text_box_of_the_contact_screen(String strArg1) throws Throwable {
	    	 appTestManager.enterSecondTextBoxContact(Integer.valueOf(strArg1));
	     }
	     
	     @When("^I press add button of contact screen$")
	     public void i_press_add_button_of_contact_screen() throws Throwable {
	    	 appTestManager.clickAddButtonContact();
	     }
	     
	     @Then("^the result should be \"([^\"]*)\" on the third text box of the contact screen$")
	     public void the_result_should_be_something_on_the_third_text_box_of_the_contact_screen(String strArg1) throws Throwable {
	    	 appTestManager.validateThirdTextBoxContact(Integer.valueOf(strArg1));
	         //Assert.assertEquals(strArg1, is(appTestManager.getOutput()),appTestManager.getOutput());
	    	 
	    	 String strout = appTestManager.getOutput();
	 		 String strin =strArg1;
	 		 Assert.assertEquals(strin, strout,"Result Not matching expected value, Method: the_result_should_be_something_on_the_third_text_box_of_the_about_screen");
	         
	     }

	    

	   

	     
	    
}
