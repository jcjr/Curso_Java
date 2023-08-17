import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int fator = 1;
		
		if(number == 0) {
			System.out.println("O fatorial é 1.");
		} else {
			for(int i = 1; i <= number; i++){
				fator *= i;
			}
			System.out.println("O fatorial de " + number + " é: " + fator);
		}
		
		sc.close();
	}
}
