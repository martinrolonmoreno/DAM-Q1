package ejercicio10;

import java.util.Scanner;

/*Realizar un programa en Java que dados 3 valores introducidos por teclado, si todos son iguales se imprime la suma del primero 
 * con el segundo y a este resultado se le multiplica por el tercero.*/

public class TresNumeros {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int num3=0;
		int resultado=0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		num3=sc.nextInt();
		
		if(num1==num2 && num2==num3 && num1==num3) {
			resultado=(num1+num2)*num3;
			System.out.println("Los tres números son iguales. El restultado de sumar " + num1 + " a " + num2 + 
			" y multiplicar la suma por " + num3 + " equivale a: " + resultado );
		}
		
		else {
			System.out.println("Programa finalizado");
		}
		
		
		sc.close();
		System.out.println("Programa finalizado");

	}

}
