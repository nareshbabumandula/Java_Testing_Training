package control.statements;

public class IfTest {
	
	public void IfExample()
	{
		int a=10;
		int b=20;
				
		if (a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a==b)
		{
			System.out.println("a is equal to b");
		}
		else
		{
			System.out.println("a is less than b");
		}
	}
	

	public static void main(String[] args) {
		
		IfTest it = new IfTest();
		it.IfExample();
	}

}
