package ejercicio2;

/*Programa que dado un número (correspondiente al número de mes), devuelva por pantalla el nombre del mes en texto, o "Mes inválido" en caso contrario.*/

public class NumeroMes {

	public static void main(String[] args) {
		//ZONA DE DATOS:Declaración e Inicialización de constantes y variables
		//Datos de entrada
		int num=0;
		
		//Datos de salida
		
		
		
		//ZONA DE INSTRUCCIONES		
		//Simulamos lectura de datos
		num=11;
		
		//Condiciones
		
		switch(num){ //El switch valora el valor almacenado en una variable y en base a este valor realiza una instrucción u otra
		
			case 1: //En el caso de que el valor almacenado sea 1.....
				System.out.println("Enero"); // se ejecuta esta instrucción 
				break; //el break es necesario para salir del switch, si no sigue evaluando el resto de posibilidades
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
	
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
		}

	 
   }
}
