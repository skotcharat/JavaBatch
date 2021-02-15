package javaproject;

public class ShapeCircle extends Shape {

	private double radious;
	
	
	
	public ShapeCircle() {
		super();
	}
	
	public ShapeCircle(double radious) {
		this.radious = radious;
	}
	

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}
	
	public double area() {
		return 3.14 * (radious * radious);
		
	}

}
