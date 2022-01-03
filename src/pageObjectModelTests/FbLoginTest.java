package pageObjectModelTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModelPages.FbHomePage;
import pageObjectModelPages.FbLoginPage;

public class FbLoginTest extends TestBase { 
	
	@Test
	public void init() throws Exception{
		
		FbLoginPage loginpage=PageFactory.initElements(driver, FbLoginPage.class);
		loginpage.setEmail("sonali.sahu02@gmail.com");
		
		loginpage.setPassword("hariom789");
		loginpage.clickOnLoginButton();
		FbHomePage homepage=PageFactory.initElements(driver, FbHomePage.class);
		Thread.sleep(2000);
		homepage.clickOnProfileDropdown();
		Thread.sleep(2000);
		 homepage.clickOnLogoutLink();
	}
	
		
		
		
	}
	
	
	


