package selepract;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) {
		int totalBrokenLinks = 0;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> href = driver.findElements(By.tagName("a"));
		System.out.println("total links =" + href.size());
		for (WebElement hrLinks : href) {
			@Nullable
			String reflinks = hrLinks.getAttribute("href");
			if (reflinks.isEmpty() || reflinks == null) {
				System.out.println("links are empty not having resources" + reflinks);
				continue;

			}
			try {
				// URI urls=new URI(reflinks);
				URL urls = new URL(reflinks);

				HttpURLConnection connection = (HttpURLConnection) urls.openConnection();
				connection.connect();
				if (connection.getResponseCode() >= 400) {
					System.out.println("no of broken links =" + reflinks);
					totalBrokenLinks++;
				} else {
					System.out.println("valid links" + reflinks);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("total broken links are =" + totalBrokenLinks);

	}

}
