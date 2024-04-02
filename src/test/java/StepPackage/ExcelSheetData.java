package StepPackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PagesPackage.ExcelData;
import PagesPackage.Home_Page;
import PagesPackage.Post_Property;

public class ExcelSheetData {
	WebDriver driver;
	@DataProvider(name="testdata")
	public Object getData() {
		ExcelData utils=new ExcelData("C:\\Users\\BPOOJITH\\ExcelSheet\\ExcelPhoneNumbers.xlsx");
		int rows=utils.getRowCount(0);
		Object[][] MobileNo=new Object[rows][1];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<1;j++) {
				MobileNo[i][j]=utils.getdata(0,i+1, j);
				System.out.println(MobileNo[i][j]);
			}
		}
		return MobileNo;
		
	}
	@BeforeMethod public void before1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	

		driver.get("https://www.99acres.com/");
		
		Home_Page obj1 = new Home_Page(driver);
		obj1.PostPoropertyOpt();
		
		
	}  
	    //Post_Property post = new Post_Property(driver);
	@Test(dataProvider = "testdata")
	  
	public void MobileDetails(String PhoneNumber) throws InterruptedException {
		
		Thread.sleep(2000);
		 String parenthandle = driver.getWindowHandle();
	      Set<String> handle = driver.getWindowHandles();
	      		for(String s:handle) {
	      			driver.switchTo().window(s);
	      		}
	    Post_Property post = new Post_Property(driver);
	    post.property_Enter1();
	    post.property_Enter2();
	    post.property_Enter3();
	   // Post_Property post = new Post_Property(driver);
	    post.MobileDetails(PhoneNumber);

		
		
		Thread.sleep(6000);
		post.property_start();
		
	      String actualUrl = driver.getCurrentUrl();
	      String expectedUrl = "https://www.99acres.com/postproperty/register";
	      Assert.assertNotEquals(actualUrl,expectedUrl);
	}
		
		
		
	    
	

}
