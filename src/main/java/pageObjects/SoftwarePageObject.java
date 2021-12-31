package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {
	
	SoftwarePageObject (){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath= "//a[text()='Software']")
	private WebElement softwareTab;
	
	
public void softwareTab() {
	softwareTab.click();
}
	
	
	

}
