package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int pair = 0;
		
		System.out.println("Quantos n�meros voc� vai digitar? ");
		num = sc.nextInt();
		
		int[] vect = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Digite o " + (i+1) + "o n�mero: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				pair += 1;
			}
		}
		
		if(pair > 0) {
			System.out.println("\nN�MEROS PARES:");
		}
		
		for(int i = 0; i < num; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}
		
		if(pair > 0) {
			System.out.println("\n\nQuantidade de pares = " + pair);
		}
	}
}
