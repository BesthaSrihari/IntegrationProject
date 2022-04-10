package stepsPackage;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(
		Cucumber.class)
@CucumberOptions(
		
		features = "./Features/Patientmanagementsystem.feature",
		glue = "Steps",
		monochrome = true,
		plugin= {"pretty","html:test-output"}
		)

public class Runner {

}
