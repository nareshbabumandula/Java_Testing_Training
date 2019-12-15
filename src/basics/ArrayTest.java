package basics;

public class ArrayTest {
	
	
	public void ArrayDemo()
	{
		
		int a1[] = new int[6];
		int a[] = {10,30,40,70,20,15,75,35};
	
		String names[] = {"naresh", "shravan", "teja", "ravi", "raj"};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int value : a) {
			System.out.println("Value is : " + value);
		}
			
	}
	

	public static void main(String[] args) {
		
		ArrayTest at = new ArrayTest();
		at.ArrayDemo();
	}

}
