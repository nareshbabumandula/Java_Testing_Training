package oops;

public abstract class Theater {
	
	
	// abstract methods
	public abstract void Parking();
	public abstract void TicketBooking();
	public abstract void Cafeteria();
	public abstract void SeatingTypes();
	public abstract void FireAndSafety();
	public abstract void TicketCancellation();
	
	static void SoundSystem()
	{
		System.out.println("Dolby digital sound system facility is available");
	}
	
	
	void Washroom()
	{
		System.out.println("Washroom facility is available");
	}
	
	
	public void OnlineBooking()
	{
		System.out.println("Online ticket booking is available");
	}
	
	public Theater() {
		System.out.println("This is a no argument constructor of an abstract class");
	}

	
	public final void EmergencyExit()
	{
		System.out.println("8 Emergency Exits are available");
	}
	

}
