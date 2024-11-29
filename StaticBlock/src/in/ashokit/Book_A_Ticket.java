package in.ashokit;

import java.util.Random;

public class Book_A_Ticket {
	private long bookingIb;
	private int noOfSeatsToBook;
	private static int seatsAvailable;
	private boolean isBooked;
	private String customerEmail;

	public Book_A_Ticket(int noOfSeatsToBook, String customerEmail) {
		this.noOfSeatsToBook = noOfSeatsToBook;
		this.customerEmail = customerEmail;
	}

	static {
		seatsAvailable = 30;
	}

	public void reserveSeats() {

		if (noOfSeatsToBook > seatsAvailable) {
			isBooked = false;

		} else {
			seatsAvailable = seatsAvailable - noOfSeatsToBook;
			isBooked = true;

			Random ran = new Random();
			bookingIb = ran.nextLong(100000);

		}
	}

	public void cancelTicket() {
		seatsAvailable = seatsAvailable + noOfSeatsToBook;
	}

	public long getBookingIb() {
		return bookingIb;
	}

	public void setBookingIb(long bookingIb) {
		this.bookingIb = bookingIb;
	}

	public int getNoOfSeatsToBook() {
		return noOfSeatsToBook;
	}

	public void setNoOfSeatsToBook(int noOfSeatsToBook) {
		this.noOfSeatsToBook = noOfSeatsToBook;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
