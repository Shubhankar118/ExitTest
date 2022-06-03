package stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import Base.baseFile;
import PageObject.POM5;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination5 extends baseFile {
	public static Logger log = (Logger) LogManager.getLogger(StepDefination5.class.getName());

	
	@When("^the user click on App$")
	public void the_user_click_on_App() throws Throwable {
		POM5 P=new POM5();
		P.appBTN();
		Thread.sleep(1500);

		log.info("App is opened");
	    
	}

	@Then("^user clicks Action Bar$")
	public void user_clicks_Action_Bar() throws Throwable {
	  POM5 p=new POM5();
	  p.actionBTN();
	  Thread.sleep(1500);

	  log.info("Action Bar is working");
	}

	@And("^user clicks on Display$")
	public void user_clicks_on_Display() throws Throwable {
	   POM5 p=new POM5();
	   p.displayBTN();
	   Thread.sleep(1500);

	   log.info("dIsplay Button is working");
	}

	@Then("^user clicks on DisplayShowTitle$")
	public void user_clicks_on_DisplayShowTitle() throws Throwable {
	   POM5 p=new POM5();
	   p.showBTN();
	   Thread.sleep(1500);

	   log.info("Display show title is working");
	}

}
