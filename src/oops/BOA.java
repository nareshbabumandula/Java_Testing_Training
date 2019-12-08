package oops;



public class BOA implements FederalReserve, RBI
{

	public static void main(String[] args) {
		BOA b = new BOA();
		b.MinDeposit();
		b.MaxDeposit();
		b.MinWithDrawl();
		b.MaxWithDrawl();
		b.AccountServices();
		b.Loans();
		b.Retirement();
		b.MutualFunds();
		b.PensionLoans();
		b.MoneyTranser();
		
	}

	@Override
	public void MinDeposit() {
		System.out.println("Minimum deposit amount is $ 100");
		
	}

	@Override
	public void MaxDeposit() {
		System.out.println("Minimum deposit amount is $ 10k per day");
		
	}

	@Override
	public void MinWithDrawl() {
		System.out.println("Minimum deposit amount is $ 100");
		
	}

	@Override
	public void MaxWithDrawl() {
		System.out.println("Minimum deposit amount is $ 1k");
		
	}

	@Override
	public void AccountServices() {
		System.out.println("AccountServices facility is available to open, close, activate and deactivate an account");
		
	}

	@Override
	public void Retirement() {
		System.out.println("401K Plan is available");
		
	}

	@Override
	public void Loans() {
		System.out.println("Loans facility is available");
		
		
	}

	@Override
	public void PensionLoans() {
		System.out.println("PensionLoans facility is available");
		
	}

	@Override
	public void MoneyTranser() {
		System.out.println("Money transfer facility is available");
		
	}

}
