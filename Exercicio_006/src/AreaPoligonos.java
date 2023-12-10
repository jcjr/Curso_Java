import java.util.Locale;
import java.util.Scanner;

public class AreaPoligonos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double ladoA, ladoB, ladoC;
		
		ladoA = sc.nextDouble();
		ladoB = sc.nextDouble();
		ladoC = sc.nextDouble();
		
		Locale.setDefault(Locale.US);

		System.out.printf("Triangulo: %.3f\n", ((ladoA*ladoC)/2));
		System.out.printf("Circulo: %.3f\n", (Math.PI*(Math.pow(ladoC, 2))));
		System.out.printf("Trapezio: %.3f\n", (((ladoA+ladoB)/2)*ladoC));
		System.out.printf("Quadrado: %.3f\n", (ladoB*ladoB));
		System.out.printf("Retangulo: %.3f\n", (ladoA*ladoB));
		
		sc.close();
	}
}
