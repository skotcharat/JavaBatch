package javaproject;

public class ShapeSquare extends Shape {

	private double side;
	
	
	public ShapeSquare() {
		super();
	}
	
	public ShapeSquare(double side, double height, double width) {
		super(width, height);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double area() {
		return getWidth() * getHeight() * side;
		
	}

	@Override
	public String toString() {
		return "ShapeSquare [side=" + side + ", height=" + getHeight() + "]";
	}
}
