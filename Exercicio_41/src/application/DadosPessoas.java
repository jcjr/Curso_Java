package application;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		double avg = 0.0;
		double minHeight = 0.0;
		double maxHeight = 0.0;
		int countMan = 0;
		int countWoman = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		num = sc.nextInt();
		
		double[] height = new double[num];
		char[] gender = new char[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Dados da " +(i+1)+ "a. pessoa:");
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			System.out.print("Gênero: ");
			gender[i] = sc.next().charAt(0);
			sc.nextLine();
		}
		
		minHeight = height[0];
		
		for(int i = 0; i < num; i++) {
			if(height[i] > maxHeight) {
				maxHeight = height[i];
			} else if(height[i] < minHeight) {
				minHeight = height[i];
			}
			
			if(gender[i] == 'M') {
				countMan += 1;
			} else {
				avg += height[i];
				countWoman += 1;
			}
		}
		
		System.out.printf("\nMenor altura = %.2f\n", minHeight);
		System.out.printf("Maior altura = %.2f\n", maxHeight);
		System.out.printf("Média das alturas (Mulheres) = %.2f\n", (avg/countWoman));
		System.out.println("Número de homens = " + countMan);
		
		sc.close();
	}
}
