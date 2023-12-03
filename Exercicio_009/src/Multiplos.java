import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Os números são multiplos.");
		} else {
			System.out.println("Os números não são multiplos");
		}

		sc.close();
	}

}
