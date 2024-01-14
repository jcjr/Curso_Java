package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = null;
		List<Product> list = new ArrayList<>();

		File file = new File("c:\\temp\\in.txt");

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] word = sc.nextLine().split(",");
				list.add(new Product(word[0], Double.parseDouble(word[1]), Integer.parseInt(word[2])));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Copiado lista de produtos para memória.");
		}
		
		if (new File("c:\\temp\\out").mkdir() || new File("c:\\temp\\out").exists()) {
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out\\summary.csv"))) {
				for (Product ls : list) {
					bw.write(ls.toString());
					bw.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Criada lista de produtos com sucesso.");
			}
		}
		sc.close();
	}

}
