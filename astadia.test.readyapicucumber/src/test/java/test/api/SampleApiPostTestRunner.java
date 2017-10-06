package test.api;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		 features = "src/test/java/test/api",
		 glue= {"test.api"},
		 plugin = {"json:target/samplescreenfunctional-report1.json","html:target/cucumber-report/samplescreenfunctional-report1"}
			
		)
public class SampleApiPostTestRunner  extends AbstractTestNGCucumberTests{

}
