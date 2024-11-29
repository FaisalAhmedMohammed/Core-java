package in.ashokit.co;

public class Person {
	private int id;
	private String fname;
	private String lname;
	private long pno;
	private String gender;
	private String city;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFname() {
		return this.fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setPno(long pno) {
		this.pno = pno;
	}

	public long getPno() {
		return this.pno;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return this.gender;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

}
