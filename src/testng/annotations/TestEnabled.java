package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestEnabled {
	
	/*
	 * Whether methods on this class/method are enabled.
	 */
	@Test(enabled=false)
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	
	@Test(enabled=true)
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
