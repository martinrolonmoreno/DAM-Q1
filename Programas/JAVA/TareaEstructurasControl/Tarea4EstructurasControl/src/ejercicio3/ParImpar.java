package ejercicio3;

/*Programa que dado un número, devuelva si es "PAR" o "IMPAR".*/

public class ParImpar {

	public static void main(String[] args) {
		//ZONA DE DATOS:Declaración e Inicialización de constantes y variables
		//Datos de entrada
		int num=0;
		
		
		//Datos de salida
		
		//ZONA DE INSTRUCCIONES		
		//Simulamos lectura de datos
		num=-2923838;
		
		
		//Condiciones
		
		if(num%2==0) { //si el módulo del número es igual a 0, este será par
			System.out.println("El número " + num + " es par");
		}
		else { //en caso contrarios será impar
			System.out.println("El número "+ num + " es impar");
		}

	}

}
