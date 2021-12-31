package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;

public class Comparison extends Base {
	
	LaptopsNoteBooksPageObject compare= new LaptopsNoteBooksPageObject();
	
	
	@When("user clicks on MacBook comparison")
	public void user_clicks_on_mac_book_comparison() {
		compare.MacbookCompare();
		logger.info("user clicked on macbook compare");

	}
	@When("user clicks on MacBook Air comparison")
	public void user_clicks_on_mac_book_air_comparison() {
		compare.MacbookAirCompare();
		logger.info("user clicked on macbookair compare");
		
	}
	
	@Then("user should see the {string}")
	public void user_should_see_the(String string) {
		Assert.assertTrue(compare.successAddToCart());
		logger.info("user sees the msg of success for compare");
	
	}
	@Then("user clicks on comparison hyperlink")
	public void user_clicks_on_comparison_hyperlink() {
		compare.compareLink();
		logger.info("user clicks on the compare hyperlink");
		

	}
	@Then("user see the compariosn chart")
	public void user_see_the_compariosn_chart() {
		Assert.assertTrue(compare.comparePageTitle());
		logger.info("user sees the compare page");

	}

}
