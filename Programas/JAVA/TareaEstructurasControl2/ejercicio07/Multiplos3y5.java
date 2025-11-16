package ejercicio07;

import java.util.Scanner;

import java.util.ArrayList;

/*Realizar un programa en Java que lea 10 números enteros y luego muestre cuántos valores ingresados son múltiplos de 3 y cuántos de 5. 
 * Hay que tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.*/

public class Multiplos3y5 {

	public static void main(String[] args) {
		
		int num_usuario=0;
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList <Integer> multiplos_3_y_5 = new ArrayList<Integer>();
		ArrayList <Integer> multiplos_3 = new ArrayList<Integer>();
		ArrayList <Integer> multiplos_5 = new ArrayList<Integer>();
		ArrayList <Integer> no_multiplos = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++) {
			System.out.println("Introduce un número: ");
			num_usuario=sc.nextInt();
			if(num_usuario%3==0 && num_usuario%5==0) {
				System.out.println(num_usuario + " es múltiplo de 3 y 5");
				multiplos_3_y_5.add(num_usuario);
			}
			
			else if (num_usuario%3==0) {
				System.out.println(num_usuario + " es múltiplo de 3");
				multiplos_3.add(num_usuario);
			}
			
			else if(num_usuario%5==0) {
				System.out.println(num_usuario + " es múltiplo de 5");
				multiplos_5.add(num_usuario);
			}
			
			else {
				System.out.println(num_usuario + " no es múltiplo ni de 3 ni de 5");
				no_multiplos.add(num_usuario);
			}
		}
		
		System.out.println("Los números que son múltiplos tanto de 3 como de 5 son: " + multiplos_3_y_5);
		System.out.println("Los números que son múltiplos de 3 son: " + multiplos_3);
		System.out.println("Los números que son múltiplos de 5 son: " + multiplos_5);
		System.out.println("Los números que no son ni múltiplos de 3 ni de 5 son: " + no_multiplos);
		
		sc.close();
		System.out.println("Programa finalizado");
		

		
	}

}
