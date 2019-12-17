package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ImageTest {
	

  public WebDriver driver;
  String strPath  = System.getProperty("user.dir");
	
  @Test
  public void ImageMethods() 
  {
	  WebElement MERCURYLOGO = driver.findElement(By.xpath("//img[@alt='Mercury Tours']"));
	  System.out.println(MERCURYLOGO.isDisplayed());
	  System.out.println(MERCURYLOGO.isEnabled());

	  System.out.println(MERCURYLOGO.getAttribute("src"));
	  System.out.println(MERCURYLOGO.getAttribute("width"));
	  System.out.println(MERCURYLOGO.getAttribute("alt"));
	  System.out.println(MERCURYLOGO.getAttribute("height"));
	  	  
	  MERCURYLOGO.click(); // Click on Mercury Tours logo image
  
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
