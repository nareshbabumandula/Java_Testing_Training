package oops;

public class MethodOverloadTest {


	public void Substraction(int a, int b)
	{
		int c = b-a;
		System.out.println("Substraction of a and b in super class is : " + c);
	}
	
	public void Addition(double a, double b)
	{
		double c=a+b;
		System.out.println("Addition of double a and b is : " + c);
	}

	public void Addition()
	{
		int a=10; // Local variables
		int b=20;
		int c=a+b;
		System.out.println("Addition of a and b with local variables is : " + c);
	}

	public void Addition(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	public void Addition(int a, double b)
	{
		double c=a+b;
		System.out.println("Addition of a integer and b double is : " + c);
	}

	public void Addition(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("Addition of a, b and c is : " + d);
	}

	public MethodOverloadTest(String USERNAME) {
		System.out.println("Parameterized Constructor with parameter : " + USERNAME);
	}

	public MethodOverloadTest() {
		System.out.println("This is a no argument constructor");
	}

	public static void main(String[] args) {

		MethodOverloadTest mo = new MethodOverloadTest("Shravan");
		mo.Addition(10, 20);
	}

}
