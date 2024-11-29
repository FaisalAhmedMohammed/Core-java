package in.ashokit;

public class Static_Block {
	private int id;
	private String name;
	private static  String company;
	
	
	public Static_Block(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	static {
		company="Ashok It";
		System.out.println("company is :"+company);
		
	}

	@Override
	public String toString() {
		return "Static_Block [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Static_Block sb=new Static_Block(101,"faisal");
		System.out.println(sb);
		Static_Block sbb=new Static_Block(102,"ahmed");
		System.out.println(sbb);

	}

}
