package testNg;
import org.testng.annotations.Test;

public class Testcase1 extends Baseclass {

	@Test(priority = 1, description = "This test case is to test Home Loan functionality")
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan");
		
	}
	
	@Test(priority = 2, description = "This test case is to test Home Loan functionality")
	public void HomeLoanTest1() {
		System.out.println("Inside Home Loan1");
		
	}
	
	
	@Test(priority = 0, groups= {"sanity"},description = "This test case is to test Car Loan functionality") // Will not run if (enabled = false)
	public void CarLoanTest() {
		System.out.println("Inside Car Loan");
		
	}
	

}
