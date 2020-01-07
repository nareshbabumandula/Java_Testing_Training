package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class MultipleWindows {
	

  public WebDriver driver;
  String strPath  = System.getProperty("user.dir");
	
  @Test
  public void CheckboxMethods() 
  {
	 String mainwindowID = driver.getWindowHandle();
	 System.out.println(mainwindowID);
	 driver.findElement(By.linkText("Tariffs")).click();
	 Set<String> windowsIDs = driver.getWindowHandles();
	 System.out.println(windowsIDs);
	 
	 for (String winID : windowsIDs) {
		if (!(winID.contains(mainwindowID))) {
			driver.switchTo().window(winID).close(); // Switch the webdriver to a particular tab
		}
	}
  }
  
  @BeforeClass
  public void AccessSite() 
  {
	  System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize(); // Maximize the browser window
	  driver.get("https://www.spicejet.com/");
  }

  @AfterClass
  public void TearDown() 
  {
	  //driver.quit(); // Terminate the browser
  }

}
