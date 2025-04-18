package selepract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(col);
		for (int row = 2; row <= 7; row++) {
			for (int co = 1; co <= col; co++) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + row + "]//td[" + co + "]"));
				System.out.print(element.getText() + "\t");

			}
			System.out.println();

		}
		driver.close();

	}

}
