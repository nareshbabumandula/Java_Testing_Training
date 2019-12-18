package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class LinkTest {
	

  public WebDriver driver;
  String strPath  = System.getProperty("user.dir");
	
  @Test
  public void LinkMethods() 
  {
	  //WebElement lnkAnimals = driver.findElement(By.linkText("Carriage of Live Animals"));
	  WebElement lnkAnimals = driver.findElement(By.partialLinkText("Live Animals"));
	  
	  System.out.println(lnkAnimals.isDisplayed());
	  System.out.println(lnkAnimals.isEnabled());
	  System.out.println(lnkAnimals.getAttribute("href"));
	  System.out.println(lnkAnimals.getText());	  
	  lnkAnimals.click(); // Click on the link - Carriage of Live Animals

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
	  driver.quit(); // Terminate the browser
  }

}
