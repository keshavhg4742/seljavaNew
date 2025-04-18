package selepract;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabOpenUsingKey {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		WebElement element = driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
		
		

	}

}
