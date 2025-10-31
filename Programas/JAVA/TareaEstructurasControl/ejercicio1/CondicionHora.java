package ejercicio1;

/*Programa que muestra un mensaje en pantalla según el valor de una variable numérica:
- "Buenos días" si la hora está entre las 0 y las 12.
- "Buenas tardes" si la hora es menor de las 21.
- "Buenas noches" si la hora es menor de las 24.
- "Hora inválida" en caso contrario.*/

public class CondicionHora {

	public static void main(String[] args) {
		//ZONA DE DATOS:Declaración e Inicialización de constantes y variables
		//Datos de entrada
		int hora=0;
		//Datos de salida
		
		
		
		//ZONA DE INSTRUCCIONES		
		//Simulamos lectura de datos
		hora=23;
		//Condiciones
		if(hora<0) {
			System.out.println("Error, la hora no puede ser negativa");
		}
		else if (hora>=0 && hora<=12) {
			System.out.println("Buenos días, son las "+ hora + ":00 de la mañana");
		}
		else if(hora<21) {
			System.out.println("Buenas tardes, son las "+ hora+ ":00 de la tarde");
		}
		else if(hora<24) {
			System.out.println("Buenas noches, son las "+ hora+ ":00 de la noche");
		}
		
		
	
		
		

	}

}
