package ejercicio2;

import java.util.Scanner;

/*Crear un array de números donde se le indica por teclado el tamaño del array, se rellena el array con números aleatorios entre 0 y 9, al final se muestra por 
 * pantalla el valor de cada posición y la suma de todos los valores.

Realizar un método para rellenar el array (que tenga como parámetros el array), otro método para mostrar el contenido y la suma del array y un tercer método 
privado para generar número aleatorio.*/


public class ArrayAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int longitud_array=0;
		System.out.println("Por favor, introduce el tamaño del array");
		longitud_array=sc.nextInt();
		int []arrayRandom=new int[longitud_array];
		
		ArrayAleatorio a1 = new ArrayAleatorio();
		
		ArrayAleatorio.rellenarArray(arrayRandom);
		a1.mostrarArray(arrayRandom);
		
		sc.close();
		System.out.println("Programa finalizado");

	}
	
	
	public static void rellenarArray(int arrayRandom[]) {
		for (int i=0;i<arrayRandom.length;i++) {
			arrayRandom[i]=generarNumeroAleatorio(0,9);
		}
	}
	
	
	public void mostrarArray(int arrayRandom[]) {
		int suma_posiciones=0;
		for (int i=0;i<arrayRandom.length;i++) {
		System.out.println("En la posición " + i + " del array está almacenado el valor: " + arrayRandom[i]);
		suma_posiciones+=arrayRandom[i];
		}
		System.out.println("La suma del array es igual a " + suma_posiciones);
		
	}
	
	/*private static int numRandom() {
		int num_random=0;
		do {
		num_random=(int)(Math.random()*100);
		}while(num_random<0 || num_random>9);
		return num_random;
	}*/
	
	
	private static int generarNumeroAleatorio(int min, int max) {
		return(int)(Math.floor(Math.random()*(max-min+1)+min));
	
	}
}
