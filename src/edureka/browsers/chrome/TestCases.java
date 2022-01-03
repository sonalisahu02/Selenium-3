package edureka.browsers.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class TestCases {
	public WebDriver driver;
	
@Test
public void Login(){
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//driver.get("https://www.javatpoint.com/");
	driver.get("https://www.google.com/");
	JavascriptExecutor js=	(JavascriptExecutor)driver;
	driver.manage().window().maximize();
	 driver.findElement(By.name("q")).sendKeys("java tutorial");
	 driver.findElement(By.name("btnK")).click();
	
	//driver.findElement(By.className("gLFyf gsfi")).sendKeys("java tutorial");
	//driver.findElement(By.className("gNO89b")).click();
	
	//driver.findElement(By.cssSelector( "#gsc-i-id1")).sendKeys("Selenium");
	//driver.findElements(By.className("gsc-search-button gsc-search-button-v2")).get(0).click();
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,700)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,800)");
	Thread.sleep(3000);
	}
	catch(Exception e) {
		System.out.println("Exception Message :"+e.getMessage());
	}
		}

public void TestToFail() {
	System.out.println("Failed mathod");
	Assert.assertTrue(false);
	
	
}
	
}

