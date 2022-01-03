package exam;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\Asif\\eclipse-workspace\\SnapCucumberFramework\\src\\test\\resources\\demo.feature",
				glue="exam")
public class TestRunner extends AbstractTestNGCucumberTests {

}
