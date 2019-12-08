package oops;

public class EncapsulationDemo {
	
	
	private String USERNAME = "Shravan";
	private String PASSWORD = "Secure123";
	

	public String getUSERNAME() {
		return USERNAME;
	}


	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}


	public String getPASSWORD() {
		return PASSWORD;
	}


	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}


	public static void main(String[] args) {
		
		EncapsulationDemo ed = new EncapsulationDemo();
		System.out.println(ed.USERNAME);
		System.out.println(ed.PASSWORD);

	}

}
