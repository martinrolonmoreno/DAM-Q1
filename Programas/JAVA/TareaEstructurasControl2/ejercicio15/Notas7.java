package ejercicio15;

/*Escribir un programa en Java que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.*/

import java.util.Scanner;

public class Notas7 {

	public static void main(String[] args) {
		
		int nota_alumno=0;
		int contador_notas_altas=0;
		int contador_notas_bajas=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Por favor, introduzca la nota del alumno: ");
			nota_alumno=sc.nextInt();
			while(nota_alumno<0) {
				System.out.println("Vuelva a introducir la nota, esta no puede ser negativa: ");
				nota_alumno=sc.nextInt();
			}
			if(nota_alumno>=7) {
				contador_notas_altas+=1;
			}
			else {
				contador_notas_bajas+=1;
			}
		}
		
		System.out.println("En total, hay " + contador_notas_altas + " alumnos con una nota igual o superior a 7, y " 
		+ contador_notas_bajas + " alumnos con una nota inferior a 7");
		
		sc.close();
		System.out.println("Programa finalizado");
		


	}

}
