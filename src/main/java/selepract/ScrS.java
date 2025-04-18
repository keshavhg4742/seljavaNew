package selepract;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrS {

	public static void main(String[] args) throws IOException  {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		  File fpFile= new File("./snd.png"); 
		  FileUtils.copyFile(src, fpFile);
		 
		
		
		
		
		
		
	
		
	}

}
