import java.util.Scanner;

public class IntervaloN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int in = 0, out = 0;
		
		for(int i = 0; i < num; i++) {
			int valor = sc.nextInt();
			if(valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
