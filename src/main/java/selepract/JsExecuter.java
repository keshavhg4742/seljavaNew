package selepract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecuter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement name = driver.findElement(By.id("name"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='abcd'", name); OR
		
		  js.executeScript("arguments[0].setAttribute('value','abcde')", name);
		  
		  WebElement gender = driver.findElement(By.id("male"));
		  js.executeScript("arguments[0].click()", gender);
		 
	}

}
