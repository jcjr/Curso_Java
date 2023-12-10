import java.util.Scanner;

public class CodigoQuantidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, quant;
		double total = 0.0;
		
		codigo = sc.nextInt();
		quant = sc.nextInt();
		
		if(codigo == 1) {
			total = quant * 4.00;
		} else if(codigo == 2) {
			total = quant * 4.50;
		} else if(codigo == 3) {
			total = quant * 5.00;
		} else if(codigo == 4) {
			total = quant * 2.00;
		}	else if(codigo == 5) {
			total = quant * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}

}
