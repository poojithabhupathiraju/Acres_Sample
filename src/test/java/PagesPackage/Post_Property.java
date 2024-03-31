package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post_Property {
	WebDriver driver;

	public Post_Property(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//span[text()='Rent / Lease']") WebElement property_Enter1_Invalid;
	@FindBy(xpath="//input[@label='Residential']/following-sibling::label[1]") WebElement property_Enter2_Invalid;
	@FindBy(xpath="//span[text()='Flat/Apartment']") WebElement property_Enter3_Invalid;
	@FindBy(xpath="//input[@data-attr='inputText']") WebElement property_Mobile_Invalid;

	
	
	@FindBy(xpath="//span[text()='Rent / Lease']") WebElement property_Enter1;
	@FindBy(xpath="//input[@label='Residential']/following-sibling::label[1]") WebElement property_Enter2;
	@FindBy(xpath="//span[text()='Flat/Apartment']") WebElement property_Enter3;
	@FindBy(xpath="//input[@data-attr='inputText']") WebElement property_Mobile;
	
	
	//scenario 4
	public void property_Enter1_Invalid(){
		property_Enter1_Invalid.click();

	}
	public void property_Enter2_Invalid() {
		property_Enter2_Invalid.click();
	}
	public void property_Enter3_Invalid() {
		property_Enter3_Invalid.click();
	}
	public void property_Mobile_Invalid() {
		property_Mobile_Invalid.sendKeys("123456");
	}
	
	//scenario 2
	public void property_Enter1() {
		property_Enter1.click();
	}
	public void property_Enter2() {
		property_Enter2.click();
	}
	public void property_Enter3() {
		property_Enter3.click();
	}
	public void property_Mobile() {
		property_Mobile.sendKeys("8328665677");
	}
}
