public class To_print_Data_from_object {

	public static void main(String[] args) {
		To_print_Data_from_object t = new To_print_Data_from_object();
		customer c = new customer();
		c.cid = 243;
		c.ctype = "reguler";
		c.email = "faisal@123";
		t.customerDetails(c);

	}

	void customerDetails(customer c) {
		System.out.print(c.cid + " " + c.ctype + " " + c.email);

	}
}

class customer {
	int cid;
	String ctype;
	String email;
}
