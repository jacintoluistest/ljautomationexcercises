package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
import cucumber.StepDefinitions;

@CucumberOptions(features = "src/test/java/",glue = "stepdefinitions")

@Test
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
