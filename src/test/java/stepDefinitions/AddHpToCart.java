package stepDefinitions;

import com.sun.org.apache.bcel.internal.classfile.Utility;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DesktopsPageObject;
import utilities.UtilityClass;

public class AddHpToCart extends Base{
	
	DesktopsPageObject addHp= new DesktopsPageObject();
	
	
	
	
	@Given("user is on tek retail website")
	public void user_is_on_tek_retail_website() {
		String actualtitle= driver.getTitle();
		String expected= "TEK SCHOOL";
		Assert.assertEquals(expected, actualtitle);
		logger.info("Expected matches the actual title");
		UtilityClass.takeScreenShot();
		
				

	}

	@When("user clicks on Desktop tab")
	public void user_clicks_on_desktop_tab() {
		addHp.desktopTab();
		logger.info("clicked on Desktop tab");
		

	}

	@When("clicks on Show All desktops")
	public void clicks_on_show_all_desktops() {
		addHp.showAll();
		logger.info("clicked on showAll");
		UtilityClass.takeScreenShot();

	}

	@When("user clicks on Add to Cart for HP LP3065")
	public void user_clicks_on_add_to_cart_for_hp_lp3065() {
		addHp.addToCartHP();
		logger.info("user adds hp to cart");
		UtilityClass.takeScreenShot();
		
	}

	@When("user enters one quantity")
	public void user_enters_one_quantity() {
		addHp.QuantitySelection();

	}

	@When("userclis on add to cart button")
	public void userclis_on_add_to_cart_button() {
		addHp.AddToCart();
		logger.info("user clicked on add to cart for HP");
	 
	}

	@Then("user should see messege of {string}")
	public void user_should_see_messege_of(String string) {
		addHp.successMsg();
	    
	}

}
