package StepPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

//	@When("User clicks on specific option")
//	public void user_clicks_on_specific_option() {
//	    // Write code here that turns the phrase above into concrete actions
// 		driver.findElement(By.id("inPageSearchForm_1"));
//	}
//
//	@When("user enters the data")
//	public void user_enters_the_data() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("keyword2")).sendKeys("Mumbai");
//	}
//
//	@When("user clicks on search button")
//	public void user_clicks_on_search_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		  driver.findElement(By.xpath("//*[@data-label='SEARCH_SUBMIT']")).click();
//	}
//
//	@Then("user is redirected to other page")
//	public void user_is_redirected_to_other_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//	
	//Scenario 2

//	@When("user clicks on post your property option")
//	public void user_clicks_on_post_your_property_option() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//*[@class='pageComponent theader__op1 ']")).click();
//	}
//
//	@When("user is redirected to next page")
//	public void user_is_redirected_to_next_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.get("https://www.99acres.com/postproperty/");	
//	}
//
//	@When("user Enters the Details")
//	public void user_enters_the_details() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//*[@id='R']/span")).click();
//		driver.findElement(By.xpath("//input[@type='radio' and @label='Residential']"));
//		}
//
//	@When("user Enters the valid mobile Number and fill the form")
//	public void user_enters_the_valid_mobile_number_and_fill_the_form() {
//	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.name("phone")).sendKeys("8328665677");
//	}
//
//	@When("user clicks on start now option")
//	public void user_clicks_on_start_now_option() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("PrimaryDetailsButton")).click();
//	}
//	
	//Scenario 3

	@When("user scrools down to the Insights and Tools Section")
	public void user_scrools_down_to_the_insights_and_tools_section() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user clicks on the view all Insights")
	public void user_clicks_on_the_view_all_insights() {
	    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.xpath("//*[@class ='insightAndUtilities__insightsWrap']")).click();
     try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@class  = 'pageComponent buttons__secondaryRegular     undefined ']")).click();
			
	}

	@Then("user should be redirected to other page")
	public void user_should_be_redirected_to_other_page() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	//Scenario 4

//	@When("user scrolls towards right")
//	public void user_scrolls_towards_right() {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//
//	@When("scrolls towards left")
//	public void scrolls_towards_left() {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//
//	@When("user selects for a specific Testimonial")
//	public void user_selects_for_a_specific_testimonial() {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//
//	@When("user can view the Testimonials page")
//	public void user_can_view_the_testimonials_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//
//	@When("user clicks on the city for filter")
//	public void user_clicks_on_the_city_for_filter() {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//
//	@Then("user can view the Reviews")
//	public void user_can_view_the_reviews() {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//



}
