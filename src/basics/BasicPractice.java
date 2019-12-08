package basics;

public class BasicPractice {

	// Variables
	int a= 10;
	float b=20;
	int c=30;
	int d=40;

	public void division() {
		double a = 60/c;
		System.out.println("division of a would be: .........."+ a);
	}

	public void addition() {
		int c = a+d;
		System.out.println("addind values of and b would be:"+ c);
	}
	
	public void multiplication() {
		float b = c*a;
		System.out.println("multiplicatin of c*a :"+ b);
	}
	

	public static void main(String[] args) {
		BasicPractice bp = new BasicPractice();
		
		// this will print class variables values
		
		System.out.println(bp.a);
		System.out.println(bp.c);
		System.out.println(bp.b);

		

// to get value of method needs to write below code
		bp.addition();
		bp.division();
		bp.multiplication();
	}

}