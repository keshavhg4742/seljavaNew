package testngpract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dummy {
	 
	WebDriver driver;

	@BeforeMethod
	public void preCos() {
		driver=new ChromeDriver();
	}

	@Test
	public void testCase1() {
		driver.get("https://www.youtube.com");
		System.out.println("Test1");

	}

	@Test
	public void testCase2() {
		driver.get("https://www.google.com");
		System.out.println("Test2");


	}
	@AfterTest
	public void close() {
		//driver.close();
		
		
	}

}
