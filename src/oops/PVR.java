package oops;

public class PVR extends Theater{

	public static void main(String[] args) {
		PVR pv = new PVR();
		pv.Parking();
		pv.FireAndSafety();
		pv.TicketBooking();
		pv.TicketCancellation();
		pv.Cafeteria();
		pv.SeatingTypes();
		pv.OnlineBooking();
		SoundSystem();
		pv.Washroom();
		pv.EmergencyExit();
		
	}
	

	public void Parking() 
	{
		System.out.println("Parking facility is available to park 200 cars and 500 bikes");
	}

	
	public void TicketBooking() {
		System.out.println("TicketBooking facility is available");
		
	}

	
	public void Cafeteria() {
		System.out.println("TicketBooking facility is available");
		
	}

	
	public void SeatingTypes() {
		System.out.println("SeatingTypes facility is available in general, first class and deluxe types");
		
	}

	
	public void FireAndSafety() {
		System.out.println("FireAndSafety facility is available");
		
	}

	
	public void TicketCancellation() {
		System.out.println("TicketCancellation facility is available");
		
	}

}
