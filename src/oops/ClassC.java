package oops;

public class ClassC extends ClassB{

	int a2 = 40;
	int b2 = 20;
	
	public void Division()
	{
		int c2 = a2/b2;
		System.out.println("Division of a and b is : " + c2);
	}
	
	
	public static void main(String[] args) {
		ClassC cc = new ClassC();
		cc.Addition();
		cc.Substraction();
		cc.Multiplication();
		cc.Division();
		
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.a1);
		System.out.println(cc.b1);
		System.out.println(cc.a2);
		System.out.println(cc.b2);
		

	}

}
