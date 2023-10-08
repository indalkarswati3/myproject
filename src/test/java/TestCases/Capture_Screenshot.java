package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Capture_Screenshot {

	@Test
	public void sc() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
   TakesScreenshot s=(TakesScreenshot)driver;
   
   File scr=s.getScreenshotAs(OutputType.FILE);
   File dist=new File("C:\\Users\\Dell\\Desktop\\screenshots\\pic1.png");
   
   FileUtils.copyFile(scr, dist);
   
   
   
   
	}
	
	
	
}
