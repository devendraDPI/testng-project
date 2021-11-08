package testNg;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass {

	@Test(groups= {"sanity"},description = "This test case is to test Credit Card functionality", dependsOnMethods = "CCTest")
	public void CreditCardTest() {
		System.out.println("Inside Credit Card");
		
	}
	
	@Test(groups= {"sanity"},description = "This test case is to test Credit Card1 functionality")
	public void CCTest() {
		System.out.println("Inside CC1");
		
	}

}
