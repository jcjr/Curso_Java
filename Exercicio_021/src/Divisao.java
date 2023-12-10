import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();

			if (n2 == 0.0) {
				System.out.println("Divisão impossível!!!");
			} else {
				System.out.printf("%.1f\n", n1 / n2);
			}			
		}

		sc.close();
	}

}
