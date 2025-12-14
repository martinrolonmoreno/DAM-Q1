package ejercicio1;

import java.util.Scanner;

/*Crear un array de 10 posiciones de números enteros, con valores pedidos por teclado.

Mostrar por consola el índice y el valor al que corresponde.

Hacer dos métodos, uno para rellenar valores y otro para mostrar.*/

public class Principal {

	public static final int MAX_LENGTH=10;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		//int lista[];
		//lista=new int[10];
		
		
		int [] arrayEnteros= new int [MAX_LENGTH];
		
	
		/*
		System.out.println("Por favor introduce un valor");
		arrayEnteros[0]=sc.nextInt();
		
		System.out.println("Por favor introduce segundo valor");
		arrayEnteros[1]=sc.nextInt();
		
		System.out.println("Por favor introduce tercer valor");
		arrayEnteros[2]=sc.nextInt();*/
		
		rellenarArray(arrayEnteros,sc);
		mostrarArray(arrayEnteros);
		
		
		//RECORRER EL ARRAY PARA OBTENER LOS DATOS
		/*for (int i=0;i<=arrayEnteros.length-1;i++) {
			System.out.println("En la posición " + i + ":" + arrayEnteros[i]);
		}*/
		
		sc.close();
		System.out.println("Programa finalizado");
	
	}
	
	/*public static void rellenarValores(Scanner sc, int arrayEnteros[]) {
		for(int i=0;i<arrayEnteros.length;i++) {
			System.out.println("Introduce un número entero");
			arrayEnteros[i]=sc.nextInt();
		}
	}*/
	
	public static void rellenarArray(int array[],Scanner sc) {
		for(int i=0;i<=array.length-1;i++) {
			System.out.println("Por favor introduce valor " +i+ ": ");
			array[i]=sc.nextInt();
		}
	}
	
	public static void mostrarArray(int array[]) {
		//RECORRER EL ARRAY PARA MOSTRAR LOS DATOS
		for(int i=0;i<=array.length-1;i++) {
			System.out.println("arrayEnteros[" + i + "]" + "="+ array[i]);
		}
	}
	
	
	

	

}
