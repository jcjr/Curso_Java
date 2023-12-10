import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha = sc.nextInt();
		int etanol = 0, gasolina = 0, diesel = 0;
		
		while(escolha != 4) {
			switch(escolha) {
				case 1:
					etanol += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
					diesel += 1;
					break;
				default:
					System.out.println("Código inválido!");
					break;
			}
			escolha = sc.nextInt();
		}
		System.out.println("Muito obrigado!");
		System.out.println("Etanol: " + etanol);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
