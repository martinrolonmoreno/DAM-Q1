package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float kms,litros,vmed,pgas=0;
		Scanner sc = new Scanner(System.in);
		Consumo consumo1 = new Consumo();
		System.out.println(consumo1.getInfo() + " -->Tiempo: " + consumo1.tiempo());
		
		
		//Crear objetos de manera dinámica
		
		do {
		System.out.println("Por favor, introduce los kilómetros recorridos durante el viaje: ");
		kms=sc.nextFloat();
		}while(kms<=0);
			
		do {
		System.out.println("Por favor, introduce los litros de combustible consumido");
		litros=sc.nextFloat();
		}while(litros<=0);
			
		do {
		System.out.println("Por favor, introduce la velocidad media durante el viaje");
		vmed=sc.nextFloat();
		}while(vmed<=0);
			
		do {
		System.out.println("Por favor, introduce el precio del combustible");
		pgas=sc.nextFloat();
		}while(pgas<=0);
		
		Consumo consumo2 = new Consumo (kms, litros,vmed, pgas);
		System.out.println("El tiempo es: " + consumo2.tiempo() + " horas");
		System.out.println("El consumo medio es: " + consumo2.consumoMedio()+ " litros/100km");
		System.out.println("El consumo en euros es: " + consumo2.consumoEuros()+ " euros/100km");

			
		
		
		sc.close();
		System.out.println("Programa finalizado");
		
	}

}