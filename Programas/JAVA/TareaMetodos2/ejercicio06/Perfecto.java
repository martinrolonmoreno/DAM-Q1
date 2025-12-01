package ejercicio06;

import java.util.Scanner;

/*Crea un método esPerfecto que dado un número entero devuelva true si el número es perfecto (la suma de sus divisores propios es igual a él).
Ejemplo: la llamada a dicho método con 6 devuelve true, porque 1 + 2 + 3 = 6.*/

public class Perfecto {

	public static void main(String[] args) {
		
		int num=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		num=leer_num(sc);
		
		if(esPerfecto(num)) {
			System.out.println("equivale a " + num + " --> El número es pefecto");
		}
		else {
			System.out.println("no equivale a " + num + " --> El número no es perfecto");
		}
		
		sc.close();
		System.out.println("Programa finalizado");
	

	}
	
	public static int leer_num(Scanner sc) {
		int num_leido=0;
		num_leido=sc.nextInt();
		return num_leido;
	}
	
	public static boolean esPerfecto(int num) {
		boolean perfecto=false;
		int suma_multiplos=0;
		System.out.print("La suma de ");
		for(int i=1;i<num;i++) {
			if(num%i==0) {
			System.out.print(i + " ");
			suma_multiplos+=i;
			}

		}	
		if(suma_multiplos==num) {
			perfecto=true;
			}
		else {
			perfecto=false;
			}
		return perfecto;
	}
}
