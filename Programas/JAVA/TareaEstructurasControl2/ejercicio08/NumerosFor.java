package ejercicio08;
import java.util.Scanner;

/*Realizar un programa en Java que lea n números enteros y calcule la cantidad de valores mayores o iguales a 1000 (usar bucle for).*/

public class NumerosFor {

	public static void main(String[] args) {
		
		int n;
		int contador=0;
		int num_usuario=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escriba la cantidad de números que desee analizar: ");
		
		n=sc.nextInt();
	
		for(int i=0;i<n;i++) {
			
			System.out.println("Introduce un valor: ");
			
			num_usuario=sc.nextInt();
			
			if(num_usuario>=1000) {
				contador+=1;
			}
		}
		
		System.out.println("De " + n + " números, " + contador + " son mayor o igual a 1000") ;
		
		
		sc.close();
		System.out.println("Programa finalizado");
		
	}
}
