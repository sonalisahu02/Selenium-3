package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 {
	 WebDriver driver;
	 String nodeUrl;
  @Test
  public void f() {
	  
	  try {
		nodeUrl="http://192.168.1.18:17255/wd/hub";
			DesiredCapabilities capabilities=DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver =new RemoteWebDriver(new URL(nodeUrl),capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.get("http://www.amazon.in");
			driver.findElement(By.linkText("Today's Deals")).click();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
  }
}
