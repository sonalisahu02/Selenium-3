package seleniumJenkinsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumJnkDemo {
	@Test
	public void JenkinsTest()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Hii,Welcome to Jenkins Project");
	System.out.println("this is my first jenkin project");
	
	 driver.navigate().to("https://www.amazon.in");
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung S9");
	driver.findElement(By.xpath("//*[@id='icp-nav-flyout']")).click();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 
	 driver.navigate().back();
	 String title=driver.getTitle();
	 System.out.println("page Title is:-" + title);
	 
	// driver.navigate().to();
	 
	 
	 
	 
	 

}
}
