package ejercicio05;

import java.util.Scanner;

/*Realizar el programa Java que calcule mediante un método la potencia de un número entero.

Realizar el método de calcular la potencia utilizando una estrategia recursiva.*/

public class PotenciaNumero {

	public static void main(String[] args) {
		int num_u=0;
		int n=0;
		int potencia=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		num_u=sc.nextInt();
		System.out.println("Introduce la potencia a la que desee elevar el número: ");
		n=sc.nextInt();
		
		potencia=calculaPotencia(num_u,n);
		
		System.out.println("La potencia es igual a: " + potencia);
		
		sc.close();
		System.out.println("Programa finalizado");
	}
	
	public static int calculaPotencia(int num_u, int n) {
		
		if(n==0) {
			return 1;
		}
		else {
			return num_u*calculaPotencia(num_u,n-1);
		}
		
	}
	

		

}
