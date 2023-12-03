package application;

import java.util.Locale;
import java.util.Scanner;

public class NumeroNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			if(i<=10) {
				System.out.println("Digite o " + (i+1) + "o. número: ");
				vect[i] = sc.nextInt();
			}
		}
		
		System.out.println("");
		System.out.println("Números negativos:");
		System.out.println("");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
