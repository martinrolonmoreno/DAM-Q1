
/*En este programa haremos una pequeña mejora respecto a la primera forma de hacer el ejercicio 1, añadiendo un escáner que lea los números introducidos por
 * el usuario en consola y devolviendo la media de estos*/

package paquete1;

import java.util.Scanner; /*Importamos la clase Scanner del paquete java.util, el cual nos permitirá leer datos introducidos en consola*/

public class Ejercicio1Extendido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner escaner1 = new Scanner(System.in); /*Creamos un escaner utilizando la clase Scanner (instanciamos la clase)*/
		
		System.out.println("Introduce la primera nota"); /*Pedimos al usuario por consola que introduzca una nota*/
		
		double num1 = escaner1.nextDouble(); /*El escaner lee lo que hay en consola hasta el último espacio en blanco (método nextDouble), y lo almacena en la 
		variable num1*/
		
		System.out.println("Introduce la segunda nota"); /*El proceso se repite para los otros 2 números*/
		
		double num2 = escaner1.nextDouble();
		
		System.out.println("Introduce la tercera y última nota");
		
		double num3 = escaner1.nextDouble();
		
		double media = (num1+num2+num3)/3;
		
		System.out.println("La media de las 3 notas es: " + media);
		
		escaner1.close(); /*Cerramos la lectura del escáner (es una práctica recomendada para evitar consumir recursos de forma innecesaria)*/

	}

}
