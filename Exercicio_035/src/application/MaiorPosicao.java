package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = 0, pos = 0;
		double max = 0.0;
		
		System.out.print("Quantos números você vai digitar? ");
		num = sc.nextInt(); 
		double[] vect = new double[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("\nDigite o " + (i+1) + " número: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
			if(vect[i] > max) {
				max = vect[i];
				pos = i;
			}
		}
		
		System.out.printf("\nMaior valor = %.2f",  max);
		System.out.println("\nPosição do maior valor = " + pos);
		sc.close();
	}
}
