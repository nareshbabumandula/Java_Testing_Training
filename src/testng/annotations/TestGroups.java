package testng.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestGroups {
	
	/*
	 * The list of groups this class/method belongs to.
	 */

	@BeforeSuite
	public void LaunchBrowser()
	{
		System.out.println("Executing LaunchBrowser method...!");
	}
	
	@Test(groups= {"smoke", "regression"})
	public void AccessSite()
	{
		System.out.println("Executing AccessSite method...!");
	}
	
	@Test(groups= {"regression"})
	public void ReadProduct()
	{
		System.out.println("Executing ReadProduct method...!");
	}
	
	@Test(groups= {"smoke", "regression"})
	public void StockAvailability()
	{
		System.out.println("Executing StockAvailability method...!");
	}
	
	@Test(groups= {"smoke"})
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	
	@Test(groups= {"regression"})
	public void SearchMultipleProducts()
	{
		System.out.println("Executing SearchMultipleProducts method...!");
	}
	
	@Test(groups= {"regression"})
	public void AddToCart()
	{
		System.out.println("Executing AddToCart method...!");
	}
	
	@Test(groups= {"regression"})
	public void Checkout()
	{
		System.out.println("Executing Checkout method...!");
	}
	
	@Test(groups= {"regression"})
	public void Payment()
	{
		System.out.println("Executing Payment method...!");
	}
	
	@Test(groups= {"smoke"})
	public void Login()
	{
		System.out.println("Executing Login method...!");
	}
		
	@Test(groups= {"smoke"})
	public void Logout()
	{
		System.out.println("Executing Logout method...!");
	}
	
	@AfterSuite(groups= {"smoke"})
	public void CloseBrowser()
	{
		System.out.println("Executing CloseBrowser method...!");
	}


}
