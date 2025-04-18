package pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "username")
	public static WebElement usn;
	@FindBy(name = "password")
	public static WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginBtn;
	
	/*
	 * public static void setUsn(String s) { usn.sendKeys(s);; }
	 * 
	 * public static void setPwd(String pwd) { LoginPage.pwd.sendKeys(pwd); }
	 * 
	 * public static void clickLoginBtn() { loginBtn.click(); }
	 */
	
	
}
