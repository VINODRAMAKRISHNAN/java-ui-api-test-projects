package test.apiscenariooutline;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		 features = "src/test/java/test/apiscenariooutline",
		 glue= {"test.apiscenariooutline"},
		 plugin = {"json:target/samplescreenfunctional-report2.json","html:target/cucumber-report/samplescreenfunctional-report2"}
			
		)
public class TTSampleApiPostTestRunner extends AbstractTestNGCucumberTests{

}
