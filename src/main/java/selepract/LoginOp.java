package selepract;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagelib.LoginPage;

public class LoginOp {
	
	@Test
	public void ExeLogin()
	{
		WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, LoginPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*
		 * LoginPage.setUsn("Admin"); LoginPage.setPwd("admin123");
		 * LoginPage.clickLoginBtn();
		 */
		LoginPage.usn.sendKeys("Admin");
		LoginPage.pwd.sendKeys("admin123");
		LoginPage.loginBtn.click();
		driver.close();
	}

}
