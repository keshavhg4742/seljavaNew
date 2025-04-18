package selepract;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExamp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		WebElement table = driver.findElement(By.xpath("//div[@id='leftcontainer']//tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < col.size(); j++) {
				System.out.print(col.get(j).getText() + "\t");

			}
			System.out.println();
		}

		/*
		 * List<WebElement> elements = driver.findElements(By.xpath("//tbody//tr//td"));
		 * for (WebElement e : elements) { System.out.print(e.getText() + "\t"); }
		 */

		driver.close();
	}

}
