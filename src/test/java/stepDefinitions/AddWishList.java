package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.UtilityClass;

public class AddWishList extends Base {
	
	LaptopsNoteBooksPageObject wish= new LaptopsNoteBooksPageObject();

	
	@When("user clicks on the heart icon for Sony VaIO to wish list")
	public void user_clicks_on_the_heart_icon_for_sony_va_io_to_wish_list() {
		wish.sonyWish();
		logger.info("user cliced on the heart button for sony");
		UtilityClass.takeScreenShot();

	}

	@Then("user should witness the {string}")
	public void user_should_witness_the(String string) {
		Assert.assertTrue(wish.wishSuccessMsg());
		logger.info("user sees the msg after clicking heart");
		UtilityClass.takeScreenShot();

	}
	

}
