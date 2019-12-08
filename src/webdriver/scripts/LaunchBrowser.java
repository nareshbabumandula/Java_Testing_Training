package webdriver.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	WebDriver driver;

	public void AccessSite(String BROWSER, String URL)
	{
		String strPath = System.getProperty("user.dir");

		switch (BROWSER.toLowerCase().trim()) {
		case "ie": case "internet":
			System.setProperty("webdriver.ie.driver", strPath + "\\browsers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		break;
		case "chrome": case "google":
			System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff": case "firefox": case "mozilla":
			System.setProperty("webdriver.gecko.driver", strPath + "\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		// Access Site
		driver.get(URL);
		// Maximize the browser window
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("userName")).sendKeys("Shravan");
		driver.findElement(By.name("password")).sendKeys("Secure1234");
		//driver.quit();

	}


	public static void main(String[] args) {

		LaunchBrowser lb = new LaunchBrowser();
		lb.AccessSite("chrome", "http://newtours.demoaut.com/");
	}

}
