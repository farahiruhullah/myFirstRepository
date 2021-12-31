package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.UtilityClass;

public class AddReviewCanon extends Base {
	
	DesktopsPageObject reviewCanon = new DesktopsPageObject();
	
	
	
	
	@When("user clicks on reveiws tab")
	public void user_clicks_on_reveiws_tab() {
		reviewCanon.reviews();
		logger.info("user clicks on review tab");
		UtilityClass.takeScreenShot();
	  
	}

	@When("user fills the section with follwing information")
	public void user_fills_the_section_with_follwing_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		reviewCanon.nameBox(info.get(0).get("Your name"));
		reviewCanon.reviewBox(info.get(0).get("Your review"));
		logger.info("user fills the the review");
		UtilityClass.takeScreenShot();

	   
	}

	@When("user clicks on the good rating button")
	public void user_clicks_on_the_good_rating_button() {
		reviewCanon.goodRating();
		logger.info("user selects good rating");
		
	    
	}

	@When("user clicks on contintue button")
	public void user_clicks_on_contintue_button() {
		reviewCanon.continueButton();
		logger.info("user clicks continue");
	   
	}

	@Then("user should see the success msg {string}")
	public void user_should_see_the_success_msg(String string) {
	  Assert.assertEquals(string, reviewCanon.canonSuccess());
	  logger.info("user sees the success msg");
	  UtilityClass.takeScreenShot();
	}

}
