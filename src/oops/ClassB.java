package oops;

public class ClassB extends ClassA{
	
	int a1 =100;
	int b1 = 2;
	
	public void Multiplication()
	{
		int c =a1*b1;
		System.out.println("Multiplication of a and b is : " + c);
	}
	
	public ClassB() {
		System.out.println("I'm a constructor of ClassB");
	}
	
	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.Multiplication();
		cb.Addition();
		cb.Substraction();
		System.out.println(cb.a1);
		System.out.println(cb.b1);
		System.out.println(cb.a);
		System.out.println(cb.b);
		
	}

}
