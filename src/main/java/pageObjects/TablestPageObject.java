package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObject extends Base {
	
	TablestPageObject(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletTab;
	
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement tabletList;
	
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement tabletGrid;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productCompare;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortBy;
	
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement show;
	 
	@FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxy;
	
	@FindBy(xpath = "//img[@title='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyImage;
	
	public void tabletTab() {
		tabletTab.click();
	}
	
	public void tabletList() {
		tabletList.click();
	}
	
	public void tabletGrid() {
		tabletGrid.click();
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
	
	public void samsungGalaxy() {
		samsungGalaxy.click();
	}
	
	public void samsungGalaxyImage() {
		samsungGalaxyImage.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
