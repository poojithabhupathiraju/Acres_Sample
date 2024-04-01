package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PhoneNumberSearch {
	 
	 @Test(dataProvider = "exceldata")
	  public void PhoneNumberSearch(String phoneNumber) throws InterruptedException{
		  WebDriver driver;
		//  ChromeOptions options= new ChromeOptions();
			//options.addArguments("--disable-notifications");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  

	      driver.navigate().to("https://www.99acres.com/postproperty/");
	      Thread.sleep(2000);
	      WebElement rent = driver.findElement(By.xpath("//div[@id='R']//span[1]"));
		  rent.click();
		  driver.findElement(By.xpath("//input[@label='Residential']/following-sibling::label[1]")).click();
		  driver.findElement(By.xpath("//span[text()='Flat/Apartment']")).click();
	      driver.findElement(By.name("phone")).sendKeys(phoneNumber);
	  	  
	  }
	 @Test
	 @DataProvider(name = "exceldata")
	 public Object[][] a() {
			 ExcelUtility obj = new ExcelUtility("C:\\Users\\BPOOJITH\\ExcelSheet\\ExcelPhoneNumbers.xlsx");
			 int rows = obj.getrowcount(0);
			 System.out.println(rows);
			 Object[][] logindetails = new Object[rows][1];
			 for(int i=0; i<2;i++) {
				 for(int j=0;j<1;j++)
				logindetails[i][j]=obj.getCellData(0, i+1, j);

			 }
			 return logindetails;
	}

}
