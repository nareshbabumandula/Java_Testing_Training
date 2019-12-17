package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TextboxTest {
	

  public WebDriver driver;
  String strPath  = System.getProperty("user.dir");
	
  @Test
  public void TextboxMethods() 
  {
	  WebElement USERNAME = driver.findElement(By.name("userName"));
	  System.out.println(USERNAME.isDisplayed());
	  System.out.println(USERNAME.isEnabled());
	  
	  System.out.println(USERNAME.getAttribute("type"));
	  System.out.println(USERNAME.getAttribute("name"));
	  System.out.println(USERNAME.getAttribute("size"));
	  
	  USERNAME.sendKeys("Shravan Patel");
	  
	  String ActualValue = USERNAME.getAttribute("value");
	  
	  if (ActualValue.contains("Shravan Patel")) {
		System.out.println("Successfully enetered the Username : " + ActualValue);
		Reporter.log("Successfully enetered the Username : " + ActualValue);
	} else {
		System.out.println("Failed to enter the Username");
		Reporter.log("Failed to enter the Username");
	}
	  
  }
  
  @BeforeClass
  public void AccessSite() 
  {
	  System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize(); // Maximize the browser window
	  driver.get("http://www.newtours.demoaut.com");
  }

  @AfterClass
  public void TearDown() 
  {
	  driver.quit(); // Terminate the browser
  }

}
