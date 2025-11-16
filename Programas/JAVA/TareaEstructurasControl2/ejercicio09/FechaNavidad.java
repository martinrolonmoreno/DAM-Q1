package ejercicio09;

import java.util.Scanner;

/*Realizar un programa en Java que pida cargar una fecha cualquiera, y después verificar si dicha fecha corresponde a Navidad.*/

public class FechaNavidad {

	public static void main(String[] args) {
		
		int dia=0;
		int mes=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un día de mes");
		dia=sc.nextInt();
		while(dia<1 || dia>30 ) {
			System.out.println("Por favor, introduzca un día del mes válido: ");
			dia=sc.nextInt();
		}
		
		System.out.println("Introduce un número de mes");
		mes=sc.nextInt();
		while(mes<1 || mes>12) {
			System.out.println("Por favor, introduzca un número de mes válido: ");
			mes=sc.nextInt();
		}
		
		
		if(dia==25 && mes==12) {
			System.out.println("Es Navidad");
		}
		
		else {
			System.out.println("No es Navidad");
		}
		
		sc.close();
		
		System.out.println("Programa finalizado");
		

	}

}
