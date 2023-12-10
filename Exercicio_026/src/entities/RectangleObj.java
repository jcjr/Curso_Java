package entities;

public class RectangleObj {
	public double side1, side2;
	
	public double area() {
		return side1 * side2;
	}
	
	public double perimeter() {
		return 2 * (side1 + side2);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}

}
