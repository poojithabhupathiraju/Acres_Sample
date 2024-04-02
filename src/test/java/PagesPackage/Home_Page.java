package PagesPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	WebDriver driver;

	public Home_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id = "inPageSearchForm_1")
	WebElement HomeSearch1;
	
	@FindBy(id="keyword2")
	WebElement HomeSearch2;
	
	@FindBy(xpath="//*[@data-label='SEARCH_SUBMIT']") 
	WebElement HomeSearch3;
	
	@FindBy(xpath="//*[@class='pageComponent theader__op1 ']")
	WebElement PostPropertyOpt;
	
	@FindBy(xpath="//*[@class ='insightAndUtilities__insightsWrap']") 
	WebElement InsightsScroll;
	
	@FindBy(xpath="//span[text()='View all Insights']") 
	WebElement Insights1;
	
	@FindBy(xpath="//*[@class='pageComponent theader__op1 ']")
	WebElement PostPropertyOptNeg;
	
	@FindBy(xpath="//a[@href='https://www.99acres.com/info/privacy']") 
	WebElement PrivacyClick;
	
	public void HomeSearch1() {
		HomeSearch1.click();
	}
	
	public void HomeSearch2(String cityName) {
		HomeSearch2.sendKeys(cityName);
	}
	public void HomeSearch3() {
		HomeSearch3.click();
	}
	public void PostPoropertyOpt() {
		PostPropertyOpt.click();
	}
	public void InsightsScroll() {
		
		System.out.println("I am just here");
	}
	public void Insights1() {
	   //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    // wait.until(ExpectedConditions.elementToBeClickable(Insights1)); 		
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement insightsBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='View all Insights']")));
		Point p = insightsBtn.getLocation();
		
		Actions act = new Actions(driver);
		System.out.println(p.x + " "+p.y);
		act.moveToElement(insightsBtn).moveByOffset(10, 10).click().build().perform();

		Insights1.click();

	}
	
	
	public void PostPropertyOptNeg(){
	   PostPropertyOptNeg.click();
	}
	
	public void PrivacyClick(){
		//WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   // webDriverWait.until(ExpectedConditions.elementToBeClickable(PrivacyClick)); 
		
		PrivacyClick.click();


	}
	
	
	

}
