package StepPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import PagesPackage.Home_Page;
import PagesPackage.Post_Property;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepSample {
	
	WebDriver driver;
	@Given("user is on the landing page")
	public void user_is_on_the_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	

		driver.get("https://www.99acres.com/");
	}

	@When("user open the 99Acres website")
	public void user_open_the_99acres_website() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user should see the 99Acres App home page")
	public void user_should_see_the_99acres_app_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	//Scenario 1

	@When("User clicks on specific option")
	public void user_clicks_on_specific_option() {
//	    // Write code here that turns the phrase above into concrete actions
// 	//	driver.findElement(By.id("inPageSearchForm_1")).click();;
//		Product_Search pro1 = new Product_Search(driver);
//		pro1.search1();
		Home_Page obj1 = new Home_Page(driver);
		obj1.HomeSearch1();
		
   }
//
   @When("user enters the data")
    public void user_enters_the_data() {
//	    // Write code here that turns the phrase above into concrete actions
//		Product_Search pro2 = new Product_Search(driver);
//		pro2.search2();
		Home_Page obj1 = new Home_Page(driver);
		obj1.HomeSearch2();
	}
//
	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		 Home_Page obj1 = new Home_Page(driver);
		 obj1.HomeSearch3();;
	}

	@Then("user is redirected to other page")
	public void user_is_redirected_to_other_page() {
	    // Write code here that turns the phrase above into concrete actions
	}
//	
	//Scenario 4

	@When("user clicks on post your property option")
	public void user_clicks_on_post_your_property_option() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//*[@class='pageComponent theader__op1 ']")).click();
		Home_Page obj1 = new Home_Page(driver);
		obj1.PostPoropertyOpt();
	}
//
	@When("user is redirected to next page")
	public void user_is_redirected_to_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.get("https://www.99acres.com/postproperty/");	
	
		
	}
//
	@When("user Enters the Details")
	public void user_enters_the_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);

		//WebElement rent = driver.findElement(By.xpath("//span[text()='Rent / Lease']"));
		//rent.click();
		//driver.findElement(By.xpath("//input[@label='Residential']/following-sibling::label[1]")).click();
	   // driver.findElement(By.xpath("//span[text()='Flat/Apartment']")).click();
	    String parenthandle = driver.getWindowHandle();
	      Set<String> handle = driver.getWindowHandles();
	      		for(String s:handle) {
	      			driver.switchTo().window(s);
	      		}
	    Post_Property post = new Post_Property(driver);
	    post.property_Enter1();
	    post.property_Enter2();
	    post.property_Enter3();
	    
		
		
	}
//
	@When("user Enters the valid mobile Number and fill the form")
	public void user_enters_the_valid_mobile_number_and_fill_the_form() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // driver.findElement(By.name("phone")).sendKeys("8328665677");
		
		//driver.findElement(By.xpath("//input[@data-attr='inputText']")).sendKeys("8328665677");
		Post_Property post = new Post_Property(driver);
		post.property_Mobile();
		
		
	}
//
	@When("user clicks on start now option")
	public void user_clicks_on_start_now_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'pageComponent ')]")).click();
		

	}

//	
	//Scenario 2

	@When("user scrools down to the Insights and Tools Section")
	public void user_scrools_down_to_the_insights_and_tools_section() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("user clicks on the view all Insights")
	public void user_clicks_on_the_view_all_insights() {
	    // Write code here that turns the phrase above into concrete actions
   //  driver.findElement(By.xpath("//*[@class ='insightAndUtilities__insightsWrap']")).click();
   //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
   //  WebElement insightButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id  = 'MORE_INSIGHTS_AND_UTILITIES_VIEW_ALL']/button/span"))));
   //  insightButton.click();
	// driver.findElement(By.xpath("(//span[text()='View all Insights']")).click();
		String parenthandle = driver.getWindowHandle();
	      Set<String> handle = driver.getWindowHandles();
	      		for(String s:handle) {
	      			driver.switchTo().window(s);
	      }
		Home_Page obj1 = new Home_Page(driver);
		obj1.InsightsScroll();
		
		
	      		
	    obj1.Insights1();
					
   }
