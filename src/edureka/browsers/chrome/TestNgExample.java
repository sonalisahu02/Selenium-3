package edureka.browsers.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgExample {
	public String baseUrl="https://www.edureka.co/";
	 String driverPath="C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe";
	public WebDriver driver;
	
	@Test
	public void verifyHomePageTitle() {
		
		System.out.println("Chorme driver launched");
		
			System.setProperty("webdriver.chrome.driver",driverPath);
		
			driver=new ChromeDriver();
		 
		
		driver.get(baseUrl);
		String expectedTitle="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";

				String actualTitle=driver.getTitle();
				Assert.assertEquals(actualTitle, expectedTitle);
				driver.close();
	}
			

}
