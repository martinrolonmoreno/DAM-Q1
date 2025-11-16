package ejercicio17;

import java.util.Scanner;

/*Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga). 
 * Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.*/

public class Suma9999 {

	public static void main(String[] args) {
		int num_usuario=0;
		int num_acumulado=0;
		Scanner sc= new Scanner(System.in);
		
		do{
			System.out.println("Introduce un valor: ");
			num_usuario=sc.nextInt();
			if(num_usuario!=9999) {
				num_acumulado+=num_usuario;
			}
		}while(num_usuario!=9999);
		
		if(num_acumulado>0) {
			System.out.println("El número acumulado: " + num_acumulado + " es mayor a 0");
		}
		
		else if(num_acumulado<0) {
			System.out.println("El número acumulado: " + num_acumulado + " es menor a 0");
		}
		
		else if(num_acumulado==0) {
			System.out.println("El número acumulado: " + num_acumulado + " es 0");
		}
		
		else {
			System.out.println("Ha ocurrido un error inesperado");
		}
		
		sc.close();
		System.out.println("Programa finalizado");
		
		

	}

}
