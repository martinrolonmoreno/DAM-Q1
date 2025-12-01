package ejercicio02;

import java.util.Scanner;

/*Crea un método llamado mostrarSerie que dados dos números enteros (inicio y fin) muestre todos los números entre ellos (ambos inclusive). 

Además, por cada número:

Si el número es múltiplo de 3, muestra también “ --> múltiplo de 3”.

Si es múltiplo de 5, muestra “ --> múltiplo de 5”.

Utilizar también dos métodos llamados  esMultiploDe3 y esMultipoDe5. Programar el main en el que se utiliza con varias invocaciones.*/

public class SerieNumeros {

	public static void main(String[] args) {
		
		int num_inicio=0;
		int num_final=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Por favor, introduce el número de inicio: ");
		num_inicio=leer_num(sc);
		}while(num_inicio<0);
		do {
		System.out.println("Por favor, introduce el número de fin: ");
		num_final=leer_num(sc);
		}while(num_final<0);
		
		
		for(int i=num_inicio;i<=num_final;i++) {
			
			if(esMultiploDe3(i) && esMultiploDe5(i)) {
				System.out.println( i + "--> múltiplo de 3 y 5");
			}
			else if(esMultiploDe3(i)) {
				System.out.println( i + "--> múltiplo de 3");
			}
			else if(esMultiploDe5(i)) {
				System.out.println( i + "--> múltiplo de 5");
			}
			else {
				System.out.println(i);
			}
		}
		
		sc.close();
		System.out.println("\nPrograma finalizado");
	
	}
	
	public static int leer_num(Scanner sc) {
		int num_leido=0;
		num_leido=sc.nextInt();
		return num_leido;
	}
	
	public static boolean esMultiploDe3(int num) {
		boolean es_multiplo3=false;
		if(num%3==0) {
			es_multiplo3=true;
		}
		else {
			es_multiplo3=false;
		}
		return es_multiplo3;
		
	}
	
	public static boolean esMultiploDe5(int num) {
		boolean es_multiplo5=false;
		if(num%5==0) {
			es_multiplo5=true;
		}
		else {
			es_multiplo5=false;
		}
		return es_multiplo5;
		
	}
	
	
	

}









