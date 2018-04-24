public class Product {

	int id;
	String name;
	double price;
	
	Product() {
	}	
	
	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return id + "==>" + name + "==>" + price;
	}
	
}