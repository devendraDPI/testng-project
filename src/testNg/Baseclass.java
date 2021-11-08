package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	@BeforeTest (alwaysRun = true)
	public void BeforeTestMethod() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Inside Before Class");
		
	}
	
	@BeforeMethod (alwaysRun = true)
	public void setup() {
		System.out.println("Inside Setup Method");
		
	}
	
	@AfterMethod (alwaysRun = true)
	public void teardown() {
		System.out.println("Inside After Method");
		
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Inside After Class");
		
	}
	
	@AfterTest (alwaysRun = true)
	public void AfterTestMethod() {
		System.out.println("Inside After Test");
	}
}
