package test.apiscenariooutline;


import java.awt.List;
import java.text.MessageFormat;

import org.testng.Assert;
import org.testng.annotations.*;

import test.apiscenariooutline.*;

import cucumber.api.java.*;
import cucumber.api.java.en.*;
import gherkin.formatter.model.DataTableRow;

import java.util.*;
import com.smartbear.readyapi.client.execution.*;
import com.smartbear.readyapi.client.teststeps.TestSteps;
import com.smartbear.readyapi.client.*;
import com.smartbear.readyapi.client.assertions.Assertions;


import cucumber.api.DataTable;
import java.util.ArrayList;

public class TTStepsSampleApiPost {
		
		String tinid="",  tinname="",  tinage="",  tinstatus="",  tinstreet="",  tinzip="";
		@Given("^I execute POST API with attributes (.+),(.+),(.+),(.+),(.+),(.+)$")
	    public void i_execute_post_api_with_attributes_(String inid, String inname, String inage, String instatus, String instreet, String inzip) throws Throwable {
			tinid=inid;  tinname=inname;  tinage=inage;  tinstatus=instatus;  tinstreet=instreet;  tinzip=inzip;
	    }

	    @Then("^The reult will be validated against (.+),(.+),(.+),(.+),(.+),(.+)$")
	    public void the_reult_will_be_validated_against_(String outid, String outname, String outage, String outstatus, String outstreet, String outzip) throws Throwable {
	    	String reportresult = "FINISHED";
	        String msg = "";
	        String studentInputJason="";
	        //studentInputJason = MessageFormat.format("{'id':{0},'name':'{1}','age':{2},'status':{3},'stAddress':{'street':'{4}','zip':'{5}'}}", 
	         
	        String tmp ="{'id':{0},'name':'{1}','age':{2},'status':{3},'stAddress':{'street':'{4}','zip':'{5}'}}";
	        studentInputJason = tmp.replace("{0}", tinid).replace("{1}", tinname).replace("{2}", tinage).replace("{3}", tinstatus).replace("{4}", tinstreet).replace("{5}", tinzip);
	        
	    
	       
	    	TestRecipe recipe = TestRecipeBuilder.newTestRecipe() 
                .addStep(TestSteps.postRequest("http://testapivinod.azurewebsites.net/api/values")
                      .post("http://testapivinod.azurewebsites.net/api/values")
                      .addHeader("Content-Type", "application/json")
                      .withMediaType("application/json")
                      .withRequestBody(studentInputJason)
                      .addAssertion(Assertions.jsonPathContent("$['id']", outid))
                      .addAssertion(Assertions.jsonPathContent("$['name']",outname))
                      .addAssertion(Assertions.jsonPathContent("$['age']", outage))
                      .addAssertion(Assertions.jsonPathContent("$['status']", outstatus))
                      .addAssertion(Assertions.jsonPathContent("$['stAddress']['street']",outstreet))
                      .addAssertion(Assertions.jsonPathContent("$['stAddress']['zip']", outzip))
                )
                .buildTestRecipe();  
                 RecipeExecutor recipeExecutor = new RecipeExecutor(Scheme.HTTP, "testserver.readyapi.io", 8080);  
                 recipeExecutor.addExecutionListener(new TTAppExecutionListener());                                                                           
                 recipeExecutor.setCredentials("demoUser", "demoPassword");  
                 Execution execution = recipeExecutor.executeRecipe(recipe);
                 if (execution != null)
                 {
                     if (execution.getCurrentReport() != null && execution.getCurrentReport().getStatus().toString() == "FAILED")
                     {
                    	
                    	 reportresult = "FAILED";
                         msg = msg + " \n INPUT TABLE ROW ID: " + outid + ";" +  execution.getCurrentReport().getTestSuiteResultReports().get(0).getTestCaseResultReports().get(0).getTestStepResultReports().get(0).getMessages().toString();

                     }
                 }
                 else
                 {
                     reportresult = "FAILED";
                     msg =  msg + " \n INPUT TABLE ROW ID: " + outid +  "System problem, execution failed";
                    
                 }
                 
                
                 Assert.assertEquals("FINISHED", reportresult,msg);
	    }
	    

	

}
