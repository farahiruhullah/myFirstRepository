package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.UtilityClass;

public class AddCanonEos extends Base{
	
	DesktopsPageObject addCanon= new DesktopsPageObject();
	
	
	
	
	@When("user clicks add to cart option on Canon item")
	public void user_clicks_add_to_cart_option_on_canon_item() {
		addCanon.addToCart1();
		logger.info("User clicks on add to cart for canon");
		UtilityClass.takeScreenShot();

	}

	@When("user selects red color from dropdown")
	public void user_selects_red_color_from_dropdown() {
		addCanon.canonColorSelect();
		addCanon.selectRed();
		logger.info("user selects red from dropdown");
		UtilityClass.takeScreenShot();

	}

	@When("user selects quantity one")
	public void user_selects_quantity_one() {
		addCanon.canonQuantity();
		logger.info("user selects one");
		UtilityClass.takeScreenShot();
		
	
	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		addCanon.addToCartCanon();
		logger.info("canon added to cart");
	  
	}

	
	@Then("user should see the msg {string}")
	public void user_should_see_the_msg(String string) {
		Assert.assertTrue(addCanon.canonSuccess());
		logger.info("Canon is successfully added");
		UtilityClass.takeScreenShot();

	}

}
