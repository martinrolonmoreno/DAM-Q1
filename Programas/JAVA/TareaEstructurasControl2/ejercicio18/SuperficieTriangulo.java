package ejercicio18;

import java.util.Scanner;

/*Confeccionar un programa Java que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. 
 * El programa deberá informar:
a) De cada triángulo la medida de su base, su altura y su superficie.
b) La cantidad de triángulos cuya superficie es mayor a 12.*/

public class SuperficieTriangulo {

	public static void main(String[] args) {
		int n=0;
		float base=0;
		float altura=0;
		float superficie=0;
		int contador_triangulos=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el número de pares que quiere analizar");
		n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Introduzca la base del triángulo");
			base=sc.nextFloat();
			System.out.println("Introduzca la altura del triángulo");
			altura=sc.nextFloat();
			superficie=base*altura;
			System.out.println("La superficie del triángulo es: " + superficie);
			if(superficie>12) {
				contador_triangulos++;
			}
		}
		System.out.println("En total, hay " + contador_triangulos + " triángulos con superficie mayor a 12");
		
		sc.close();
		System.out.println("Programa finalizado");
		
		
		
		
		

	}

}
