package basics;


public class StringPractice {
	



	public void vrifiyingmethods() {

		
		String sText1 = "hello world";
		String  sText2 = "I opened chrome broeswer";
		String  sText3 = "        I searched for the fACEbook page";
		String  sText4 = "I'm on the facebook page";
		String  sText5 = "I enterd the username and password";
		
		
		System.out.println(sText1.length());
		System.out.println(sText3.toUpperCase());
		System.out.println(sText3.trim());
		System.out.println(sText5.contains("s"));
		System.out.println(sText4.toLowerCase());
		System.out.println(sText1.contains("done"));
		System.out.println(sText2.indexOf(3));
        System.out.println(sText4.charAt(2));
        System.out.println(sText4.split("facebook"));
		 }
	
	
	public static void main(String[] args) {
		
	StringPractice sp = new StringPractice();
	
	sp.vrifiyingmethods();
	

	}

	
	
	
	
	
	
	
	
	
	
	

}
