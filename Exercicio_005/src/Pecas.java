import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod, cod2, num, num2;
		double valor, valor2, total;
		
		cod = sc.nextInt();
		num = sc.nextInt();
		valor = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		total = valor + valor2;
		
		System.out.printf("Valor a pagar: %.2f", total);
		
		sc.close();
	}

}
