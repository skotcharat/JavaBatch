package javaproject;

public class Product {
	private String name;
	private double price;
	private String category;
	
	public Product( ) {
		
	}
	public Product(String name, double price, String category) {
		this(); // to call same class 
		this.name = name;
		setPrice(price);
		setCategory(category);
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

	public void setPrice(double price) {
		if(price < 0) {
			this.price = 100;
		} else {
			this.price = price;
		}
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String cat) {
		if((cat.equals("Electronics")) || (cat.equals("Electric")) || (cat.equals("Stationary"))) {
			this.category = cat;
		} else {
			this.category = "FAIL ***Category should be - Electronics, Electric, Stationary";
		}
		
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	

}
