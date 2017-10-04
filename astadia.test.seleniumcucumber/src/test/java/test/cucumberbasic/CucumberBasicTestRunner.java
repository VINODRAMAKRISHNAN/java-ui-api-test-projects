package test.cucumberbasic;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		 features = "src/test/java/test/cucumberbasic",
		 glue= {"test.cucumberbasic"},
		 plugin = {"json:target/cucumberbasic-report.json","html:target/cucumber-report2/cucumberbasic-report"}
			
		)

public class CucumberBasicTestRunner  extends AbstractTestNGCucumberTests{

}
