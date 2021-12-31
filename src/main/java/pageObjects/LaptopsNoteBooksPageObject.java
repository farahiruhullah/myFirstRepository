package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {
	
	public LaptopsNoteBooksPageObject (){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickLaptopNotebookTab;
	
	@FindBy(xpath = "//a[text()='Macs (0)']")
	private WebElement macLaptop;
	
	@FindBy(xpath = "//a[text()='Windows (0)']")
	private WebElement windowsLaptop;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks'] ")
	private WebElement clickAllLaptopsAndNotebooks;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement clickMacbook;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement clickAddToCart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAddToCart;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartTotal;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartButton;
	
	@FindBy(xpath="//button[@title='Remove']")
	private WebElement removeButton;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartButtonAfter;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement MacbookCompare;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement MacbookAirCompare;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement compareMsg;
	
	@FindBy(xpath="//a[normalize-space() = 'Product Compare (2)']")
	private WebElement compareLink;
	
	@FindBy(xpath="//h1[text()='Product Comparison']")
	private WebElement comparePageTitle;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement sonyWish;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/a[3]")
	private WebElement wishSuccessMsg;
	
	@FindBy(xpath="//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookProclick;
	
	@FindBy(xpath="//h2[contains(text(),'$2,000.00')]")
	private WebElement macbookPrice;
	
	
	
	
	
	public void laptopNotebookTab() {
		clickLaptopNotebookTab.click();
	}
	
	public void macLaptop() {
		macLaptop.click();
	}
	
	public void windowsLaptop() {
		windowsLaptop.click();
	}
	
	public void allLaptopsAndNotebooks() {
		clickAllLaptopsAndNotebooks.click();
	}
	
	public void clickMacbook() {
		clickMacbook.click();
	}
	
	public void clickAddToCart() {
		clickAddToCart.click();
		
	}
	
	public boolean successAddToCart() {
		if(successAddToCart.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public boolean cartTotal() {
		if(cartTotal.isDisplayed())
		return true;
		else
			return false;
	}
	
	public void cartButton() {
		cartButton.click();
	}
	
	public void removeButton() {
		removeButton.click();
	}
	
	public boolean cartButtonAfter() {
		if(cartButtonAfter.isDisplayed())
		return true;
		else
			return false;
	}
	
	public void MacbookCompare() {
		MacbookCompare.click();
	}
	
	public void MacbookAirCompare() {
		MacbookAirCompare.click();
	}
	
	public boolean compareMsg() {
		if(compareMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void compareLink() {
		compareLink.click();
		
	}
	
	public boolean comparePageTitle() {
		if(comparePageTitle.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void sonyWish() {
		sonyWish.click();
	}
	
	public boolean wishSuccessMsg() {
		if(wishSuccessMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void macBookProclick() {
		macBookProclick.click();
	}
	
	public boolean macbookPrice() {
		if(macbookPrice.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
