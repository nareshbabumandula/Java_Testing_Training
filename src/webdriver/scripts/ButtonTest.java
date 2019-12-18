package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ButtonTest {
	

  public WebDriver driver;
  String strPath  = System.getProperty("user.dir");
	
  @Test
  public void CheckboxMethods() throws InterruptedException 
  {
	  WebElement btnSubmit = driver.findElement(By.name("btnLogin"));
	  System.out.println(btnSubmit.isDisplayed());
	  System.out.println(btnSubmit.isEnabled());
	  System.out.println(btnSubmit.getAttribute("value"));
	  System.out.println(btnSubmit.getAttribute("type"));
	  System.out.println(btnSubmit.getAttribute("name"));
	  	  
	  btnSubmit.click(); // Click on Submit button
	  Thread.sleep(5000);
  }
  
  @BeforeClass
  public void AccessSite() 
  {
	  System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize(); // Maximize the browser window
	  driver.get("http://demo.guru99.com/");
  }

  @AfterClass
  public void TearDown() 
  {
	  driver.quit(); // Terminate the browser
  }

}
