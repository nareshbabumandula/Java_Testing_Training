package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPriority {
	
	/*
	 * The priority for this test method. Lower priorities will be scheduled first.
	 */

	@Test
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	
	@Test
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
