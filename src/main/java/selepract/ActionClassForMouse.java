package selepract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassForMouse {
	@Test
	public void met() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(4));
		driver.get("https://mvnrepository.com/");
		WebElement element = driver.findElement(By.linkText("Categories"));
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).contextClick(element).build().perform();

		System.out.println(element.getText());
		// driver.close();
	}

}
