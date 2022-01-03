package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	
	
    public WebDriver driver; 
     
    @Test
    public void main() {
    	
    	driver.findElement(By.id("identifierId")).sendKeys("sonali.sahu02@gmail.com");
    	
    	driver.findElement(By.className("VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b")).click();
    	 
    	driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("myswtmom");
   
    	
    }
    @BeforeMethod
    public void beforeMethod()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://mail.google.com/");
		 
    }
    @AfterMethod
    
    	public void afterMethod()
    	{
    	driver.quit();
    	}
    	}
    
    
    
 

