package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public static WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By Login=By.xpath("//input[@id='Login']");
	
	
	public WebElement enterusername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}

	public WebElement clickonlogin()
	{
		return driver.findElement(Login);
	}
}
