package ejercicio16;

import java.util.Scanner;

/*Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.*/

public class PromedioAltura {

	public static void main(String[] args) {
		int n=0;
		float altura_persona=0;
		float suma_alturas=0;
		float promedio=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de personas a calcular el promedio de su altura: ");
		n=sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println("Introduce la altura de la persona, en metros: ");
			altura_persona=sc.nextFloat();
			while(altura_persona<0) {
				System.out.println("La altura no puede ser negativa. Por favor, introdúcela de nuevo: ");
				altura_persona=sc.nextFloat();
			}
			suma_alturas+=altura_persona;
		}
		promedio=suma_alturas/n;
		System.out.println("El promedio de las alturas es: " + promedio + " metros");
		
		sc.close();
		System.out.println("Programa finalizado");
		
		

	}

}
