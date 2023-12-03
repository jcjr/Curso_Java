import java.util.Scanner;

public class NumeroNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número não é negativo.");
		}
		sc.close();

	}

}
