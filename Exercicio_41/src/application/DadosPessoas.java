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
		
		System.out.print("Quantas pessoas serao digitadas? ");
		num = sc.nextInt();
		
		double[] height = new double[num];
		char[] gender = new char[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Altura da " +(i+1)+ "a pessoa: ");
			height[i] = sc.nextDouble();
			System.out.println("Genero da " +(i+1)+ "a pessoa: ");
			gender[i] = sc.next().charAt(0);
			
			if(height[i] > maxHeight) {
				maxHeight = height[i];
			} else if(height[i] < minHeight) {
				minHeight = height[i];
			}
			
			if(gender[i] == 'M') {
				countMan += 1;
			} else {
				avg += height[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f\n", minHeight);
		System.out.printf("Maior altura = %.2f\n", maxHeight);
		System.out.printf("Media das alturas das mulheres = %.2f\n", (avg/num));
		System.out.println("Número de homens = " + countMan);
		
		sc.close();
	}

}
