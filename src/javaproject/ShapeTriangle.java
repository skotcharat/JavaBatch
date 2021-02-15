package javaproject;

public class ShapeTriangle extends Shape {

	

	private double base;

	
	
	public ShapeTriangle() {
		super();
	}
	
	public ShapeTriangle(double base, double height) {
		super(height);
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	
	public double area() {
		return (0.5 * base * getHeight()) ;
		
	}

	@Override
	public String toString() {
		return "ShapeTriangle [base=" + base + ", height=" + getHeight() + "]";
	}

	
}
