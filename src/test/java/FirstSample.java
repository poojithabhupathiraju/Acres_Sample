import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.99acres.com/Home-Real-Estate.htm");
		
		
		driver.findElement(By.xpath("//span[text()=\"All India\"]")).click();
		WebElement searchInput = driver.findElement(By.xpath("//*[@placeholder = 'City Name']"));
		searchInput.sendKeys("Hyder");
		webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'sbar__suggestor']")));
		driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		
		WebElement dropDown = driver.findElement(By.xpath("//li[text()='Hyderabad']//a[contains(text(),'Hyder')]"));
		dropDown.click();
	//	String dropdownoption = searchInput.getText();
		
		

	}

}
