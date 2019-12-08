package oops;

public interface FederalReserve {
	
	public abstract void MinDeposit();
	public abstract void MaxDeposit();
	public abstract void MinWithDrawl();
	public abstract void MaxWithDrawl();
	public abstract void AccountServices();
	public abstract void Retirement();
	public abstract void Loans();
	public abstract void PensionLoans();
	
	
	public default void MutualFunds()
	{
		System.out.println("Executing default method");
	}
		
	static void AML()
	{
		System.out.println("Executing static method");
	}
	
	public static void main(String[] args) {
	
		AML();
	}

}
