package ejercicio6;

import java.util.Scanner;

/*Programa que lee dos números por teclado, los resta, y comprueba si el resultado de la resta es un número negativo. Si es así, el programa finaliza, 
 * en caso contrario, pide un número de nuevo y lo resta al resultado anterior, y así sucesivamente hasta que el resultado de la resta sea un número
 *  negativo.*/

public class RestaNumeros {

	public static void main(String[] args) {
		//ZONA DE DATOS:Declaración e Inicialización de constantes y variables
		//Datos de entrada
		
		int num1,num2,restaNum=0;
		Scanner escaner1 = new Scanner(System.in); //Con el escáner leeremos los 2 primeros números escritos en consola para calcular su resta
		
		System.out.println("Introduce el primer número por consola: ");
		
		num1=escaner1.nextInt();
		
		System.out.println("Introduce el segundo número por consola: ");
		
		num2=escaner1.nextInt();
		
		restaNum=num1-num2; //Almacenamos la resta de los números en la variable restaNum
		
		
		if(restaNum<0) {
			System.out.println("Programa finalizado, la resta da un resultado negativo"); /*En caso de que la resta obtenga un número negativo, 
			el programa finaliza*/
		}
		
		else { /*En caso de que la resta no de un número negativo*/
			
			int nextRestaNum=restaNum; /*almacenamos la resta anterior en la variable nextRestaNum*/
			while(nextRestaNum>=0) { /*mientras que la variable sea mayor o igual a 0....*/
				
				System.out.println("Introduce otro número por consola: "); /*Pedimos otro número por consola*/
				
				int nextNum=escaner1.nextInt();
				
				nextRestaNum=restaNum-nextNum; /*Restamos el número leido en consola a la resta anterior, y almacenamos el resultado en la variable 
				nextRestaNum. Ahora se volverá a valorar la condición de nextRestaNum>=0*/
			}
			
			escaner1.close();
			System.out.println("Programa finalizado, la resta da un resultado negativo");
	
		}
		
	}
	
}
