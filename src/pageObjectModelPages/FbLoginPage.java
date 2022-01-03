package pageObjectModelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbLoginPage {

	WebDriver driver;
	
	public FbLoginPage(WebDriver driver) {
		this.driver=driver;

}
	@FindBy(how=How.XPATH,using ="//input[@id='email']") WebElement emailTestBox;
	@FindBy(how=How.XPATH,using ="//input[@type='password'][@name='pass']") WebElement passwordTestBox;
	
	@FindBy(how=How.XPATH,using ="//input[@type=''submit'][@value='Log In ") WebElement signinButton;
	
	public void setEmail(String strEmail) {
		emailTestBox.sendKeys(strEmail);
		
	}

	public void setPassword(String strPassword) {

		
			passwordTestBox.sendKeys(strPassword);
			
		}		
	

	public void clickOnLoginButton() {
		signinButton.click();

		
	}
}	
	
	
	
