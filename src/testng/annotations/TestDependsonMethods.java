package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDependsonMethods {
	
	/*
	 * The list of methods this method depends on.
	 * e.g. @Test(dependsOnMethods = { "serverStartedOk" })
	 */

	@Test
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	
	@Test(dependsOnMethods= {"SearchProduct"})
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
