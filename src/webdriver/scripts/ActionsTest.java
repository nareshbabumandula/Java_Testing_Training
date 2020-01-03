package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ActionsTest {


	public WebDriver driver;
	String strPath  = System.getProperty("user.dir");

	@Test
	public void MenuActionMethods() throws InterruptedException 
	{
		WebElement Pay = driver.findElement(By.xpath("//a[@title='Pay']"));
		Thread.sleep(5000);
		Actions menu = new Actions(driver);
		menu.moveToElement(Pay).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Debit Cards")).click();
	}

	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the browser window
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/online-banking/net-banking");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void TearDown() 
	{
		driver.quit(); // Terminate the browser
	}

}
