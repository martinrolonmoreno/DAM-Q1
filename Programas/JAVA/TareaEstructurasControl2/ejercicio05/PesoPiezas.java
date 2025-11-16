package ejercicio05;

import java.util.Scanner;

/*Realizar un programa en Java que permita ingresar el peso (en kilogramos) de piezas. El proceso termina cuando ingresamos el valor 0.
Se debe informar:
a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?
b) La cantidad total de piezas procesadas.*/

public class PesoPiezas {

	public static void main(String[] args) {
		
		float peso_pieza=0;
		int contador_piezas_ligeras=0;
		int contador_piezas_medianas=0;
		int contador_piezas_pesadas=0;
		int contador_total=0;
		
		Scanner sc= new Scanner(System.in);
		
		do {
			
			System.out.println("Introduce el peso de la pieza: ");
			peso_pieza=sc.nextFloat();
			if(peso_pieza<9.8) {
				contador_piezas_ligeras+=1;
			}
			else if(peso_pieza>=9.8 && peso_pieza<=10.2) {
				contador_piezas_medianas+=1;
			}
			
			else if(peso_pieza>10.2) {
				contador_piezas_pesadas+=1;
			}
			
			else {
				System.out.println("Ha ocurrido un error");
			}
			
			contador_total+=1;
			
		}while(peso_pieza!=0);
		
		System.out.println("Existen un total de " + contador_total + " piezas" + ", de las cuales: " + "\n" + contador_piezas_ligeras + 
		" son ligeras" +  "\n" + contador_piezas_medianas + " son de peso medio" + "\n" + contador_piezas_pesadas + " son pesadas");
		
		
		
		sc.close();
		System.out.println("Programa finalizado");
					
		

	}

}
