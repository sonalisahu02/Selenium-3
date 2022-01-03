package edureka.browsers.chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		try {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		//Thread.sleep(3000);
		Actions builder=new Actions(driver);
		//Find the Browse category anchor tag
		builder.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"))).build().perform();
		Thread.sleep(3000);
		//Find the Software testing link
		WebElement link=driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown_menu_multi_level hidden-xs hidden-sm']//li//a[text()='Software Testing']"));
		builder.moveToElement(link).build().perform();
		Thread.sleep(3000);
		//Click on the Software testing link
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown_menu_multi_level hidden-xs hidden-sm']//li//a[text()='Software Testing']")).click();
     	Thread.sleep(3000);
	WebElement act=driver.findElement(By.id("search-input"));
		builder.moveToElement(act).build().perform();
		Thread.sleep(3000); 
		//WebElement search=driver.findElement(By.xpath("//span[@id='search_back_btn']"));
		//builder.moveToElement(search).build().perform();
		Thread.sleep(1000);
		Action seriesOfActions;
		seriesOfActions=builder
				.sendKeys(act,"selenium")
		        //.keyDown(search,Keys.SHIFT)
		        //.keyUp(search,Keys.SHIFT)
		        .build();
		seriesOfActions.perform();
		Thread.sleep(1000);
		driver.quit();
		
		}
		catch(Exception e) {
			System.out.println("Exception occured ::"+ e.getMessage());
		}
		
		
		
	}
}
//
//	private static void build() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void keyUp(WebElement search, Keys shift) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void keyDown(WebElement search, Keys shift) {
//		// TODO Auto-generated method stub
//		
//	}
//	}
//
