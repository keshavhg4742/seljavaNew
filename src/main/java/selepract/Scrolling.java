package selepract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll for number of pixcel
		// js.executeScript("window.scrollBy(0,500)", "");

		// sccroll until element visible
		WebElement ele = driver.findElement(By.id("btn2"));
		// js.executeScript("arguments[0].scrollIntoView()", ele);

		// scroll bottom of webpage till end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// print y axiss pixcel
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(4000);
		// return top from bottom
	//	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-350)", "");

	}

}
