package javaproject;

public class ProductApp {

	public static void main(String[] args) {
		Product p = new Product("phone", -359, "Statinary");
		System.out.println(p.getPrice());
		System.out.println(p.getCategory());
		System.out.println(p);
		
	}

}
