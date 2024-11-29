package in.ashokit.co;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(101);
		p.setFname("faisal ");
		p.setLname("ahmed");
		p.setGender("male");
		p.setCity("nizamabad");
		p.setPno(1212323);

		int id = p.getId();// we can store method return value to a variable.
		String fname = p.getFname();
		String lname = p.getLname();
		String gender = p.getGender();
		String city = p.getCity();
		long pno = p.getPno();
		System.out.println(id + " " + fname + " " + lname + " " + gender + " " + city + " " + pno);
	}

}
