package ejercicio03;

import java.util.Scanner;

/*Una planta que fabrica perfiles de hierro quiere procesar un lote de diferentes piezas. Realizar un programa en Java que pida ingresar por teclado a un 
 * operador, la cantidad de piezas a procesar en el lote y luego solicite por pieza la longitud del perfil de cada pieza; sabiendo que la pieza cuya longitud 
 * esté comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.*/

public class PerfilHierro {

	public static void main(String[] args) {
		
		int cantidad_piezas=0;
		double longitud_perfil=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de piezas a procesar: ");
		cantidad_piezas=sc.nextInt();
		
		for(int i=1;i<=cantidad_piezas;i++) {
			System.out.println("Introduce la longitud del perfil de la pieza " + i + ": ");
			longitud_perfil=sc.nextDouble();
			if(longitud_perfil>=1.2 && longitud_perfil<=1.3) {
				System.out.println("La pieza " + i + " es apta.");
			}
			else {
				System.out.println("La pieza " + i + " no es apta.");
			}
		}
		
		sc.close();
		
		System.out.println("Programa finalizado");
	
	}

}
