package org.d3ifcool.ima12;
import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int i, j, n;
		int[][] matrix = new int[10][10]; 
		Scanner in = new Scanner (System.in);
		n = in.nextInt();
		for (i = 0; i < n; i++){
			for (j = 0; j < n; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		
		//cerminkan "kolom" horizontalnya (baris atas pindah ke bawah)
		for (i = 0; i < n; i++){//ini baris
				int balikKolom = matrix[0][i];
				matrix[0][i] = matrix[n-1][i];
				matrix[n-1][i] = balikKolom;//pindah posisi
		}
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
