package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 0;		
		
		System.out.print("Quanto valores vai ter cada vetor? ");
		num = sc.nextInt();
		
		int[] vectA = new int[num];
		int[] vectB = new int[num];
		int[] vectC = new int[num];
		
		System.out.println("\n\nDigite os valores do vetor A:");
		
		for(int i = 0; i < num; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("\nDigite os valores do vetor B:");
		
		for(int i = 0; i < num; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("\nVetor resultante:");
		
		for(int i = 0; i < num; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}
