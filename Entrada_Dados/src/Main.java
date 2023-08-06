import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		/*String x;
		int y;
		double z;
		char c;
		
		System.out.println("Digite um nome: ");
		x = sc.next();
		System.out.println("Digite um inteiro: ");
		y = sc.nextInt();
		System.out.println("Digite um real: ");
		z = sc.nextDouble();
		System.out.println("Digite um caracter: ");
		c = sc.next().charAt(0);
		
		System.out.println("Você digitou " + x);
		System.out.println("Você digitou " + y);
		System.out.printf("Você digitou %.2f\n", z);
		System.out.println("Você digitou " + c);*/
		
		sc.close();
	}

}
