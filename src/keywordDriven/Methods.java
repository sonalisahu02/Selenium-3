 package keywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Methods {
	public  static  WebDriver driver;
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void navigate()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
	}
	public static void input_Username()
	{
		driver.findElement(By.name("username")).sendKeys("mercury");
	}
	public static void input_Password()
	{
		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	public static void click_Login() throws InterruptedException
	{
		
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	}
	@Test
	public static void verify_login() {
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "Find a flight:Mercury Tours");
	}
	

	public static void closeBrowser()
	{
		driver.quit();
	}
	

	public static void click_Login3()
	{
		
	
	}
	public static void click_Login4()
	{
		
	}
	

	public static void click_Login5()
	{
		
	
	}	
}
