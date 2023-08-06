import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r;
		
		System.out.println("Digite o raio do circulo: ");
		r = sc.nextDouble();
		
		System.out.println("A área do circulo é: " + (Math.PI*Math.pow(r, 2)));
		
		sc.close();

	}

}