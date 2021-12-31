package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;

public class HomePage extends Base{
	
	HomePageObject homepage= new HomePageObject();
	
	
	
	
	@When("user clicks on the currency tab")
	public void user_clicks_on_the_currency_tab() {
		homepage.clickCurrency();
		logger.info("user clicked on currency tab");

	}

	@When("user chooses Euro from the dropdown")
	public void user_chooses_euro_from_the_dropdown() {
		homepage.clickEuro();
		logger.info("user clicked on euro currency");

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homepage.euroCurrency());
		logger.info("user sees the euro currency");

	}
	
	
	@When("user clicks on shopping cart")
	public void user_clicks_on_shopping_cart() {
		homepage.cartTab();
		logger.info("user clicked on shopping cart");

	}
	@Then("user sees the msg {string}")
	public void user_sees_the_msg(String string) {
		Assert.assertTrue(homepage.emptyMsg());
		logger.info("user sees the empty msg of the cart");

	}


}
