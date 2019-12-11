package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDescription {
	
	/*
	 * The description for this method.
	 */
	@Test
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	
	@Test(dependsOnMethods= {"SearchProduct"}, description="This method is used to add a product to the cart")
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
