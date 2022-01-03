package edureka.browsers.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenersMain {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=	(JavascriptExecutor)driver;
	
		EventFiringWebDriver eventHandler=new EventFiringWebDriver(driver);
		EventCapture eCapture=new EventCapture();
		eventHandler.register(eCapture);
		eventHandler.navigate().to("https://www.edureka.co/blog/");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		 eventHandler.findElement(By.linkText("Software Testing")).click();
		 eventHandler.navigate().to("https://www.edureka.co/all-courses");
		 eventHandler.navigate().back();
		 eventHandler.quit();
		 eventHandler.unregister(eCapture);
		 System.out.println("End of Listener");
		
		
		

	}

}
