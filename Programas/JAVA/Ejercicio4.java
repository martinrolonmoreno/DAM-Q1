
/*Realizar un programa que tenga dos valores numéricos de entrada (con el valor que desees), muestra por consola la suma, resta, multiplicación, división, 
 * módulo, y cual de los dos valores es mayor.*/

package paquete1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=2928; /*Declaramos e inicializamos las variables de los 2 números con los que haremos las operaciones */
		int num2=483;
		int suma=num1+num2; /*Para cada resultado de las operaciones que hagamos creamos una variable en la que almacenarlo*/
		int resta=num1-num2;
		int multiplicacion=num1*num2;
		int division=num1/num2;
		int modulo=num1%num2;

		System.out.println("La suma de " + num1 + " y "+ num2 + " equivale a " + suma); /*Imprimimos en consola el resultado (almacenado en variable)*/
		System.out.println("La resta de " + num1 + " menos "+ num2 + " equivale a " + resta);
		System.out.println("La multiplicación de " + num1 + " por "+ num2 + " equivale a " + multiplicacion);
		System.out.println("La división de " + num1 + " entre "+ num2 + " equivale a " + division);
		System.out.println("El modulo de " + num1 + " entre "+ num2 + " equivale a " + modulo);
		
		if (num1>=num2) { /*Condición: Si el numero 1 es mayor o igual que numero 2, imprimiremos en consola el número 1*/
			System.out.println("El número más grande es " + num1);
		}
		
		else { /*En caso contrario al anterior, imprimiremos en consola el número 2*/
			System.out.println("El número más grande es " + num2);
		}
		
	}

}
