package PagesPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	WebDriver driver;

	public Home_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id = "inPageSearchForm_1") WebElement HomeSearch1;
	@FindBy(id="keyword2") WebElement HomeSearch2;
	@FindBy(xpath="//*[@data-label='SEARCH_SUBMIT']") WebElement HomeSearch3;
	@FindBy(xpath="//*[@class='pageComponent theader__op1 ']") WebElement PostPropertyOpt;
	@FindBy(xpath="//*[@class ='insightAndUtilities__insightsWrap']") WebElement InsightsScroll;
	@FindBy(xpath="//div[@id  = 'MORE_INSIGHTS_AND_UTILITIES_VIEW_ALL']/button/span") WebElement Insights1;
	@FindBy(xpath="//*[@class='pageComponent theader__op1 ']") WebElement PostPropertyOptNeg;
	@FindBy(xpath="//a[@data-custominfo='{\\\"custom_object\\\":{\\\"url\\\":\\\"https://www.99acres.com/info/privacy\\\"}}']") WebElement PrivacyClick;
	
	public void HomeSearch1() {
		HomeSearch1.click();
	}
	
	public void HomeSearch2() {
		HomeSearch2.sendKeys("Mumbai");
	}
	public void HomeSearch3() {
		HomeSearch3.click();
	}
	public void PostPoropertyOpt() {
		PostPropertyOpt.click();
	}
	public void InsightsScroll() {
		InsightsScroll.click();
	}
	public void Insights1() {
	     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.elementToBeClickable(Insights1));    

	}
	public void PostPropertyOptNeg(){
	   PostPropertyOptNeg.click();
	}
	
	public void PrivacyClick() {
		WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    webDriverWait.until(ExpectedConditions.elementToBeClickable(PrivacyClick));    


	}
	
	
	

}
