package ejercicio02;


/*Programa que incluya una clase Temperatura con dos métodos, uno que transforme ºC a ºF y otro que transforme ºF a ºC. 
 * En el main,  mostrar la tabla de equivalencias entre grados Fahrenheit y grados celsius, mostrando los valores entre 10 y 100, de 10 en 10.*/

public class Temperatura {
	
	//Método gradosCelsius: dada una temperatura (float) pasar de grados Fahrenheit y devolverla en Celsius
	//1-Qué necesita - parámetros de entrada:
	//2-Qué hace - instrucciones del cuerpo del método
	//3-Qué devuelve o retorna y el tipo

	public static void main(String[] args) {
		
		float grados=0.0F;
		System.out.println("\tgrados\t\tºC\t\tºF");
		System.out.println("---------------------------------------------------");
		for(grados=10;grados<=100;grados=grados+10) {
			System.out.print("|\t" + grados + "\t|\t");
			System.out.printf("%.3f", gradosCelsius(grados));
			System.out.print("\t|\t" + gradosFahrenheit(grados) + "\t|\n" );
			System.out.println("---------------------------------------------");
		}
		

	}
	
	public static float gradosCelsius(float tempF) {
		float temperatura=0;
		temperatura=((tempF-32)*5/9);
		return temperatura;
	}
	
	public static float gradosFahrenheit(float tempC) {
		float temperatura=0;
		temperatura=((tempC*9/5)+32);
		return temperatura;
	}

}
