package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginAccountObjects extends Base {
	
	public LoginAccountObjects(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	private WebElement clickMyAccount;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement clickLogin;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement clickEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement enterPass;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickSubmit;
	
	@FindBy(xpath="//h2[contains(text(),'My Account')]")
	private WebElement accountTitle;
	
	@FindBy(xpath="//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement clickAffiliateAccount;
	
	@FindBy(xpath="//input[@id='input-company']")
	private WebElement fillCompany;
	
	@FindBy(xpath="//input[@id='input-website']")
	private WebElement fillWebsite;
	
	@FindBy(xpath="//input[@id='input-tax']")
	private WebElement fillTaxID;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[1]/label/input")
	private WebElement chequeBox;
	
	@FindBy(xpath="//input[@id='input-cheque']")
	private WebElement payeeName;
	
	@FindBy(xpath="//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement clickAboutUs;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	private WebElement clickContinue;
	
	@FindBy(xpath="//body/div[@id='account-account']/div[1]")
	private WebElement updateMsg;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label/input")
	private WebElement clickBankT;
	
	@FindBy(xpath="//input[@id='input-bank-name']")
	private WebElement bankName;
	
	@FindBy(xpath="//input[@id='input-bank-branch-number']")
	private WebElement abaNumber;
	
	@FindBy(xpath="//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	
	@FindBy(xpath="//input[@id='input-bank-account-name']")
	private WebElement accountName;
	
	@FindBy(xpath="//input[@id='input-bank-account-number']")
	private WebElement accountNumber;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	private WebElement bankContinue;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement bankSuccess;
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editAccount;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement editFname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement editLname;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement editEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement editPhone;
	
	@FindBy(xpath="//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement editContinue;
	
	@FindBy(xpath="//body/div[@id='account-account']/div[1]")
	private WebElement succesChange;
	
	public void editAccount() {
		editAccount.click();
	}
	
	public void editFname(String fname) {
		editFname.clear();
		editFname.sendKeys(fname);
	}
	
	public void editLname(String lname) {
		editLname.clear();
		editLname.sendKeys(lname);
	}
	
	public void editEmail(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);
	}
	
	public void editPhone(String telephone) {
		editPhone.clear();
		editPhone.sendKeys(telephone);
	}
	
	public void editContinue() {
		editContinue.click();
	}
	
	public boolean succesChange() {
		if(succesChange.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	public void clickAffiliateAccount() {
		
		clickAffiliateAccount.click();
	}
	
	public void fillCompany(String company) {
		fillCompany.clear();
		fillCompany.sendKeys(company);
	}
	
	public void fillWebsite(String web) {
		fillWebsite.clear();
		fillWebsite.sendKeys(web);
	}
	
	public void fillTaxID(String taxId) {
		fillTaxID.clear();
		fillTaxID.sendKeys(taxId);
	}
	
	public void chequeBox() {
		
		chequeBox.click();
	}
	
	public void payeeName(String cheqName) {
		payeeName.clear();
		payeeName.sendKeys(cheqName);
		
	}
	
	public void clickAboutUs() {
		clickAboutUs.click();
	}
	
	public void clickContinue() {
		clickContinue.click();
	}
	
	public boolean updateMsg() {
		if(updateMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickBankT() {
		clickBankT.click();
	}
	
	public void bankName(String bankname) {
		bankName.clear();
		bankName.sendKeys(bankname);
	}
	
	public void abaNumber(String aba) {
		abaNumber.clear();
		abaNumber.sendKeys(aba);
	}
	
	public void swiftCode(String swiftcode) {
		swiftCode.clear();
		swiftCode.sendKeys(swiftcode);
	}
	
	public void accountName(String accountname) {
		accountName.clear();
		accountName.sendKeys(accountname);
	}
	
	public void accountNumber(String accountnumber) {
		accountNumber.clear();
		accountNumber.sendKeys(accountnumber);
	}
	
	public void bankContinue() {
		bankContinue.click();
	}
	
	public boolean bankSuccess() {
		if(bankSuccess.isDisplayed())
			return true;
		else
			return false;
	}
	

	
	
	public void clickMyAccount() {
		clickMyAccount.click();
	}
	
	public void clickLogin() {
		clickLogin.click();
	}
	
	public void sendUserNameAndPass(String userName, String pass) {
		clickEmail.sendKeys(userName);
		enterPass.sendKeys(pass);
	}	
	
	public void clickSubmit() {
		clickSubmit.click();
	}
	
	public boolean accountTitle() {
		if(accountTitle.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