////
	@Then("user should be redirected to other page")
	public void user_should_be_redirected_to_other_page() {
	    WebElement insightTitle = driver.findElement(By.id("INSIGHTS_HEADING"));
	    String checkTitle =insightTitle.getText();
		SoftAssert as=new SoftAssert();
		as.assertEquals(checkTitle,"Discover Best Places to Live!");
		System.out.println(checkTitle);
	}
//	
	//Scenario 3
	@When("user clicks on the post property option")
	public void user_clicks_on_the_post_property_option() {
	    // Write code here that turns the phrase above into concrete actions
	 //driver.findElement(By.xpath("//*[@class='pageComponent theader__op1 ']")).click();
		Home_Page obj1 = new Home_Page(driver);
		obj1.PostPropertyOptNeg();

	}
//
	@When("user is redirected to the next page")
	public void user_is_redirected_to_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
	//driver.get("https://www.99acres.com/postproperty/");	

	}
//
	@When("user Enters the required details")
	public void user_enters_the_required_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
			//WebElement rent = driver.findElement(By.xpath("//span[text()='Rent / Lease']"));
			//rent.click();
			//driver.findElement(By.xpath("//input[@label='Residential']/following-sibling::label[1]")).click();
		   // driver.findElement(By.xpath("//span[text()='Flat/Apartment']")).click();
		Post_Property postInvalid = new Post_Property(driver);
		postInvalid.property_Enter1_Invalid();
		postInvalid.property_Enter2_Invalid();
		postInvalid.property_Enter3_Invalid();
		
			
	}

//	@When("user Enters the Invalid phone Number and it displays error message")
//	public void user_enters_the_invalid_phone_number_and_it_displays_error_message() {
//	    // Write code here that turns the phrase above into concrete actions
//		//WebElement phoneNum = driver.findElement(By.name("phone"));
//		//phoneNum.sendKeys("123456");
//		Post_Property postInvalid = new Post_Property(driver);
//		postInvalid.property_Mobile_Invalid();
//		
//		WebElement errorMsg = driver.findElement(By.xpath("//*[@class = 'eoiLyr_inpLabel caption_subdued_large']"));
//		Assert.assertTrue(errorMsg.isDisplayed(),"That looks like an invalid number");
//	}
	
	@When("user Enters the Invalid {string}")
	public void user_enters_the_invalid(String phoneNumber) {
	    // Write code here that turns the phrase above into concrete actions
		Post_Property postInvalid = new Post_Property(driver);
		postInvalid.property_Mobile_Invalid(phoneNumber);
		
	}

	@When("it displays error message")
	public void it_displays_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement errorMsg = driver.findElement(By.xpath("//*[@class = 'eoiLyr_inpLabel caption_subdued_large']"));
    	Assert.assertTrue(errorMsg.isDisplayed(),"That looks like an invalid number");
	}

//
	@Then("user clicks on the start Now option")
	public void user_clicks_on_the_start_now_option() {
	    // Write code here that turns the phrase above into concrete actions
	}
//	
	
	//scenario 5
	
	@When("user scroll to footer section")
	public void user_scroll_to_footer_section() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	@When("user click on privacy policy link")
	public void user_click_on_privacy_policy_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	//	WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));

    //  WebElement privacybutton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-custominfo='{\"custom_object\":{\"url\":\"https://www.99acres.com/info/privacy\"}}']")));
			Home_Page obj1 = new Home_Page(driver);
			obj1.PrivacyClick();
			
	}

	@Then("user is redirected to privacy policy page")
	public void user_is_redirected_to_privacy_policy_page() {
	    // Write code here that turns the phrase above into concrete actions
		  String parenthandle = driver.getWindowHandle();
	      Set<String> handle = driver.getWindowHandles();
	      		for(String s:handle) {
	      			driver.switchTo().window(s);
	      		}
	      String actualUrl = driver.getCurrentUrl();
	      String expectedUrl = "https://www.99acres.com/info/privacy";
	      Assert.assertEquals(actualUrl,expectedUrl);
	}
//


	
	

}
