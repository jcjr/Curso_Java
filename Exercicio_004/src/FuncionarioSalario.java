import java.util.Scanner;

public class FuncionarioSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numFunc;
		double horas, valor, salario;

		System.out.println("Digite a matrícula do funcionário: ");
		numFunc = sc.nextInt();
		System.out.println("Digite horas trabalhas: ");
		horas = sc.nextDouble();
		System.out.println("Digite valor hora: ");
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.printf("Matrícula: %d\n", numFunc);
		System.out.printf("Salário = U$ %.2f\n ", salario);
		
		sc.close();
		
	}
}
