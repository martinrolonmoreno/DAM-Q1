package ejercicio06;

import java.util.Scanner;

/*Realizar un programa en Java que lea dos números por teclado, los resta, y comprueba si el resultado de la resta es un número negativo. 
 * Si es así, el programa finaliza, en caso contrario, pide un número de nuevo y lo resta al resultado anterior, y así sucesivamente hasta que 
 * el resultado de la resta sea un número negativo.*/

public class RestaSucesiva {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		
		int num1, num2, resta=0;
		
		System.out.println("Por favor introduzca el primer número: ");
		num1=sc1.nextInt();
		
		System.out.println("Por favor introduzca el segundo número: ");
		num2=sc1.nextInt();
		
		resta=num1-num2;
		System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + resta);
		
		do { 
			System.out.println("Por favor introduce otro número: ");
			num2=sc1.nextInt();
			resta=resta-num2;
			System.out.println("La resta entre " + resta + " y " + num2 + " es: " + resta);
		}
		
		while(resta>0);

		sc1.close();
		System.out.println("Programa finalizado");

	}

}
