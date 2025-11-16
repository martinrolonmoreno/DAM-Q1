package ej07;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int base, exponente=0;
		
		System.out.println("Introduzca la base");
		base=teclado.nextInt();
		
		System.out.println("Introduzca el exponente");
		exponente=teclado.nextInt();
		
		System.out.println(base + " elevado a " + exponente + " es: " + potencia(base,exponente));
		System.out.println(base + " elevado a " + exponente + " es: " + potenciaRecursiva(base,exponente));
		base=teclado.nextInt();

		teclado.close();
	}
	
	public static int potencia(int base, int exponente) {
		int potencia=1;
		
		for(int i=0; i<exponente;i++) {
			potencia=potencia*base;
		}
		return potencia;
	}
	
	/*
	 * Calcular la potencia con método recursivo
	 * */
	
	public static int potenciaRecursiva(int base, int exponente) {
		if(exponente>=1) {
			return base*potenciaRecursiva(base,exponente-1);
		}
		else {
		return 1;
		}
		
	}
	

}
