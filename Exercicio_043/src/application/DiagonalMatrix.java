package application;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		int[][] mat = new int[num][num];
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Main diagonal:");
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println("\nNegative numbers = " + count);
		sc.close();
	}

}