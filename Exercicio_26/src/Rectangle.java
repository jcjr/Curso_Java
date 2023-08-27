import java.util.Locale;
import java.util.Scanner;
import entities.RectangleObj;

public class Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		RectangleObj rec = new RectangleObj();
		
		System.out.println("Enter rectangle width and height: ");
		rec.side1 = sc.nextDouble();
		rec.side2 = sc.nextDouble();
		
		System.out.println("Area = " + rec.area());
		System.out.println("Perimeter = " + rec.perimeter());
		System.out.println("Diagonal = " + rec.diagonal());	
		
		sc.close();
	}

}
