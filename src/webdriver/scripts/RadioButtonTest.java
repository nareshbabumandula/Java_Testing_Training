package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class RadioButtonTest {
	

  public WebDriver driver;
  String strPath  = System.getProperty("user.dir");
	
  @Test
  public void RadioButtonMethods() 
  {
	  WebElement RoundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
	  System.out.println(RoundTrip.isDisplayed());
	  System.out.println(RoundTrip.isEnabled());
	  System.out.println("RoundTrip radio button status before selecting is : " + RoundTrip.isSelected());
	  System.out.println(RoundTrip.getAttribute("id"));
	  System.out.println(RoundTrip.getAttribute("type"));
	  System.out.println(RoundTrip.getAttribute("name"));
	  	  
	  RoundTrip.click(); // Click the Radio button - Round Trip
	  System.out.println("RoundTrip radio button status after selecting is : " + RoundTrip.isSelected());
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
