package testngpract;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Common {
	@BeforeMethod
	public void name() {
		System.out.println("before santya");
		
		
	}
	@AfterMethod
	public void na(ITestResult result) {
		System.out.println("after santya");
		if (result.getStatus()==result.FAILURE) {
			System.err.print(result.getMethod());
			
		}		
	
	}

}
