package org.d3ifcool.ima12;
import java.util.*;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
				int siO = 0;
				int siX = 0;
				boolean kondisi = true;
				
				//Masukkan N baris & kolom
				int barisKolom = in.nextInt();
				int [][]nilai1 = new int[barisKolom][barisKolom];
				int []nilai2 = new int[barisKolom];
				for(int i = 0; i < barisKolom; i++){
					for(int j = 0; j < barisKolom; j++){
						nilai1[i][j] = in.nextInt();
					}
				}
				for(int i = 0; i < barisKolom; i++){
					for(int j = 0; j < barisKolom; j++){
						nilai2[j] = nilai1[i][j];
						if(nilai2[j] == 1){
							siO++;
							siX = 0;
							if(siO == 3){
								System.out.println("O");
								kondisi = false;
								break;
							}
						}
						else if(nilai2[j] == 2){
							siX++;
							siO = 0;
							if(siX == 3){
								System.out.println("X");
								kondisi = false;
								break;
							}
						}
						else{
							siO = 0;
							siX = 0;
							break;
						}
						if(j == barisKolom - 1){
							siO = 0;
							siX = 0;
						}
					}
					if(kondisi == false){
						break;
					}
				}
				if(kondisi == true){
					for(int x = 0; x < barisKolom; x++){
						for(int y = 0; y < barisKolom; y++){
							nilai2[y] = nilai1[y][x];
							if(nilai2[y] == 1){
								siO++;
								siX = 0;
								if(siO == 3){
									System.out.println("O");
									kondisi = false;
									break;
								}
							}
							else if(nilai2[y] == 2){
								siX++;
								siO = 0;
								if(siX == 3){
									System.out.println("X");
									kondisi = false;
									break;
								}
							}
							else{
								siO = 0;
								siX = 0;
								break;
							}
							if(y == barisKolom - 1){
								siO = 0;
								siX = 0;
							}
						}
						if(kondisi == false){
							break;
						}
					}
				}
				if(kondisi == true){
					for(int w = 0; w < barisKolom; w++){
						nilai2[w] = nilai1[w][w];
						if(nilai2[w] == 1){
							siO++;
							siX = 0;
							if(siO == 3){
								System.out.println("O");
								kondisi = false;
								break;
							}
						}
						else if(nilai2[w] == 2){
							siX++;
							siO = 0;
							if(siX == 3){
								System.out.println("X");
								kondisi = false;
								break;
							}
						}
						else{
							break;
						}
					}
				}
				if(kondisi == true){
					int tambah = 0;
					for(int z = barisKolom-1; z >= 0; z--){
						nilai2[z] = nilai1[tambah][z];
						tambah++;
						if(nilai2[z]==1){
							siO++;
							siX=0;
							if(siO==3){
								System.out.println("O");
								kondisi = false;
								break;
							}
						}
						else if(nilai2[z]==2){
							siX++;
							siO=0;
							if(siX==3){
								System.out.println("X");
								kondisi = false;
								break;
							}
						}
						else{
							break;
						}
					}
				}
				if(kondisi == true){
					for(int u = 0; u < barisKolom; u++){
						for(int t = 0; t < barisKolom; t++){
							int check = nilai1[u][t];
							if(check == 0){
								System.out.println("?");
								kondisi = false;
								break;
							}
							else{
								siO=0;
								siX=0;
								break;
							}
						}
						if(kondisi == false){
							break;
						}
					}
				}
				if(kondisi == true){
					System.out.println("-");
				}
			}
		}	