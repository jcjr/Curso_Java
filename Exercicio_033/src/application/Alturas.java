package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Alturas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double sumHeight = 0.0;
		double minor = 0;
		String name = "";
		int age = 0;
		double height = 0.0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		num = sc.nextInt();
				
		Pessoas[] pes = new Pessoas[num];
		
		for(int i = 0; i < pes.length; i++) {
			System.out.println("Dados da " + (i+1) + "a. pessoa: ");
			System.out.println("Nome: ");
			name = sc.next();
			System.out.println("Idade: ");
			age = sc.nextInt();
			System.out.println("Altura: ");
			height = sc.nextDouble();
			
			pes[i] = new Pessoas(name, age, height);
			
			sumHeight += pes[i].getHeight();
			if(pes[i].getAge() < 16) {
				minor += 1;
			}
		}
		
		System.out.printf("Altura Média: %.2f\n",  (sumHeight / num));
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", ((minor/num)*100));
		
		for(int i = 0; i < num; i++) {
			if(pes[i].getAge() < 16) {
				System.out.println(pes[i].getName());	
			}
		}
		sc.close();
	}
}
