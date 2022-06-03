package stepDefination;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Base.baseFile;
import PageObject.POM1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination1 extends baseFile {
	public static Logger log = LogManager.getLogger(StepDefination1.class.getName());

	@Given("^Open the emulator$")
	public void open_the_emulator() throws Throwable {
		launchapp();
		Thread.sleep(1500);
		log.info("Emulator is working");
	}

	@Then("^the user click on Accessibility$")
	public void the_user_click_on_Accessibility() throws Throwable {
		POM1 I=new POM1();
	    I.assibilityBTN();
	    Thread.sleep(1500);
	    log.info("accessibility is opened");
	   
	}

	@And("^user click on Node Querying$")
	public void user_click_on_Node_Querying() throws Throwable {
		POM1 I=new POM1();
		I.nodeQueryingBTN();
		Thread.sleep(1500);
	    log.info("Node  querying is opened");

	}

	@Then("^the user click on Do Taxes$")
	public void the_user_click_on_Do_Taxes() throws Throwable {
	    
		POM1 I=new POM1();
		I.dotaxesBTN();
		Thread.sleep(1500);
	    log.info("Do taxes is opened");

	}


}
