package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int number = sc.nextInt();
		
		for (int i=1; i <= number; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsource (y/n)? ");
			char choose = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hours: ");
			Double valueHour = sc.nextDouble();
			if (choose == 'y' || choose == 'Y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				list.add(new OutsourceEmployee(name, hours, valueHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valueHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENT:");
		for (Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}
}
