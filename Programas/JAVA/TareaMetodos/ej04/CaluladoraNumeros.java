package ej04;

import java.util.Scanner;

/*Realizar un programa en Java que imprima un menú con las siguientes opciones:

Selecciona una de las siguientes opciones:
1 Sumar
2 Restar
3 Multiplicar
4 Dividir
5 Cuadrado
6 Salir
Las operaciones de sumar, restar, multiplicar, dividir y cuadrado, se implementan en métodos separados.*/

public class CaluladoraNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir=false;
		int num1=0;
		int num2=0;
		int opcion=0;
		do {
			System.out.println("Por favor introduce una opción: \n1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Dividir\n5.-Cuadrado\n6.-Salir");
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Por favor introduce número 1: ");
				num1=teclado.nextInt();
				System.out.println("Por favor introduce número 2: ");
				num2=teclado.nextInt();
				System.out.println("La suma de " + num1 + " y " + num2 + " es " + sumar(num1,num2));
				break;
			case 2:
				System.out.println("Por favor introduce número 1: ");
				num1=teclado.nextInt();
				System.out.println("Por favor introduce número 2: ");
				num2=teclado.nextInt();
				System.out.println("La resta de " + num1 + " y " + num2 + " es " + restar(num1,num2));
				break;
			case 3:
				System.out.println("Por favor introduce número 1: ");
				num1=teclado.nextInt();
				System.out.println("Por favor introduce número 2: ");
				num2=teclado.nextInt();
				System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + multiplicar(num1,num2));
				break;
			case 4:
				System.out.println("Por favor introduce número 1: ");
				num1=teclado.nextInt();
				System.out.println("Por favor introduce número 2: ");
				num2=teclado.nextInt();
				System.out.println("La división de " + num1 + " y " + num2 + " es " + dividir(num1,num2));
				break;
			case 5:
				System.out.println("Por favor introduce número 1: ");
				num1=teclado.nextInt();
				System.out.println("Por favor introduce número 2: ");
				num2=teclado.nextInt();
				System.out.println("El cuadrado de " + num1 + " es " + cuadrado(num1));
				break;
			case 6:
				salir=true;
				break;
				
			default:
				System.out.println("Ha ocurrido un error");
			}
		
		}while(!salir);
		
		System.out.println("Programa finalizado");
		
		teclado.close();
		
		

	}
	
	public static int sumar(int num1, int num2) {
		return num1+num2;
	}
	public static int restar(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	public static int dividir(int num1, int num2) {
		return num1/num2;
	}
	public static int cuadrado(int num1) {
		return num1*num1;
	}
	

}
