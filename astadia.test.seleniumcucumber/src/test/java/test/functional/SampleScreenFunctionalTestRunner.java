package test.functional;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		 features = "src/test/java/test/functional",
		 glue= {"test.functional"},
		 plugin = {"json:target/samplescreenfunctional-report.json","html:target/cucumber-report2/samplescreenfunctional-report.html"}
			
		)
public class SampleScreenFunctionalTestRunner  extends AbstractTestNGCucumberTests{

}


