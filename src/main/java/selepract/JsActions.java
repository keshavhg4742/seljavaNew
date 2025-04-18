package selepract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	//	driver.findElement(By.id("name")).sendKeys("abcd");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(null, args)
		

	}

}
