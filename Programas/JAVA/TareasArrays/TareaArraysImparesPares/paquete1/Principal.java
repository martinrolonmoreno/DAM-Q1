package paquete1;

import java.util.Scanner;


/*Crear el código en java del siguiente programa.

Crear un primer array de enteros, el tamaño lo elegirá el usuario, de números aleatorios impares, entre 5 y 50. Se elige el número más pequeño de 
este array que será el tamaño del siguiente array a construir. Este último se rellenará con números aleatorios pares, entre 1 y el tamaño de este 
segundo array. Elegir el número menor y el mayor de dicho array y devolver el máximo común divisor de ambos números. Realizar todo con diferentes métodos.

Codificar los siguientes métodos:

-Generar número aleatorio entre un intervalo pasado como parámetro (utilizar el trabajado en clase).
-Comprobar si un número es impar o par.
-Rellenar el array. Se puede crear un mismo método para rellenar ambos arrays o dos métodos diferentes.  Justificar la decisión tomada.
-Mostrar el array.
-Buscar el número menor.
-Buscar el número mayor.
-Calcular el máximo común divisor*/


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longitud_array=0;
		System.out.println("Por favor, introduce la longitud del array de impares: ");
		longitud_array=sc.nextInt();
		System.out.println("Tamaño del ARRAY IMPARES: " + longitud_array);
		
		/*Creamos un primer array cuyo tamaño es elegido por el usuario*/
		int [] array1 = new int [longitud_array];
		
		rellenarPrimerArray(array1);
		mostrarPrimerArray(array1);
		
		/*Creamos un segundo array cuyo tamaño es el número más pequeño del primer array*/
		int [] array2 = new int [Principal.numMenor(array1)];
		
		
		System.out.println("Tamaño del ARRAY PARES: " + array2.length);
		rellenarSegundoArray(array2);
		mostrarSegundoArray(array2);
		
		/*Elección del número menor del array 2*/
		int num_menor=Principal.numMenor(array2);
		
		/*Elección del número mayor del array 2*/
		int num_mayor=Principal.numMayor(array2);
		
		/*Máximo común divisor del número menor y mayor del array 2*/
		
		int mcd=Principal.calculoMCD(num_menor, num_mayor);
		
		/*Imprimimos por consola el máximo común divisor del número menor y mayor del array 2*/
		System.out.println("El máximo común divisor de " + num_menor + " y " + num_mayor + " es: " + mcd);
		
		
		sc.close();
		
		System.out.println("Programa finalizado");
		
	}
	
	
	
	/*Método que compueba si el número es par o impar*/
	
	public static boolean esPar(int num) {
		boolean es_par=false;
		if (num%2==0){
			es_par=true;
		}
		else {
			es_par=false;
		}
		return es_par;
	}
	
	
	
	
	/*Método que genera un número aleatorio para el primer array, entre un intervalo pasado como parámetro. Generaremos números aleatorios mientras que estos sean
	 pares. Cuando se genere un número impar, se almacenará en la variable num_generado y el método devolverá dicha variable*/
	
	public static int numAleatorioPrimerArray (int num_min, int num_max) {
		int min=num_min;
		int max=num_max;
		int num_generado=0;
		
		do {
		num_generado=(int)(Math.floor(Math.random()*(max-min+1)+min));
		}while(esPar(num_generado));
		return num_generado;
	}
	


	/*Método que genera un número aleatorio para el segundo array, entre un intervalo pasado como parámetro. Al generar el número comprobamos si está dentro del rango 
	 * y si es par*/
	public static int numAleatorioSegundoArray (int num_min, int array2[]) {
		int min=num_min;
		int max=array2.length;
		int num_generado=0;
		
		do {
			num_generado=(int)(Math.floor(Math.random()*(max-min+1)+min));
		}while(!(esPar(num_generado)));
		return num_generado;
	
	}
	
	
	
	
	/*Método que rellena el primer array*/
	
	public static void rellenarPrimerArray(int array[]) {
		for (int i=0;i<array.length;i++) {
			array[i]=numAleatorioPrimerArray(5,50); 
		}
	}
	
	public static void rellenarSegundoArray(int array[]) {
		for (int i=0;i<array.length;i++) {
			array[i]=numAleatorioSegundoArray(1,array);
		}
	}
	
	
	
	/*Método que muestra el array*/
	
	public static void mostrarPrimerArray(int array[]) {
		System.out.println("ARRAY DE IMPARES:");
		for (int i=0;i<array.length;i++) {
			System.out.println("La posición " + i + " del primer array contiene el valor: " + array[i]);
		}
		System.out.println("\n");
	}
	
	public static void mostrarSegundoArray(int array[]) {
		System.out.println("ARRAY DE PARES:");
		for (int i=0;i<array.length;i++) {
			System.out.println("La posición " + i + " del segundo array contiene el valor: " + array[i]);
		}
	}
	
	
	
	/*Método que busca el número menor*/
	
	public static int numMenor(int array[]) {
		int num_menor=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<num_menor) {
				num_menor=array[i];
			}
		}
		return num_menor;
		
	}
	
	/*Método que busca el número mayor*/
	
	public static int numMayor(int array[]) {
		int num_mayor=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>num_mayor) {
				num_mayor=array[i];
			}
		}
		return num_mayor;
	}
	
	/*Método que calcula el máximo común divisor*/
	
	public static int calculoMCD(int num_menor, int num_mayor) {
		int x=0;
		while(num_mayor!=0) {
			x=num_mayor;
			num_mayor=num_menor%num_mayor;
			num_menor=x;
		}
		return num_menor;
	}
	
	

}
