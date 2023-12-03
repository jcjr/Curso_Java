import java.util.Scanner;

public class ComparaValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.println("Digite o valor da variavel A: ");
		a = sc.nextInt();
		System.out.println("Digite o valor da variavel B: ");
		b = sc.nextInt();
		System.out.println("Digite o valor da variavel C: ");
		c = sc.nextInt();
		System.out.println("Digite o valor da variavel D: ");
		d = sc.nextInt();
		dif = (a*b-c*d);
		
		System.out.println("O Resultado é: " + dif);
		
		sc.close();
	}

}
