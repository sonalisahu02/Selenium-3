package edureka.browsers.chrome;

import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {
	public static void main(String[] args) {

		try {		
		System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Courses")).click();
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("a");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("b");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("c");
		  robot.mouseMove(30,100);
		  System.out.println("c");
		  driver.quit(); 
		  
		
		
		
	}
		catch(Exception e) {
			System.out.println("Exception occured : "+ e.getMessage());
		}

}
}
