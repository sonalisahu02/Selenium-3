package edureka.browsers.chrome;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	
	@Test
	public void TestCase1() {
		System.out.println("in TestCase1");
		
	}

	@Test
	public void TestCase2() {
		System.out.println("in TestCase2");
		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in Before Method");
		
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("in After method");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("in After class");
		
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("in Before class");
		
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in Before Test");
		
	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("in after test");
		
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in Before suite");
		
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("in after suite");
		
	}
	

	


	



}
