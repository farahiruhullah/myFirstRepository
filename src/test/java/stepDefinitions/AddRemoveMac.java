package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pageObjects.LaptopsNoteBooksPageObject;
import utilities.UtilityClass;

public class AddRemoveMac extends Base{
	
	LaptopsNoteBooksPageObject addRemove= new LaptopsNoteBooksPageObject();
	
	
	@When("user clicks on lapto and notebook tab")
	public void user_clicks_on_lapto_and_notebook_tab() {
		addRemove.laptopNotebookTab();
		logger.info("user clicked on laptopnotebook tab");
		UtilityClass.takeScreenShot();

	}

	@When("user clicks on showall laptops and notebooks")
	public void user_clicks_on_showall_laptops_and_notebooks() {
		addRemove.allLaptopsAndNotebooks();
		logger.info("user clicked on all tab");
		UtilityClass.takeScreenShot();

	}

	@When("user clicks on macbook item")
	public void user_clicks_on_macbook_item() {
		addRemove.clickMacbook();
		logger.info("user clicked on macbook");
		UtilityClass.takeScreenShot();

	}

	@When("user clicks on add to cart button for macbook")
	public void user_clicks_on_add_to_cart_button_for_macbook() {
		addRemove.clickAddToCart();
		logger.info("user clicked on add to cart for macbook");
		UtilityClass.takeScreenShot();

	}

	@Then("user see the msg {string}")
	public void user_see_the_msg(String string) {
		Assert.assertTrue(addRemove.successAddToCart());
		logger.info("user sees the success msg for cart");
		UtilityClass.takeScreenShot();
	    
	}

	@Then("user should see {string} on the cart button")
	public void user_should_see_on_the_cart_button(String string) {
		Assert.assertTrue(addRemove.cartTotal());
		logger.info("user sees the cart total");
		UtilityClass.takeScreenShot();

	}

	@Then("user clicks on the cart button")
	public void user_clicks_on_the_cart_button() {
		addRemove.cartButton();
		logger.info("user clicks on the cart button");
		UtilityClass.takeScreenShot();
	
	}

	@Then("user clicks on the red x button to remove")
	public void user_clicks_on_the_red_x_button_to_remove() {
		addRemove.removeButton();
		logger.info("user removes the cart item");
		UtilityClass.takeScreenShot();

	}

	@Then("item should be removed and cart should be at {string}")
	public void item_should_be_removed_and_cart_should_be_at(String string) {
		Assert.assertTrue(addRemove.cartButtonAfter());
		logger.info("user see an empty cart button");
		UtilityClass.takeScreenShot();
	
	}

	

}
