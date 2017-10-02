package test.api;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		 features = "src/test/java/test/api",
		 glue= {"test.api"},
		 plugin = {"json:target/samplescreenfunctional-report.json","html:target/cucumber-report2/samplescreenfunctional-report.html"}
			
		)
public class SampleApiPostTestRunner  extends AbstractTestNGCucumberTests{

}
