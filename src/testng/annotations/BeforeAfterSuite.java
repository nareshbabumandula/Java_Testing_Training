package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterSuite {
	
	/*
	 * @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	   @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	   @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	   @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	   @BeforeMethod: The annotated method will be run before each test method.
	   @AfterMethod: The annotated method will be run after each test method
	 */

	@BeforeSuite
	public void LaunchBrowser()
	{
		System.out.println("Executing LaunchBrowser method...!");
	}
	
	@BeforeTest
	public void AccessSite()
	{
		System.out.println("Executing AccessSite method...!");
	}
	
	@BeforeMethod
	public void ReadProduct()
	{
		System.out.println("Executing ReadProduct method...!");
	}
	
	@AfterMethod
	public void StockAvailability()
	{
		System.out.println("Executing StockAvailability method...!");
	}
	
	@Test
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	
	@Test
	public void SearchMultipleProducts()
	{
		System.out.println("Executing SearchMultipleProducts method...!");
	}
	
	@BeforeClass
	public void Login()
	{
		System.out.println("Executing Login method...!");
	}
		
	@AfterClass
	public void Logout()
	{
		System.out.println("Executing Logout method...!");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("Executing CloseBrowser method...!");
	}
	
	@AfterSuite
	public void TearDown()
	{
		System.out.println("Executing TearDown method...!");
	}

}
