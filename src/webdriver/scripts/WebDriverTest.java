package webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTest {
	
	WebDriver driver;
	String strPath = System.getProperty("user.dir");
	
	public void BrowserMethods()
	{
		try {
			System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // Maximize the browser window
			driver.get("http://www.newtours.demoaut.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.quit(); // Close the browser
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
		}
		
	}
	

	public static void main(String[] args) {
		
		WebDriverTest wd = new WebDriverTest();
		wd.BrowserMethods();

	}

}
