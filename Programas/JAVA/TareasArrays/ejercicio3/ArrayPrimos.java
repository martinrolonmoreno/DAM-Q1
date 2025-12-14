package ejercicio3;

import java.util.Scanner;

/*Crear un array de números de un tamaño pasado por teclado. El array contendrá números aleatorios primos entre los números 1 y 100. 
 * Por último indicar cual es el número mayor de todos los creados en el array.

Codificar los siguientes métodos:

-Generar número aleatorio entre un intervalo
-Comprobar si un número es primo
-Rellenar el array
-Mostrar el array
-Buscar el número mayor*/


public class ArrayPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longitud_array=0;
		System.out.println("Por favor, introduce el tamaño del array");
		longitud_array=sc.nextInt();
		int [ ] array1 = new int [longitud_array];
		
		ArrayPrimos ap = new ArrayPrimos();
		
		ap.rellenarArray(array1);
		
		ap.mostrarArray(array1);
		
		System.out.println("El número mayor del array es: " + ap.numMayor(array1));

		sc.close();
		System.out.println("Programa finalizado");

	}
	
	
	/*Método para rellenar el array*/
	public void rellenarArray(int array1[]) {
		int num_array=0;
		
		for (int i=0;i<array1.length;i++) {	
			do {
				num_array=numRandom();
			}while(!(esPrimo(num_array)));
			array1[i]=num_array;
		}
				
	}
	
	/*Método para mostrar el array*/
	public void mostrarArray(int array1[]) {
		for (int i=0;i<array1.length;i++) {
			System.out.println("El valor del array1 en la posición " + i + " es igual a: " + array1[i]);
		}
		
	}
	
	/*Método para calcular el número mayor del array*/
	public int numMayor(int array1[]) {
		int num_mayor=array1[0];
		
		for (int i=0;i<array1.length;i++) {
		
			if (array1[i]>num_mayor) {
				num_mayor=array1[i];
			}
		}
		return num_mayor;
	}
	
	/*Método para comprobar si un número es primo*/
	public boolean esPrimo(int num) {
		boolean es_primo=true;
		if(num==0 || num==1 || num==4) {
			es_primo=false;
		}
		else {
			for(int i=2;i<num/2;i++) {
				if(num%i==0) {
					es_primo=false;
				}
			}
		}
		return es_primo;
	}
	
	public boolean esPrimo2(int num) {
		boolean esprimo=false;
		int contador=0;
		
		for(int i=0;i<num;i++) {
			if(num%i==0) {
				contador++;
			}
		}
		if(contador>2) {
		   esprimo=false;
		}
		else {
		   esprimo=true;
		}
		return esprimo;
	}
	
	
	/*Método para generar un número aleatorio entre 1 y 100*/
	public int numRandom() {
		int num_random=0;
		do {
		num_random=(int)(Math.random()*100);
		}while(num_random<1 || num_random>100);
		return num_random;
	}

}
