package selepract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=jOwyWZmsI6Lv8we_9KfoCQ&gws_rd=ssl");
		driver.findElement(By.id("APjFqb")).sendKeys("sele");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@role='presentation' and contains(@class,'wM6W7d')]"));
		System.out.println(elements.size());
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
			
		}
		driver.close();
	}

}
