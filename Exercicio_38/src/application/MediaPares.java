package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int count = 0;
		double sum = 0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		num = sc.nextInt();
		
		double[] vect = new double[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("Digite o " + (i+1) + "o. número: ");
			vect[i] = sc.nextDouble();
			
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				count += 1;  
			}
		}
		
		if(count > 0) {
			System.out.printf("\nMédia dos pares: %.2f", (sum / count));
		} else {
			System.out.println("\nNenhum número par.");
		}		
		
		sc.close();
	}
}
