package hybridFreamework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	 
	public static WebDriver driver;
	 public static void openBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		    driver=new ChromeDriver();
	 }
	 public static void navigate()
	 {
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		 driver.get("http://newtours.demoaut.com/");
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

}
