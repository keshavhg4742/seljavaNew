package selepract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIntraction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frm = driver.findElement(By.xpath("//frame[@ src='frame_1.html']"));
		driver.switchTo().frame(frm); // frm 1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("abc");

		driver.switchTo().defaultContent();

		WebElement frm2 = driver.findElement(By.xpath("//frame[@ src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("csk");

		driver.switchTo().defaultContent();

		WebElement frm3 = driver.findElement(By.xpath("//frame[@ src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("srh");
		driver.switchTo().frame(0);// iframe inside frame 3
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();

		driver.switchTo().defaultContent();
		WebElement frm5 = driver.findElement(By.xpath("//frame[@ src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("emsr");

		driver.findElement(By.linkText("https://a9t9.com")).click();

	}

}
