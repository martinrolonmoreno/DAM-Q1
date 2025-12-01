package ejercicio07;

import java.util.Scanner;

/*Crea un método potencia que dados dos números enteros, uno para la base y otro para el exponente, devuelva la potencia sin usar Math.pow().
Usar un bucle multiplicando sucesivamente.

Programar el main en el que se utiliza con varias invocaciones.*/

public class BuclePotencia {

	public static void main(String[] args) {
		int num_base=0;
		int num_exponente=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la base de la potencia a calcular: ");
		num_base=leer_num(sc);
		System.out.println("Introduce el exponente de la potencia a calcular: ");
		num_exponente=leer_num(sc);
		
		
		System.out.println("El resultado de " + num_base + " elevado a " + num_exponente + " es igual a: " + potencia(num_base, num_exponente));
		
		sc.close();
		System.out.println("Programa finalizado");

	}
	
	public static int leer_num(Scanner sc) {
		int num_leido=0;
		num_leido=sc.nextInt();
		return num_leido;
	}
	
	public static int potencia(int num1, int num2) {
		int resultado_potencia=1;
		for(int i=0;i<num2;i++) {
			resultado_potencia=resultado_potencia*num1;
		}
		return resultado_potencia;
	}
	

}
