import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num=0;	
		
		System.out.println("Quantos vetores você vai digitar? ");
		num = sc.nextInt();
		double[] vect = new double[num];
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite o " + (i+1) + "o. número: ");
			vect[i] = sc.nextInt();
			sum += vect[i];
		}
		
		System.out.println("");
		System.out.print("VALORES = ");
		for(int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("SOMA = " + sum);
		System.out.println("MÉDIA = " + (sum/num));
		
		sc.close();
	}

}
