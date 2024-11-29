package in.ashokit;

public class Test {
	public static void main(String[] args) {

		Book_A_Ticket beATicket = new Book_A_Ticket(12, "faisal@1234");

		beATicket.reserveSeats();
		if (beATicket.isBooked()) {

			System.out.println("Tickets has Booked");
			System.out.println("Your BookingId is :" + beATicket.getBookingIb());
			System.out.println("conformation Email is sent to :" + beATicket.getCustomerEmail());
		} else {
			System.out.println("sorry seats are not available");
		}
	}

}
