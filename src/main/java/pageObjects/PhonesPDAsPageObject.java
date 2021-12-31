package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {

	PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@xpath= '1']")
	private WebElement phoneAndPdaTab;

	@FindBy(xpath = "//i[@class= 'fa fa-th-list']")
	private WebElement phoneList;

	@FindBy(xpath = "//i[@class= 'fa fa-th']")
	private WebElement phoneGrid;

	@FindBy(xpath = "//a[text()='Product Compare (0)']")
	private WebElement productCompare;

	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortBy;

	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement show;

	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement htc;

	@FindBy(xpath = "//img[@alt= 'HTC Touch HD']")
	private WebElement htcImage;

	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphone;

	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphoneImage;

	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palm;

	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmImage;

	public void phoneAndPdaTab() {
		phoneAndPdaTab.click();
	}

	public void phoneList() {
		phoneList.click();
	}

	public void phoneGrid() {
		phoneGrid.click();
	}

	public void productCompare() {
		productCompare.click();
	}

	public void sortBy() {
		sortBy.click();
	}

	public void show() {
		show.click();
	}

	public void htc() {
		htc.click();
	}

	public void htcImage() {
		htcImage.click();
	}

	public void iphone() {
		iphone.click();
	}

	public void iphoneImage() {
		iphoneImage.click();
	}

	public void palm() {
		palm.click();
	}

	public void palmImage() {
		palmImage.click();
	}

}
