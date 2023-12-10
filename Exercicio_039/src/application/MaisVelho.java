package application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int pos = 0;
		int newAge = 0;
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		num = sc.nextInt();
		
		String[] name = new String[num];
		int[] age = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Dados da " + (i+1) +"a pessoa: ");
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			
			if(age[i] > newAge) {
				newAge = age[i];
				pos = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + name[pos]);
		
		sc.close();
	}
}
