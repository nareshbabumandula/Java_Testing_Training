package basics;

public class Arithmatic {

	
	public void Addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public int Subtraction()
	{
		int a=10;
		int b=40;
		int c=a-b;
		return c;
	}
	
	public static void main(String[] args) {
		Arithmatic ar = new Arithmatic();
		ar.Addition();
		int output = ar.Subtraction();
		System.out.println(output);

	}

}
