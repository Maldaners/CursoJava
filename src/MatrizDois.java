

import java.util.Scanner;

public class MatrizDois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero de linhas da matriz");
		int m = sc.nextInt();
		System.out.println("digite o numero de colunas da matriz");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("digite os numeros da matriz");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("digite o numero desejado da matriz");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
