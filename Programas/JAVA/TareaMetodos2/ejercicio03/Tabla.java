package ejercicio03;

import java.util.Scanner;

/*Crea un método llamado tablaMultiplicar que dado un número entero muestre la tabla de multiplicar del número, del 1 al 10 y devuelva también la suma total 
 de los productos. 

Programar el main en el que se utiliza con varias invocaciones.*/

public class Tabla {

	public static void main(String[] args) {
		int num=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número");
		num=leer_num(sc);
		
		tablaMultiplicar(num);
		
		sc.close();
		System.out.println("\nPrograma finalizado");
		
	}
	
	public static int leer_num(Scanner sc) {
		int num_leido=0;
		num_leido=sc.nextInt();
		return num_leido;
	}
	
	public static int tablaMultiplicar(int num) {
		int suma_total=0;
		for(int i=1;i<=10;i++) {
			System.out.println(num + " multiplicado por " + i + " es igual a " + num*i);
			suma_total+=num*i;
			System.out.println("-----------------------------------");
		}
		
		System.out.println("\nLa suma total de los productos es igual a: " + suma_total);
		return suma_total;
	}

}
