package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='PC (0)']")
	private WebElement pc;

	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement mac;

	@FindBy(xpath = " //a[text()='Show All Desktops']")
	private WebElement showAll;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartHP;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCart;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement QuantitySelection;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsg;

	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEos;

	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement reviews;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement nameBox;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement reviewBox;

	@FindBy(xpath = "//input[@value='5']")
	private WebElement goodRating;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement submittionMsg;

	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement desktopText;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement canonColorSelect;

	@FindBy(xpath = "//option[contains(text(),'Red')]")
	private WebElement selectRed;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement canonQuantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartCanon;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement canonSuccess;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCart1;

	public void desktopTab() {
		desktopTab.click();
	}

	public void pc() {
		pc.click();
	}

	public void mac() {
		mac.click();
	}

	public void showAll() {
		showAll.click();
	}

	public void QuantitySelection() {
		QuantitySelection.clear();
		QuantitySelection.sendKeys("1");

	}

	public void addToCartHP() {
		addToCartHP.click();

	}

	public void AddToCart() {
		AddToCart.click();
	}

	public boolean successMsg() {
		if (successMsg.isDisplayed())
			return true;
		else
			return false;
	}

	public void CanonEos() {
		canonEos.click();
	}

	public void reviews() {
		reviews.click();
	}

	public void nameBox(String name) {
		nameBox.sendKeys(name);
	}

	public void reviewBox(String review) {
		reviewBox.sendKeys(review);
	}

	public void goodRating() {
		goodRating.click();
	}

	public void continueButton() {
		continueButton.click();
	}

	public boolean submittionMsg() {
		if (submittionMsg.isDisplayed())
			return true;
		else {
			return false;
		}
	}

	public void desktopText() {
		desktopText.isDisplayed();
	}

	public void canonColorSelect() {
		canonColorSelect.click();
	}

	public void selectRed() {
		selectRed.click();
	}

	public void canonQuantity() {
		canonQuantity.clear();
		canonQuantity.sendKeys("1");

	}

	public void addToCartCanon() {
		addToCartCanon.click();
	}

	public boolean canonSuccess() {
		return canonSuccess.isDisplayed();
		

	}

	public void addToCart1() {
		addToCart1.click();
	}
}
