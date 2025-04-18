package santro.seljava;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SelPar {

	@Test
	@Parameters({"loc","dat"})
	public void main(@Optional("sant") String a,@Optional("kavi") String b) {
		System.out.println(a + b);
		 
	}
}
