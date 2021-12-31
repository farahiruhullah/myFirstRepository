package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement TestEnvironment;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itembutton;
	
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphone;
	
	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinema;
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canon5d;
	
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformation;
	
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement privacyPolicy;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termsAndCondition;
	
	@FindBy(xpath = "//a[text()='OpenCart']")
	private WebElement openCart;
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement returns;
	
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement siteMap;
	
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement brands;
	
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertificate;
	
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement affiliate;
	
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement specials;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Order History']")
	private WebElement orderHistory;
	
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement wishList;
	
	@FindBy(xpath = "//a[text()='Newsletter']")
	private WebElement newsLetter;
	
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[1]/div[3]/div[1]")
	private WebElement bottonPageSwiper;
	
	@FindBy(xpath="//span[contains(text(),'Currency')]")
	private WebElement clickCurrency;
	
	@FindBy(xpath="//button[contains(text(),'€ Euro')]")
	private WebElement clickEuro;
	
	@FindBy(xpath="//span[contains(text(),'Currency')]")
	private WebElement euroCurrency;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartTab;
	
	@FindBy(xpath="//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyMsg;
	
	
	public void cartTab() {
		cartTab.click();
	}
	
	public boolean emptyMsg() {
		if(emptyMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	public void clickCurrency() {
		clickCurrency.click();
	}
	
	public void clickEuro() {
		clickEuro.click();
	}
	
	public boolean euroCurrency() {
		if(euroCurrency.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	public void TestEnvironment() {
		TestEnvironment.click();
	}
	
	public void searchBar() {
		searchBar.click();
	}
	
	public void itembutton() {
		itembutton.click();
	}
	
	public void macBook() {
		macBook.click();
	}
	
	public void appleCinema() {
		appleCinema.click();
	}
	
	public void canon5d() {
		canon5d.click();
	}
	
	public void aboutUs() {
		aboutUs.click();
	}
	
	public void deliveryInformation() {
		deliveryInformation.click();
	}
	
	public void privacyPolicy() {
		privacyPolicy.click();
	}
	
	public void termsAndCondition() {
		termsAndCondition.click();
	}
	
	public void iphone() {
		iphone.click();
	}
	
	public void contactUs() {
		contactUs.click();
	}
	
	public void openCart() {
		openCart.click();
	}
	
	public void returns() {
		returns.click();
	}
	
	public void siteMap() {
		siteMap.click();
	}
	
	public void brands() {
		brands.click();
	}
	
	public void giftCertificate() {
		giftCertificate.click();
	}
	
	public void affiliate() {
		affiliate.click();
	}
	
	public void specials() {
		specials.click();
	}
	
	public void myAccount() {
		myAccount.click();
	}
	
	public void orderHistory() {
		orderHistory.click();
	}
	
	public void wishList() {
		wishList.click();
	}
	
	public void newsLetter() {
		newsLetter.click();
	}
	
	public void bottonPageSwiper() {
		bottonPageSwiper.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
