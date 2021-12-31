package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;

public class LaptopsAndNotebooks extends Base {
	
	LaptopsNoteBooksPageObject lapNote= new LaptopsNoteBooksPageObject();
	
	@Given("user is on retail website")
	public void user_is_on_retail_website() {
		
	  
	}

	@When("user clicks on laptop and notebook tab")
	public void user_clicks_on_laptop_and_notebook_tab() {
		lapNote.laptopNotebookTab();
	}

	@When("user clicks on show all laptop and notebooks option")
	public void user_clicks_on_show_all_laptop_and_notebooks_option() {
		lapNote.allLaptopsAndNotebooks();
	}

	@Then("user can see all the available products")
	public void user_can_see_all_the_available_products() {
	
	}


}
