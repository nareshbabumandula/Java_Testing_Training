package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ListboxTest {


	public WebDriver driver;
	String strPath  = System.getProperty("user.dir");

	@Test
	public void RadioButtonMethods() throws InterruptedException 
	{
		WebElement lstCOUNTRY = driver.findElement(By.name("country"));
		System.out.println(lstCOUNTRY.isDisplayed());
		System.out.println(lstCOUNTRY.isEnabled());

		Select country = new Select(lstCOUNTRY);
		country.selectByVisibleText("INDIA");
		country.selectByIndex(1);
		Thread.sleep(2000);

		List<WebElement> lstCountries = driver.findElements(By.tagName("option"));
		int noofCountries = lstCountries.size();
		System.out.println(noofCountries);
				
		for (int i = 0; i<noofCountries; i++) {
			System.out.println(lstCountries.get(i).getText());
			if (lstCountries.get(i).getText().trim().equalsIgnoreCase("INDIA".trim())) {
				break;
			}
		}

		/*for (Iterator iterator = lstCountries.iterator(); iterator.hasNext();) {
			WebElement strCountry = (WebElement) iterator.next();
			System.out.println(strCountry.getText());

		}
		 */

	}

	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the browser window
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	}

	@AfterClass
	public void TearDown() 
	{
		driver.quit(); // Terminate the browser
	}

}
