package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		double avg = 0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		num = sc.nextInt();
		
		System.out.println("");
		
		double[] vect = new double[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("Digite o " + (i+1) + "o. valor: ");
			vect[i] = sc.nextDouble();
			avg += vect[i];
		}
		
		System.out.printf("\nMédia do vetor: %.3f", (avg/num));
		System.out.println("\nElementos abaixo da média:");
		
		for(int i = 0; i < num; i++) {
			if(vect[i]<(avg/num)) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		sc.close();
	}

}
