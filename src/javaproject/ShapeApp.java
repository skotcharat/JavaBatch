package javaproject;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape tri = new ShapeTriangle(4.0, 2.0);
		System.out.println(tri.area());
		
		tri = new ShapeSquare(4.0, 2.0, 2.0);
		System.out.println(tri.area());
		
		tri = new ShapeCircle(4.0);
		System.out.println(tri.area());
	}

}
