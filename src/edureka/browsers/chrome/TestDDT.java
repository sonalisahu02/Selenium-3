package edureka.browsers.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDDT {
	
	//this will take data from dataprovider which we created
	@Test(dataProvider="testdata")
	public void TestChrome(String username,String password) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		 
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
	}
		
		@DataProvider(name="testdata")
		public Object[][] TestDataFeed(){
			Object [][] gmaildata=new Object[2][2];
			
			gmaildata[0][0]="sonali.sahu02@gmail.com";
			gmaildata[0][1]="myswtmom";

			gmaildata[1][0]="manasnist2005@gmail.com";
			gmaildata[1][1]="abcd11";
			
			return gmaildata;
		}
			
			
			
			
		
		
		
	}
	


