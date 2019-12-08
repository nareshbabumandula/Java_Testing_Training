package basics;

public class StringMethods {
	
	
	public void verifyStringMethods()
	{
		String sText1 = "hello world this is core java training..!";
		String sText2 = "HELLO";
		String sText3 = "                 welcome to core java session            ";
		String sText4 = "Registered users can sign-in here to find the lowest fare on participating airlines";
		
		
		// String class methods
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText3.trim());
		System.out.println(sText4.contains("airlines"));
		System.out.println(sText1.charAt(0));
		System.out.println(sText2.equalsIgnoreCase("hello"));
				
		if (sText2.equalsIgnoreCase("hello")) 
		{
			System.out.println("Both the string are same");
		} 
		else {
			System.out.println("Both the string are not same");
		}
		
		System.out.println(sText4.indexOf('e'));
		System.out.println(sText2.concat(" ").concat("ALL WELCOME TO THE ONLINE TRAINING"));
		System.out.println(sText2 + " " +  "WORLD");
	//	System.out.println(sText4.endsWith("airlines"));
		//System.out.println(sText1.startsWith("hello"));
		//System.out.println(sText4.substring(10,20));
		//System.out.println(sText4.substring(20));
//	System.out.println(sText1.isEmpty());
	//	System.out.println(sText4.length());
		//System.out.println(sText1.lastIndexOf('i'));
		//
		//String asText[] = sText4.split(" ");
//		System.out.println(asText[0]);
	//	System.out.println(asText[1]);
		//System.out.println(asText[2]);
		
	//	System.out.println(sText4.join(">", asText));
		
	}
	

	public static void main(String[] args) {
		
		StringMethods sm = new StringMethods();
		sm.verifyStringMethods();

	}

}
