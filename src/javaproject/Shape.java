package javaproject;

public class Shape {
	private double width;
	private double height;
	
	public Shape() {
		
	}
	
	public Shape(double height) {
		super();	
		this.height = height;
	}
	
	public Shape(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;	
	}

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}


	

}
