package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="FeaturesFolder",
		glue="StepPackage")
public class RunnerSample  extends AbstractTestNGCucumberTests {

}
