package ejercicio19;

import java.util.ArrayList;
import java.util.Scanner;

/*Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.*/

public class UltimosSumados {

	public static void main(String[] args) {
		
		int num_usuario=0;
		int suma=0;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> lista_numeros = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduce un número");
			num_usuario=sc.nextInt();
			lista_numeros.add(num_usuario);
		}
		
		for(int i=5;i<10;i++) {
			suma+=lista_numeros.get(i);
		}
		
		System.out.println("La suma de los últimos 5 números es igual a: " + suma);
		
		sc.close();
		System.out.println("Programa finalizado");
		

	}

}
