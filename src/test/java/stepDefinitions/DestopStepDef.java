package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;

public class DestopStepDef extends Base{
	
	DesktopsPageObject desktopObjects= new DesktopsPageObject();
	
	
	@When("user clicks on Desktops tab")
	public void user_clicks_on_desktops_tab() {
		desktopObjects.desktopTab();
		logger.info("user clicked on Desktops");
	
	}

	@When("clicks on Show All desktop")
	public void clicks_on_show_all_desktop() {
		desktopObjects.showAll();
		logger.info("user clicked on Show All Desktop");
		
	 
	}

	@Then("user should see all the items present in Desktop Page")
	public void user_should_see_all_the_items_present_in_desktop_page() {
		desktopObjects.desktopText();
	}	
	  
}
	