package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAlwaysRun {
	
	/*
	 * If set to true, this test method will always be run even if it depends on a method that failed.
	 */
	@Test
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	
	@Test(alwaysRun=true, dependsOnMethods= {"SearchProduct"})
	public void AddToCart()
	{
		System.out.println("Executing AddToCart method...!");
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

}
