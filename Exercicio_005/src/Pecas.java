import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor, valor2, total;
		
		sc.nextInt();
		valor = sc.nextDouble();
		sc.nextInt();
		valor2 = sc.nextDouble();
		total = valor + valor2;
		
		System.out.printf("Valor a pagar: %.2f", total);
		
		sc.close();
	}

}
