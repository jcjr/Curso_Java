package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Students;

public class School {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Students st = new Students();
		
		st.name = sc.nextLine();
		st.note1 = sc.nextDouble();
		st.note2 = sc.nextDouble();
		st.note3 = sc.nextDouble();
		
		System.out.printf("Final grade = %.2f\n", st.finalGrade());
		
		System.out.println(st.missingPoints());
		
		sc.close();
	}

}
