package ejercicio13;

import java.util.Scanner;

/*Realizar un programa en Java que pida ingresar la coordenada de un punto en el plano, es decir, dos valores enteros x e y. 
 * Posteriormente imprime en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 e y >0 , 2º Cuadrante: x < 0 e y > 0, etc.)*/

public class Coordenada {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce la coordenada x: ");
		x=sc.nextInt();
		System.out.println("Por favor, introduce la coordenada y: ");
		y=sc.nextInt();
		
		if(x>0 && y>0){
			System.out.println("Las coordenadas " + "(" + x + "," + y + ")" + " corresponden al primer cuadrante");
		}
		else if(x<0 && y>0){
			System.out.println("Las coordenadas " + "(" + x + "," + y + ")" + " corresponden al segundo cuadrante");
		}
		else if(x<0 && y>0) {
			System.out.println("Las coordenadas " + "(" + x + "," + y + ")" + " corresponden al tercer cuadrante");
		}
		else if(x>0 && y<0) {
			System.out.println("Las coordenadas " + "(" + x + "," + y + ")" + " corresponden al cuarto cuadrante");
		}
		
		else {
			System.out.println("Ha ocurrido un error");
		}
		
		sc.close();
		
		System.out.println("Programa finalizado");

		

	}

}
