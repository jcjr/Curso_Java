import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		double media;
		
		for (int i = 0; i < num; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 5.0)) / 10.0;
			System.out.printf("%.1f", media);
		}

		sc.close();

	}

}
