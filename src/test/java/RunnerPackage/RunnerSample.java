package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="FeaturesFolder",
		glue="StepPackage",
		plugin={"pretty","html:target/CucumberReports.html",
				"json:target/CucumberReport/JSONReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
        dryRun= false,
        monochrome=true)

public class RunnerSample  extends AbstractTestNGCucumberTests {

}
