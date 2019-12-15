package webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	
	WebDriver driver;
	String strPath = System.getProperty("user.dir");
	
	public void BrowserMethods()
	{
		try {
			System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // Maximize the browser window
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
		// TODO Auto-generated method stub

	}

}
