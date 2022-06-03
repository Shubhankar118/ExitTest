package runner;



import org.testng.annotations.Listeners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;


@Listeners({ ExtentITestListenerClassAdapter.class })


@CucumberOptions (
features = "src/test/java/feature",
glue = {"stepDefination","hooks"},



tags = {"@Shub"}
)
public class runnerFile extends AbstractTestNGCucumberTests {
	

}
