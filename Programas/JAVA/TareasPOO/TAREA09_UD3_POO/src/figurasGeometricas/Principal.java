package figurasGeometricas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		int radio,ancho,base,altura,alto=0;
		
		do {
			System.out.println(" *** FIGURAS GEOMÉTRICAS ***\n1.-Crear Circulo\n2.-Crear Triángulo Equilátero\n3.-Crear Rectángulo\n4.-Salir\nElige opción");
			opcion=Principal.leerBien(teclado);
			switch(opcion) {
			case 1:
				System.out.println(" *** CIRCULO ***");
				System.out.println("Por favor, introduce el radio: ");
				radio=Principal.leerBien(teclado);
				Circulo circulo = new Circulo(radio);
				circulo.imprimirObjeto();
				System.out.println("El perímetro es: " + circulo.calcularPerimetro());
				System.out.println("El área es: " + circulo.calcularArea());
				break;
			case 2:
				System.out.println(" *** TRIÁNGULO EQUILÁTERO ***");
				System.out.println("Por favor, introduce la base: ");
				base=Principal.leerBien(teclado);
				System.out.println("Por favor, introduce la altura: ");
				altura=Principal.leerBien(teclado);
				TrianguloEquilatero triEqui = new TrianguloEquilatero (base,altura);
				triEqui.imprimirObjeto();
				
				/*try {
                System.out.println("Área: " + t.calcularArea());
                }catch(ArithmeticException ex) {
                	System.err.println("No se puede calcular el área porque altura es"
                			+ " cero");                   	
                }*/
                try {
                System.out.println(triEqui.calcularAreaTres());
                }catch(ArithmeticException ex) {
                	System.out.println("capturada la excepcion en el main");
                }
				System.out.println("El perímetro es: " + triEqui.calcularPerimetro());
				System.out.println("El área es: " + triEqui.calcularArea());
				
				break;
			case 3:
				System.out.println(" *** RECTÁNGULO ***");
				System.out.println("Por favor, introduce el ancho: ");
				ancho=Principal.leerBien(teclado);
				System.out.println("Por favor, introduce el alto: ");
				altura=Principal.leerBien(teclado);
				Rectangulo rectangulo = new Rectangulo(ancho,alto);
				rectangulo.imprimirObjeto();
				System.out.println("El perímetro es: " + rectangulo.calcularPerimetro());
				System.out.println("El área es: " + rectangulo.caclularArea());
				break;
			case 4:
				System.out.println("Número de círculo creados: " + Circulo.numeroObjetos);
				System.out.println("Número de triángulos equiláteros creados: " + TrianguloEquilatero.numeroObjetos);
				System.out.println("Número de rectángulos creados: " + Rectangulo.numeroObjetos);
				break;
				
			default:
				System.out.println("Opción inválida");
			}
		}while(opcion!=4);
		
		teclado.close();
		System.out.println("Bye!!");
		
	
	}
	
	
	
	public static int leerBien(Scanner teclado) {
		//Meter en un bucle la lectura
		boolean correcto=false;
		int opcion=0;
		do {
			try {
				opcion=teclado.nextInt();
				correcto=true;
			}
			catch(InputMismatchException ex) {
				System.out.println("ERROR: No has introducido un entero. Opción 4 ejecutándose");
				opcion=4;
			}
		}while(!correcto);
		
		return opcion;	
	}
}
