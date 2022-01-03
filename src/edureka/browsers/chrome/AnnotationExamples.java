package edureka.browsers.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExamples {
	public String baseUrl="https://www.edureka.co/";
	 String driverPath="C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	    public void launchBrowser() {
		
		    System.out.println("Chorme driver launched");
		    System.setProperty("webdriver.chrome.driver",driverPath);
		
			driver=new ChromeDriver();
			driver.get(baseUrl);
			
	}
	
	@Test
	public void verifyHomePageTitle() {
	  
			String expectedTitle="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";

			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void terminateBrowser(){
			driver.close();
	}
		 

}

