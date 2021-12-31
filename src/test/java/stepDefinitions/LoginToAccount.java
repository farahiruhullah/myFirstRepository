package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginAccountObjects;

public class LoginToAccount extends Base {

	LoginAccountObjects login = new LoginAccountObjects();

	@Given("user clicks on my account")
	public void user_clicks_on_my_account() {
		login.clickMyAccount();
		logger.info("user clicked on my account tab");

	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		login.clickLogin();
		logger.info("user clicks on login tab");

	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String email, String password) {
		login.sendUserNameAndPass(email, password);
		logger.info("user enters user name and password");

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		login.clickSubmit();
		logger.info("user clicks on login button");

	}

	@Then("user should be logged in to MyAccount")
	public void user_should_be_logged_in_to_my_account() {
		Assert.assertTrue(login.accountTitle());
		logger.info("user sees the account title");

	}

	@When("user clicks on register for an affiliated link")
	public void user_clicks_on_register_for_an_affiliated_link() {
		login.clickAffiliateAccount();
		logger.info("user cliked on affiliated account");

	}

	@When("user fill the information as below")
	public void user_fill_the_information_as_below(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		login.fillCompany(info.get(0).get("company"));
		login.fillWebsite(info.get(0).get("website"));
		login.fillTaxID(info.get(0).get("taxID"));
		login.payeeName(info.get(0).get("payeename"));
		logger.info("user enters the information");

	}

	@When("user checks the about us box")
	public void user_checks_the_about_us_box() {
		login.chequeBox();
		logger.info("user checkes the the payment method");

	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		login.clickContinue();
		logger.info("user cliks on continue");

	}

	@Then("user should be able to see the success msg.")
	public void user_should_be_able_to_see_the_success_msg() {
		Assert.assertTrue(login.accountTitle());
		logger.info("user see the account title page");

	}

	@When("user clicks on bank transfer button")
	public void user_clicks_on_bank_transfer_button() {
		login.clickBankT();
		logger.info("user clicked on bank transfer radio button");

	}

	@When("user fills the bank informatino as follow")
	public void user_fills_the_bank_informatino_as_follow(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> binfo = dataTable.asMaps(String.class, String.class);
		login.bankName(binfo.get(0).get("bankname"));
		login.abaNumber(binfo.get(0).get("aba"));
		login.swiftCode(binfo.get(0).get("swiftcode"));
		login.accountName(binfo.get(0).get("accountname"));
		login.accountNumber(binfo.get(0).get("accountnumber"));
		logger.info("user enters the bank information");
	}
		
	@When("user clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
		login.bankContinue();
		logger.info("user clicks on contiue");
	
		}
			

	

	@Then("user sees the success msg for the edit")
	public void user_sees_the_success_msg_for_the_edit() {
		Assert.assertTrue(login.bankSuccess());
		logger.info("user sees the success text");
	

	}
	
	
	
	@When("user clicks on edit your account information")
	public void user_clicks_on_edit_your_account_information() {
		login.editAccount();
		logger.info("user clicked on edit accoutn info");

	}
	@When("user modifies the information as under")
	public void user_modifies_the_information_as_under(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> editInfo = dataTable.asMaps(String.class, String.class);
		login.editFname(editInfo.get(0).get("fname"));
		login.editLname(editInfo.get(0).get("lname"));
		login.editEmail(editInfo.get(0).get("email"));
		login.editPhone(editInfo.get(0).get("telephone"));
		
		
		
		logger.info("user modifed the inforamtion");

	}
	@When("user clicks on the continue for change")
	public void user_clicks_on_the_continue_for_change() {
		login.editContinue();
		logger.info("user clicked on continue");

	}
	@Then("user sees the success msg for the change\"‘Success: Your account has been successfully updated.\"")
	public void user_sees_the_success_msg_for_the_change_success_your_account_has_been_successfully_updated() {
		Assert.assertTrue(login.succesChange());
		logger.info("user sees the successful msg");

	}

}
