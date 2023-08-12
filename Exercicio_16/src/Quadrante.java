import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x, y;
		boolean entrada = true;
		
		x = sc.nextDouble();
		y = sc.nextDouble();

		while (x != 0.0 || y != 0.0) {		
			if (x > 0.0 && y > 0.0) {
				System.out.println("Primeiro");
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("Segundo");
			} else if (x < 0.0 && y < 0.0) {
				System.out.println("Terceiro");
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("Quarto");
			} 
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		sc.close();
	}
}
