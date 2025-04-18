package selepract;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithchTabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.orangehrm.com");
		driver.quit();
		
	}

}
