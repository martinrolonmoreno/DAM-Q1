package ejercicio12;

import java.util.Scanner;

/*Realizar un programa en Java que dados 3 valores introducidos por teclado, si al menos uno de los valores ingresados son menores a 10, 
 * imprimir en pantalla la leyenda (mensaje) "Alguno de los números es menores a diez".*/

public class UnoMenor10 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int num3=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		num3=sc.nextInt();
		
		if(num1<10 || num2<10 || num3<10) {
			System.out.println("Alguno de los números es menor a diez");
		}
		
		else {
			System.out.println("Ninguno de los números es menor a diez");
		}
		
		
		sc.close();
		System.out.println("Programa finalizado");

	}

}
