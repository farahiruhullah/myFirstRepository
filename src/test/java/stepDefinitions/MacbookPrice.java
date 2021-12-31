package stepDefinitions;

import org.junit.Assert;

import com.sun.org.apache.bcel.internal.classfile.Utility;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.UtilityClass;

public class MacbookPrice extends Base{
	
	LaptopsNoteBooksPageObject macbookPrice= new LaptopsNoteBooksPageObject();
	
	@When("user clicks on macbook pro")
	public void user_clicks_on_macbook_pro() {
		macbookPrice.macBookProclick();
		logger.info("user clicked on macbook pro");
		UtilityClass.takeScreenShot();
	  
	}

	@Then("user sees ${double} in the page")
	public void user_sees_$_in_the_page(Double double1) {
		Assert.assertTrue(macbookPrice.macbookPrice());
		logger.info("user sees the price of 2000");
		UtilityClass.takeScreenShot();
	   
	}


}
