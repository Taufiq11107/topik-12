package org.d3ifcool.ima12;
import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[][] spiral = new int[n][n];
        
        int nilai = 1;
        int minKolom = 0;
        int maxKolom = n-1;
        int minBaris = 0;
        int maxBaris = n-1;
         
        while(nilai <= n*n) {
            
            for(int i=minBaris; i<=maxBaris; i++){

                spiral[i][minKolom] = nilai;

                nilai++;  
            } 
            for(int i=minKolom+1; i<=maxKolom; i++){ 

                spiral[maxBaris][i] = nilai; 

                nilai++;
            } 
            for(int i=maxBaris-1; i>=minBaris; i--){

                spiral[i][maxKolom] = nilai;

                nilai++; 
            } 
            
            for(int i=maxKolom-1;i>=minKolom+1; i--){

                spiral[minBaris][i] = nilai;

                nilai++;
            }

            minKolom++;
            minBaris++;
            maxKolom--;
            maxBaris--;
        }
        
        for(int i=0; i<spiral.length; i++) {
            for(int j=0; j<spiral.length; j++) {
                System.out.print(spiral[i][j]+ " ");
            }
            System.out.println();
        }
	}
}
