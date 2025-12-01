package ejercicio01;

import java.util.Scanner;

/*Crea un método llamado saludar que dada una hora (entre 0 y 23) y un día de la semana (entre 1 y 7), muestre un saludo distinto según la hora del día:

Mañana (0–11): “Buenos días”

Tarde (12–19): “Buenas tardes”

Noche (20–23): “Buenas noches”

Si el día de la semana es 6 o 7, añade el mensaje “¡Feliz fin de semana!”.

Programar el main en el que se utiliza con varias invocaciones.*/

public class SaludoDinamico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora=0;
		String saludo_hora="";
		int num_semana=0;
		boolean es_finde=false;
		
		System.out.println("Introduzca una hora. Debe ser entre 0 y 23");
		hora=leer_num(sc);
		while(hora<0 || hora>23) {
			System.out.println("Introduzca una hora. Recuerde que debe ser entre 0 y 23");
			hora=sc.nextInt();
		}
		saludo_hora=leer_hora(hora);
		System.out.println(saludo_hora);
		
		
		System.out.println("Introduce un número de semana");
		num_semana=leer_num(sc);
		while(num_semana<1 || num_semana>7) {
			System.out.println("Introduzca una hora. Recuerde que debe ser entre 0 y 23");
			num_semana=sc.nextInt();
		}
		
		es_finde=es_finde(num_semana);
		
		if(es_finde) {
			System.out.println("¡Feliz fin de semana!");
		}
		
	
		sc.close();
		System.out.println("Programa finalizado");

	}
	
	public static int leer_num(Scanner sc) {
		int num_leido=0;
		num_leido=sc.nextInt();
		return num_leido;
	}
	

	public static String leer_hora(int num_usuario){
		String saludo=" ";
		if(num_usuario>=0 && num_usuario<=11) {
			saludo="Buenos días";
		}
		else if (num_usuario>=12 && num_usuario<=19){
			saludo="Buenas tardes";
		}
		else {
			saludo="Buenas noches";
		}
		return saludo;
	}
	
	public static boolean es_finde(int num_semana){
		boolean finde=false;
		if(num_semana==6 || num_semana==7) {
			finde=true;
		}
		else {
			finde=false;
		}
		return finde;
	}
}
