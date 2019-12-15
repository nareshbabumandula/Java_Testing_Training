package basics;

public class HeapAndStackMemory {

	int x=100;
	int y=200;
	
	public void addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
		
		// Call subtraction method
		subtraction();
		
	}
	
	public void subtraction()
	{
		int a1=10;
		int b1=20;
		int c1=a1-b1;
		System.out.println("Subtraction of a1 and b1 is : " + c1);
		
		// call multiplication method
		multiplication();
	}
	
	public void multiplication()
	{
		int a2=10;
		int b2=20;
		int c2=a2*b2;
		System.out.println("Multiplication of a2 and b2 is : " + c2);
	}
	
	public static void main(String[] args) {
		
		HeapAndStackMemory mem = new HeapAndStackMemory();
		mem.addition();

	}

}
