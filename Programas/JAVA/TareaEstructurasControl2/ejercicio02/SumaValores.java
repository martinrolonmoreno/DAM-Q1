package ejercicio02;

import java.util.Scanner;

/*Realizar un programa en Java que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y 
 * su promedio (utilizar primero el bucle while y luego el bucle for).*/

public class SumaValores {

	public static void main(String[] args) {
		double num_usuario=0;
		double next_num=0;
		int contador=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(contador<10) {
			System.out.println("Introduce un número: ");
			next_num=sc.nextDouble();
			num_usuario=num_usuario+next_num;
			contador+=1;
		}
		
		System.out.println("El resultado de la suma de los números es: " + (int)num_usuario + " y su promedio es: " + num_usuario/10);
		
		num_usuario=0;
		next_num=0;
		
		for (int i=0; i<10;i++) {
			System.out.println("Introduce un número: ");
			next_num=sc.nextDouble();
			num_usuario=num_usuario+next_num;
		}
		
		System.out.println("El resultado de la suma de los números es: " + (int)num_usuario + " y su promedio es: " + num_usuario/10);
		
		sc.close();
		
		

	}

}
