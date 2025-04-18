package testngpract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsExecuter {
	WebDriver driver;
	@Test
	public void login() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		Thread.sleep(4000);
		String v="abcd";
		WebElement element1 = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].value='"+v+"'",element);
			Thread.sleep(4000);
		  js.executeScript("arguments[0].click()",element1);
	//	JSSendkeys(element, v);
		
	}
	public  void JSSendkeys(WebElement element, String data)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+data+"'",element);
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			driver.switchTo().window(next);
			
			
		}
		
	}
}
