package ejercicio01;

import java.util.Scanner;

/*Realizar un programa en Java que solicite la carga de un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno.

Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.*/

public class NumeroIncremental {

	public static void main(String[] args) {
		double num_usuario=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor introduzca un número positivo");
		
		num_usuario=sc.nextDouble();
		
		while(num_usuario<0) {
			System.out.println("Por favor, vuelva a introducir un número válido. Debe ser mayor que cero: ");
			num_usuario=sc.nextDouble();
		}
		
		if(num_usuario<1) {
			System.out.println(num_usuario);
		}
		else {
			for(int i=1;i<=num_usuario;i++) {
				System.out.println(i);
			}
		}
		
		sc.close();
		System.out.println("Programa finalizado");
		

	}

}
