package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CheckboxTest {
	

  public WebDriver driver;
  String strPath  = System.getProperty("user.dir");
	
  @Test
  public void CheckboxMethods() 
  {
	  WebElement chkSTUDENT = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
	  System.out.println(chkSTUDENT.isDisplayed());
	  System.out.println(chkSTUDENT.isEnabled());
	  System.out.println("Student checkbox status before selecting is : " + chkSTUDENT.isSelected());
	  System.out.println(chkSTUDENT.getAttribute("id"));
	  System.out.println(chkSTUDENT.getAttribute("type"));
	  System.out.println(chkSTUDENT.getAttribute("name"));
	  	  
	  chkSTUDENT.click(); // Select the Student checkbox
	  System.out.println("Student checkbox status after selecting is : " + chkSTUDENT.isSelected());
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
