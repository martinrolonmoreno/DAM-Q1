package ejercicio5;

/*Programa que muestra una tabla de equivalencias entre grados Fahrenheit y grados celsius, mostrando los valores entre 10 y 100, de 10 en 10.*/


public class FarenheitCelsius {

	public static void main(String[] args) {
		//ZONA DE DATOS:Declaración e Inicialización de constantes y variables
		//Datos de entrada
		double fahrenheit=0;
		double celsius=0;
		
		//Datos de salida
		//ZONA DE INSTRUCCIONES
		//Simulamos lectura de datos
		
		System.out.println("Conversión de celsius a Fahrenheit:");
		
		for(int i=10;i<100;i+=10) {
			
			celsius=i; //almacenamos el valor de cada iteración en la variable celsius
			
			fahrenheit=celsius*9/5+32; //almacenamos en la variable fahrenheit el resultado de la conversión de fahrenheit a celsius
			
			System.out.println(i + "ºC Celsius equivalen a " + (int)fahrenheit + "ºF Fahrenheit"); /*por cada iteración del bucle imprimimos el resultado de
			la conversión utilizando un casting a entero para evitar decimales en exceso*/
		}
		
		System.out.println("\n" + "Conversión de Fahrenheit a Celsius: ");
		
		for(int i=10;i<100;i+=10) {
			
			fahrenheit=i;
			
			celsius=(fahrenheit-32)*5/9;
			
			System.out.println(i + "ºF Fahrenheit equivalen a " + (int)celsius + "ºC Celsius");
		}
		
	}

}
