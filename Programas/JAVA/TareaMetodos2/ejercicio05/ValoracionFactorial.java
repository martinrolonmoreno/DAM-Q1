package ejercicio05;

import java.util.Scanner;

/*Crea un método factorial que dado un número entero devuelva la suma el factorial de dicho número , pero:

Si el número es negativo, devuelve -1 para indicar error.

Programar el main en el que se utiliza con varias invocaciones y que muestre un mensaje distinto si el resultado es -1.*/

public class ValoracionFactorial {

	public static void main(String[] args) {
		int num=0;
		int resultado_factorial=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		num=leer_num(sc);
		
		resultado_factorial=factorial(num);
		if(resultado_factorial==-1) {
			System.out.println("No se puede calcular el factorial de un número negativo");
		}
		else {
			System.out.println("El factorial de " + num + " es: " + resultado_factorial);
		}
		
		sc.close();
		System.out.println("Programa finalizado");

	}
	
	public static int leer_num(Scanner sc) {
		int num_leido=0;
		num_leido=sc.nextInt();
		return num_leido;
	}
	
	public static int factorial(int num) {
		if(num<0) {
			return -1;
		}
		else if (num==1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}

}
