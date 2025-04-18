package selepract;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderPerform {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement element = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		Point point = element.getLocation();
		System.out.println("loc of pointer"+point);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 100, 250).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//span[2]"));
		Point point2 = element2.getLocation();
		System.out.println("loc of pointer2"+point2);
		actions.dragAndDropBy(element2, -50, 216).perform();
		

	}

}
