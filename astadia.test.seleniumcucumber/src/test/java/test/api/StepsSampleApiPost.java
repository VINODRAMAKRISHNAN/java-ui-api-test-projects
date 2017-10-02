package test.api;



import java.awt.List;

import org.testng.Assert;
import org.testng.annotations.*;

import test.api.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import gherkin.formatter.model.DataTableRow;

import java.util.*;
import com.smartbear.readyapi.client.execution.*;
import com.smartbear.readyapi.client.*;
import com.smartbear.readyapi.client.assertions.Assertions;
import com.smartbear.readyapi.client.execution.RecipeExecutor;
import com.smartbear.readyapi.client.execution.Scheme;
import com.smartbear.readyapi.client.model.*;
import com.smartbear.readyapi.client.teststeps.*;
import com.smartbear.readyapi.client.teststeps.restrequest.RestRequestStepWithBodyBuilder;
import com.smartbear.readyapi.client.teststeps.*;

import cucumber.api.DataTable;
import java.util.ArrayList;


public class StepsSampleApiPost {

		DataTable tblinputreq = null;
	    TestRecipe recipe = null;
    
	    @Given("^I have provided REST API request input student entity as in the below table:$")
	    public void i_have_provided_rest_api_request_input_student_entity_as_in_the_below_table(DataTable inputtable) throws Throwable {
	    	tblinputreq=null;
	    	tblinputreq = inputtable;
	    }

	    @Then("^I execute POST API and the response result should be validated against the following table:$")
	    public void i_execute_post_api_and_the_response_result_should_be_validated_against_the_following_table(DataTable outputvalidationtable) throws Throwable {
	    	 int maxrowcount = 0;
	            String reportresult = "FINISHED";
	            String msg = "";
	            
	            int inputtablerows=0;
	            int outputtablerows=0;
	            
	            inputtablerows= tblinputreq.getGherkinRows().size() ;
	            outputtablerows= outputvalidationtable.getGherkinRows().size();
	            maxrowcount=0;
	            if (tblinputreq.getGherkinRows().size() > 0 && outputtablerows > 0 )
	            {
	                if (inputtablerows == outputtablerows)
	                {
	                	maxrowcount = inputtablerows;
	                }
	                else if (inputtablerows < outputtablerows)
	                {
	                    maxrowcount = inputtablerows;
	                }
	                else if (outputtablerows < inputtablerows)
	                {
	                    maxrowcount = outputtablerows;
	                }
	            }
	            
	            if (maxrowcount>0) {
	            	maxrowcount=maxrowcount-1;
	            }
	            
	            java.util.List<DataTableRow> inbaserows = tblinputreq.getGherkinRows();
            	java.util.List<DataTableRow> rowsin = inbaserows.subList(1, inbaserows.size());
            	
            	
            	
	            for (int i = 0; i < maxrowcount; i++)
	            {
	            	java.util.List<DataTableRow> outbaserows = outputvalidationtable.getGherkinRows();
	            	java.util.List<DataTableRow> r0 = outbaserows.subList(1, outbaserows.size());
	            	String cel0 = r0.get(i).getCells().get(0);//id
	            	String cel1 = r0.get(i).getCells().get(1);//name
	            	String cel2 = r0.get(i).getCells().get(2);//age
	            	String cel3 = r0.get(i).getCells().get(3);//status
	            	String cel4 = r0.get(i).getCells().get(4);//street
	            	String cel5 = r0.get(i).getCells().get(5);//zip
	            	
	            	String inputstr =rowsin.get(i).getCells().get(0);
	            
	                 recipe = TestRecipeBuilder.newTestRecipe() 
	                .addStep(TestSteps.postRequest("http://testapivinod.azurewebsites.net/api/values")
	                      .post("http://testapivinod.azurewebsites.net/api/values")
	                      .addHeader("Content-Type", "application/json")
	                      .withMediaType("application/json")
	                      .withRequestBody(inputstr)
	                      .addAssertion(Assertions.jsonPathContent("$['id']", cel0))
	                      .addAssertion(Assertions.jsonPathContent("$['name']",cel1))
	                      .addAssertion(Assertions.jsonPathContent("$['age']", cel2))
	                      .addAssertion(Assertions.jsonPathContent("$['status']", cel3))
	                      .addAssertion(Assertions.jsonPathContent("$['stAddress']['street']",cel4))
	                      .addAssertion(Assertions.jsonPathContent("$['stAddress']['zip']", cel5))
	                )
	                .buildTestRecipe();  
	                 RecipeExecutor recipeExecutor = new RecipeExecutor(Scheme.HTTP, "testserver.readyapi.io", 8080);  
	                 recipeExecutor.addExecutionListener(new AppExecutionListener());                                                                           
	                 recipeExecutor.setCredentials("demoUser", "demoPassword");  
	                 Execution execution = recipeExecutor.executeRecipe(recipe);
	                 if (execution != null)
	                 {
	                     if (execution.getCurrentReport() != null && execution.getCurrentReport().getStatus().toString() == "FAILED")
	                     {
	                    	
	                         reportresult = "FAILED";
	                         msg = msg + " \n INPUT TABLE ROW: " + (i+1) + ";" +  execution.getCurrentReport().getTestSuiteResultReports().get(0).getTestCaseResultReports().get(0).getTestStepResultReports().get(0).getMessages().toString();

	                     }
	                 }
	                 else
	                 {
	                     reportresult = "FAILED";
	                     msg =  msg + " \n INPUT TABLE ROW: " + (i + 1) +  "System problem, execution failed";
	                    
	                 }
	             }
	            
	            Assert.assertEquals("FINISHED", reportresult,msg);
	            
	            }
}
