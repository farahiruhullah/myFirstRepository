package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base{
	
	Mp3PlayersPageObject(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()= 'MP3 Players']")
	private WebElement mp3Tab;
	
	@FindBy(xpath = "//a[text()= 'test 11 (0)']")
	private WebElement test11;
	
	@FindBy(xpath = "//a[text()= 'test 12 (0)']")
	private WebElement test12;
	
	@FindBy(xpath = "//a[text()= 'test 15 (0)']")
	private WebElement test15;
	
	@FindBy(xpath = "//a[text()= 'test 16 (0)']")
	private WebElement test16;
	
	@FindBy(xpath = "//a[text()= 'test 17 (0)']")
	private WebElement test17;
	
	@FindBy(xpath = "//a[text()= 'test 18 (0)']")
	private WebElement test18;
	
	@FindBy(xpath = "//a[text()= 'test 19 (0)']")
	private WebElement test19;
	
	@FindBy(xpath = "//a[text()= 'test 20 (0)']")
	private WebElement test20;
	
	@FindBy(xpath = "//a[text()= 'test 21 (0)']")
	private WebElement test21;
	
	@FindBy(xpath = "//a[text()= 'test 22 (0)']")
	private WebElement test22;
	
	@FindBy(xpath = "//a[text()= 'test 23 (0)']")
	private WebElement test23;
	
	@FindBy(xpath = "//a[text()= 'test 24 (0)']")
	private WebElement test24;
	
	@FindBy(xpath = "//a[text()= 'test 4 (0)']")
	private WebElement test4;
	
	@FindBy(xpath = "//a[text()= 'test 5 (0)']")
	private WebElement test5;
	
	@FindBy(xpath = "//a[text()= 'test 6 (0)']")
	private WebElement test6;
	
	@FindBy(xpath = "//a[text()= 'Show All MP3 Players']")
	private WebElement showAll;
	
	
	public void mp3Tab() {
		mp3Tab.click();
	}
	
	public void test11() {
		test11.click();
	}
	
	public void test12() {
		test12.click();
	}
	
	public void test15() {
		test15.click();
	}
	
	public void test16() {
		test16.click();
	}
	
	public void test17() {
		test17.click();
	}
	
	public void test18() {
		test18.click();
	}
	
	public void test19() {
		test19.click();
	}
	
	public void test20() {
		test20.click();
	}
	
	public void test21() {
		test21.click();
	}
	
	public void test22() {
		test22.click();
	}
	
	public void test23() {
		test23.click();
	}
	
	public void test24() {
		test24.click();
	}
	
	public void test4() {
		test4.click();
	}
	
	public void test5() {
		test5.click();
	}
	
	public void test6() {
		test6.click();
	}
	
	public void showAll() {
		showAll.click();
	}
	
	
	

}
