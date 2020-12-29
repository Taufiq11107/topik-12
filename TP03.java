package org.d3ifcool.ima12;
import java.util.Scanner;

public class TP03 {
  public static void main(String[] args) {
    int i, j, k, m, n, p, q, jumlah = 0;
    int matriks1[][] = new int[10][10];
    int matriks2[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
	//Masukkan jumlah baris dan kolom
    n = scan.nextInt();
	m = n;
	p = n;
	q = n;
    //("Masukkan elemen matriks pertama: ");
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
          matriks1[i][j] = scan.nextInt();
        }
      }

      //Masukkan elemen matriks kedua: ");
      for (i = 0; i < p; i++) {
        for (j = 0; j < q; j++) {
          matriks2[i][j] = scan.nextInt();
        }
      }

      for (i = 0; i < m; i++) {
        for (j = 0; j < q; j++) {
          for (k = 0; k < p; k++) {
            jumlah = jumlah + matriks1[i][k] * matriks2[k][j];
          }
          hasil[i][j] = jumlah;
          jumlah = 0;
        }
      }

      //("Hasil perkalian matriks: ");
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
          System.out.print(hasil[i][j] + " ");
        }
        System.out.println();
      }
    }
 }