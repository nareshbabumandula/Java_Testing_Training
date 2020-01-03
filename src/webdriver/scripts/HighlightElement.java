package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class HighlightElement {


	public WebDriver driver;
	String strPath  = System.getProperty("user.dir");

	//Creating a custom function
	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}

	
	@Test
	public void MenuActionMethods() throws InterruptedException 
	{

		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // Switch the WebDriver focus into the frame
		WebElement Source =  driver.findElement(By.id("draggable"));
		highLighterMethod(driver, Source);
		Thread.sleep(1000);
		WebElement Destination =  driver.findElement(By.id("droppable"));
		highLighterMethod(driver, Destination);
		Thread.sleep(1000);

		Actions menu = new Actions(driver);
		menu.dragAndDrop(Source, Destination).perform();
		Thread.sleep(5000);

	}

	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the browser window
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void TearDown() 
	{
		driver.quit(); // Terminate the browser
	}

}
