package stepDefination;





import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import Base.baseFile;
import PageObject.POM4;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination4 extends baseFile {
	public static Logger log = (Logger) LogManager.getLogger(StepDefination4.class.getName());


	
	@When("^the user click on Views$")
	public void the_user_click_on_Views() throws Throwable {
		
		POM4 q=new POM4();
		q.viewBTN();
		Thread.sleep(2000);
	    log.info("Views is open");

		
	}
	@Then("^user scroll down page$")
	public void user_scroll_down_page() throws Throwable {
		scrolldown();
		Thread.sleep(1500);
		scrolldown();
		log.info("scroll  is working");

	}

	@And("^user click on Search view$")
	public void user_click_on_Search_view() throws Throwable {
		POM4 q=new POM4();
		q.searchViewBTN();
		Thread.sleep(1500);
	}

	@Then("^the user click on Action Bar$")
	public void the_user_click_on_Action_Bar() throws Throwable {
		POM4 q=new POM4();
		q.actionBTN();
		Thread.sleep(1500);
		log.info("Action Bar is working");

	}

	@And("^user again click on searcH$")
	public void user_again_click_on_searcH() throws Throwable {
		POM4 q=new POM4();
		q.SearchBTN();
		log.info("search is working");
	}

	@Then("^user enter the (.*)$")
	public void user_enter_the_Search(String Search) throws Throwable {
	    POM4 q=new POM4();
	    q.searcHBTN(Search);
	    
	    
	   
	}
}
