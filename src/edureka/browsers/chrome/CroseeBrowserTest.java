package edureka.browsers.chrome;
 
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CroseeBrowserTest {
	WebDriver driver;
	
	
	@BeforeTest 
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Firefox\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
			 driver=new ChromeDriver();
			 
		}
		else {
			System.out.println("Browser Is Not correct");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	}
	@Test
	public void  testParameterWithXml(){
	
	try {
		driver.get("https://www.edureka.co/");
		//WebElement Login=driver.findElement(By.linkText("Log In"));		
		WebElement Login=driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span"));
		Login.click();
		WebElement userName=driver.findElement(By.id("si_popup_email"));
		userName.sendKeys("omkar.hiremath@edureka.co ");
		Thread.sleep(1000);
		WebElement password=driver.findElement(By.id("si_popup_passwd"));
		password.sendKeys("12345678");
		Thread.sleep(1000);		   
//		WebElement Next=driver.findElement(By.xpath("//button[@class=\"clik_btn_log btn-block']"));
		WebElement Next=driver.findElement(By.xpath("//*[@id=\"new_sign_up_optim\"]/div/div/div[2]/div[3]/form/button"));
		
		Next.click();
		Thread.sleep(1000);
		
//		WebElement search=driver.findElement(By.cssSelector("#search-input"));
//		search.sendKeys("selenium");
//		Thread.sleep(4000);
//		WebElement searchbtn=driver.findElement(By.xpath("//span[@class='typehead_button']"));
//		searchbtn.click();
	}
	catch(Exception e){
		System.out.println("Exception occured :" + e.getMessage());
		
	}
	
	
	
	
	

}
}
