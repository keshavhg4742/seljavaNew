package selepract;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(selepract.ExtentReportEx.class)
public class ExtentreExamp {

	
	@Test
	public void test1() {
		
		System.out.println("test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertFalse(true);

	}
}
