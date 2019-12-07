package oops;

public class MethodOverridingTest extends MethodOverloadTest{


	public void Substraction(int a, int b)
	{
		int c = b-a;
		System.out.println("Substraction of a and b in sub class is : " + c);
	}
	
	public void Demo()
	{
		super.Substraction(20, 10);
		this.Substraction(30, 15);
	}
	
	public static void main(String[] args) {
		MethodOverridingTest mo = new MethodOverridingTest();
		mo.Substraction(100, 20);
		mo.Demo();
		
	}

}
