
/*Ejercicio 1: Crear un programa Java para calcular el promedio de 3 notas dadas. Codificarlo a partir del pseudocódigo de la tarea anterior.*/

package paquete1;


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1=6; /*declaramos e inicializamos las variables num1,num2 y num3, que representan los números con los que calcularemos la 
		media de notas*/
		double num2=8;
		double num3=3; /*Los valores los almacenamos en una variable de tipo double para que, en caso de que la media de un número decimal, no
		redondee*/
		
		double media=(num1+num2+num3)/3; /*almacenamos en una variable, a la que llamamos media, el resultado de la operación de media de 3 números*/
		
		System.out.println(media); /*Imprimimos en pantalla el valor almacenado en la variable media*/
		
		
		
		
	}

}





