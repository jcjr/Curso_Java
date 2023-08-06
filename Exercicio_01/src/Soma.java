import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um número inteiro: ");
		a = sc.nextInt();
		System.out.println("Digite outro número inteiro: ");
		b = sc.nextInt();
		System.out.println(" A soma dos números são: " + (a + b));
		
		sc.close();
	}

}
