package edureka.browsers.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\Java\\Framework\\Selenium_Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement SourceElement=driver.findElement(By.id("draggable"));
		WebElement TargerElement=driver.findElement(By.id("droppable")) ;
		Actions actions=new Actions(driver);
		actions.dragAndDrop(SourceElement, TargerElement).build().perform();
		actions.clickAndHold(SourceElement).moveToElement(TargerElement).release().build().perform();
		driver.quit();

	}

}
