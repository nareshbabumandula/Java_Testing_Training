package oops;

public class ClassA {

	int a=10;
	int b=20;
	
	public void Addition()
	{
		int c =a+b;
		System.out.println("Addition of a and b is : " + c);
	}
		
	public void Substraction()
	{
		int c =a-b;
		System.out.println("Substraction of a and b is : " + c);
	}
	
	
	public ClassA() {
		System.out.println("I'm a constructor of ClassA");
	}
	
}
