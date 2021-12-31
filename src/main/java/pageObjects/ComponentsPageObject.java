package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {
	
	ComponentsPageObject(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Components']")
	private WebElement componentsTab;
	
	@FindBy(xpath = "//a[text()='Mice and Trackballs (0)']")
	private WebElement miceAndTrackball;
	
	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement monitors;
	
	@FindBy(xpath = "//a[text()='Printers (0)']")
	private WebElement printers;
	
	@FindBy(xpath = "//a[text()='Scanners (0)']")
	private WebElement scanners;
	
	@FindBy(xpath = "//a[text()='Web Cameras (0)']")
	private WebElement webCamera;
	
	@FindBy(xpath = "//a[text()='Show All Components']")
	private WebElement showAll;
	
	
	public void componentsTab() {
		componentsTab.click();
	}
	
	public void miceAndTrackball() {
		miceAndTrackball.click();
	}
	
	public void printers() {
		printers.click();
	}
	
	public void monitors() {
		monitors.click();
	}
	
	public void scanners() {
		scanners.click();
	}
	
	public void webCamera() {
		webCamera.click();
	}
	
	public void showAll() {
		showAll.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

