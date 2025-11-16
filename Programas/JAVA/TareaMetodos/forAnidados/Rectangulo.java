package forAnidados;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int altura, ancho=0;
		
		ejemploFors();
		System.out.println("Por favor introduce la altura");
		altura=teclado.nextInt();
		
		System.out.println("Por favor introduce el ancho");
		ancho=teclado.nextInt();
		
		for (int i=0;i<altura;i++) {
			for(int j=0;j<ancho;j++) {
				if(i==0 || i==altura-1 || j==0 || j==ancho-1)
					System.out.print("*");
				
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		teclado.close();
		System.out.println("Bye");
	}
	
	
	public static void ejemploFors() {
		final int NUM_FILAS=3;
		final int NUM_COLUMNAS=4;
		
		for (int i=0; i<NUM_FILAS; i++) {
			for(int j=0;j<NUM_COLUMNAS;j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
	}

}
