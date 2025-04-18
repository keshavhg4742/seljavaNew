package testngpract;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExam {
	@Test
	public void name() {
		Boolean expectedRes=true;
		Boolean outPutRes=true;
		Assert.assertEquals(outPutRes,expectedRes);
		System.out.println("after assertion of test1");
	}
	@Test
	public void vod() {
		Boolean expectedRes=true;
		Boolean outPutRes=false;
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(outPutRes, expectedRes);
		
	//	Assert.assertEquals(outPutRes,expectedRes);
		System.out.println("after assertion of test2");
		softAssert.assertAll();


	}

}
