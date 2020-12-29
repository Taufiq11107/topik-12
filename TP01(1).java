package org.d3ifcool.ima12;
import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		prosesMatrix();
	}
	static void prosesMatrix() {
		int i, j, baris, kolom, nbaris, nkolom, element;
		Scanner in = new Scanner(System.in);
		nbaris = in.nextInt();
		nkolom = nbaris;
		int[][] matrix = new int[nbaris][nkolom];
		for (i = 0; i < nbaris; i++) {
			for (j = 0; j < nkolom; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int[][] mirrorMatrix = new int[nbaris][nkolom];
		for (baris = 0; baris < nbaris; baris++) {
			int kolomnya = 0;
			for (kolom = nkolom - 1; kolom >= 0; kolom--) {
				element = matrix[baris][kolom];
				mirrorMatrix[baris][kolomnya] = element;
				kolomnya++;
			}
		}
		printMatrix(mirrorMatrix);
	}
	static void printMatrix(int[][] matrix) {
		for (int[] baris : matrix) {
			for (int element : baris) {
				String hasil = Integer.toString(element);
				System.out.print(hasil+" ");
			}
			System.out.println();
		}
	}
}
