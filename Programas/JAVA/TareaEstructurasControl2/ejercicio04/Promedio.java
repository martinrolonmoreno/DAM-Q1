package ejercicio04;

import java.util.Scanner;

/*Realizar un programa en Java que solicite la carga de números por teclado, y obtenga su promedio. Finalizar la carga de valores cuando se cargue el valor 0.*/

public class Promedio {

	public static void main(String[] args) {
		float num_usuario=0;
		float next_num=0;
		float promedio=0;
		int contador=0;
		
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("Introduce un número: ");
			next_num=sc.nextFloat();
			num_usuario=num_usuario+next_num;
			contador++;
			promedio=num_usuario/contador;
			System.out.println("El promedio es: " + promedio);
		}while(next_num!=0);
		
		sc.close();
		System.out.println("Programa finalizado");

	}

}
