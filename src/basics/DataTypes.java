package basics;


public class DataTypes{

	// Characteristics or attributes or data members
	// Primitive data types
	int a=10;
	float b = 12.4f;
	boolean c = true;
	boolean d = false;
	double e = 234.345434;
	char f = 'g';
	byte h = 127;
	long i = 3432425;
	short s = 2345;
	
	// Non primitive data types
	String sText = "hello world this is core java";
	String[] EmpNames = {"Shravan","Dinesh","John","Peter","Manning","Sjoerd","Eric"};
	

	// Behavior
	public void Addition()
	{
		int c1 = a+20;
		System.out.println("Addition ouput is : " + c1);
	}
	
	public void Subtraction()
	{
		int c1 = a-20;
		System.out.println("Subtraction ouput is : " + c1);
	}
	
	public void Mutiplication()
	{
		double c = a*b;
		System.out.println("Multiplication value of a and b is : " + c);
	}
	
	public void Division()
	{
		double c = 20/a;
		System.out.println("Division value of a and b is : " + c);
	}
	
	
	public void Modulus()
	{
		double c = 20%a;
		System.out.println("Modulus value of a and b is : " + c);
	}
	
	// Entry point of Java
	// Method name - main
	// Main method will be called by the JVM (Java Virtual Machine)
	// Main method is static hence JVM need not to create an object to call this main method
	public static void main(String[] args) {
		
		System.out.println("Hello world..! welcome to the DataTypes training...!");
	
		// Classname objName = new Constructor name (Always Constructor name will be same as a class name)
		DataTypes dt = new DataTypes();
		
		
		System.out.println(dt.a);
		System.out.println(dt.b);
		System.out.println(dt.c);
		System.out.println(dt.d);
		System.out.println(dt.e);
		System.out.println(dt.f);
		System.out.println(dt.h);
		System.out.println(dt.i);
		System.out.println(dt.s);
		
		dt.Addition();
		dt.Subtraction();
		dt.Mutiplication();
		dt.Division();
		dt.Modulus();
		
		String[] EmpNames = {"Shravan","Dinesh","John","Peter","Manning","Sjoerd","Eric"};
		System.out.println(EmpNames[0]);
		System.out.println(EmpNames.length);
		
		for (String name : EmpNames) {
			System.out.println("Employee name is : " + name);
		}
		
		for (int i = 0; i < EmpNames.length; i++) {
			System.out.println(EmpNames[i]);
		}
		
		
	
	}

}
