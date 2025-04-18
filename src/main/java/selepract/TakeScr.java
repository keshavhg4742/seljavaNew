package selepract;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScr {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File out = new File("./screenshot/scr.png");
		FileUtils.copyFile(screenshot, out);
		//screenshot of element'
		WebElement element = driver.findElement(By.xpath(" //img[@class='wikipedia-icon']"));
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/abc.png");
		screenshotAs.renameTo(dest);
		
	}

}
