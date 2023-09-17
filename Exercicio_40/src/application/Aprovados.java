package application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int num = 0;
		
		System.out.println("Quantos alunos serao digitados? ");
		num = sc.nextInt();
		
		String[] name = new String[num];
		double[] point1 = new double[num]; 
		double[] point2 = new double[num]; 
		
		for(int i = 0; i < num; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " +(i+1)+ "o aluno:");
			name[i] = sc.next();
			point1[i] = sc.nextDouble();
			point2[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < num; i++) {
			if(((point1[i] + point2[i])/2) >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}
}
