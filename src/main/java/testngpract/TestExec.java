package testngpract;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestExec {
	// @Test(invocationCount = 1,dependsOnMethods = {"test2"})

	@Test
	public void test1() {
		System.out.println("test1");
		SoftAssert softAssert = new SoftAssert();
		softAssert.fail();
		System.out.println("after assertion test1");
		softAssert.assertAll();//to show exception 
	}

	@Test
	public void test3() {
		System.out.println("test3");

	}
	@Test
	public void pes() {
		System.out.println("pes");
		
		
	}
	/*
	 * @Test(enabled = true)
	 * 
	 * @Parameters({ "name", "as" }) public void test2(@Optional("h") String s,
	 * String i) { System.out.println(s + " " + i);
	 * 
	 * }
	 */

}
