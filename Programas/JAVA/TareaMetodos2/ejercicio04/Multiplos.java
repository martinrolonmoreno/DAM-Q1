package ejercicio04;

import java.util.Scanner;

/*Crea un método sumaMultiplos que dado un número entero devuelva la suma de todos los números entre 1 y dicho número que sean múltiplos de 3 o de 5.

Utilizar también dos métodos llamados  esMultiploDe3 y esMultipoDe5. Programar el main en el que se utiliza con varias invocaciones.

Ejemplo: la llamada a dicho método con 10 devuelve 33 (3 + 5 + 6 + 9 + 10).*/

public class Multiplos {

	public static void main(String[] args) {
		
		int num=0;
		int suma_total=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		num=leer_num(sc);
		
		for(int i=1;i<=num;i++) {
		
			if(esMultiploDe3(i) || esMultiploDe5(i)) {
				System.out.print(i);
				if(i!=num) {
				System.out.print(" + ");
				}
				suma_total+=i;
			}
		}
		
		System.out.println(" = " + suma_total);
		
		sc.close();
		System.out.println("Programa finalizado");
	
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
