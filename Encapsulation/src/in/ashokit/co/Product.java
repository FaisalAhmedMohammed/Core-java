package in.ashokit.co;

public class Product {
	private int id;
	private String name;
	private double price;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if (price > 0) {
			this.price = price;
		}
		else {
			throw  new Exception("Price must be greater than o"); 
		}
		
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) throws Exception {
		Product p = new Product();
		p.setId(101);
		p.setName("Tv");
		p.setPrice(2999.0);
		System.out.println(p);
	}

}
