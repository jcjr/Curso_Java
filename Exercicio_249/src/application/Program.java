package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter path file: ");
		String path = sc.nextLine();

		Map<String, Integer> votes = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					votes.put(name, count + votes.get(name));					
				} else {					
					votes.put(name, count);					
				}				
				line = br.readLine();
			}

			for (String key : votes.keySet()) {				
				System.out.println(key + ": " + votes.get(key));				
			}
			
		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		}
		sc.close();
		
	}

}
