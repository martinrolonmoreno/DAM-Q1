package figurasGeometricas;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		Circulo[] circulos = new Circulo[ARRAYSIZE];
		Rectangulo[] rectangulos = new Rectangulo[ARRAYSIZE];
		TrianguloEquilatero[] triangulos = new TrianguloEquilatero[ARRAYSIZE];
		
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
			
		
				circulos[Circulo.numeroObjetos] = new Circulo(radio);
				
				circulos[Circulo.numeroObjetos-1].imprimirObjeto();
				System.out.println("El perímetro es: " + circulos[Circulo.numeroObjetos-1].calcularPerimetro());
				System.out.println("El área es: " + circulos[Circulo.numeroObjetos-1].calcularArea());
				break;
			case 2:
				System.out.println(" *** TRIÁNGULO EQUILÁTERO ***");
				System.out.println("Por favor, introduce la base: ");
				base=Principal.leerBien(teclado);
				System.out.println("Por favor, introduce la altura: ");
				altura=Principal.leerBien(teclado);
				
				triangulos[TrianguloEquilatero.numeroObjetos]= new TrianguloEquilatero (base,altura);
				triangulos[TrianguloEquilatero.numeroObjetos-1].imprimirObjeto();
				
				/*try {
                System.out.println("Área: " + t.calcularArea());
                }catch(ArithmeticException ex) {
                	System.err.println("No se puede calcular el área porque altura es"
                			+ " cero");                   	
                }*/
                try {
                System.out.println(triangulos[TrianguloEquilatero.numeroObjetos-1].calcularAreaTres());
                }catch(ArithmeticException ex) {
                	System.out.println("capturada la excepcion en el main");
                }
				System.out.println("El perímetro es: " + triangulos[TrianguloEquilatero.numeroObjetos-1].calcularPerimetro());
				System.out.println("El área es: " + triangulos[TrianguloEquilatero.numeroObjetos-1].calcularArea());
				break;
			case 3:
				System.out.println(" *** RECTÁNGULO ***");
				System.out.println("Por favor, introduce el ancho: ");
				ancho=Principal.leerBien(teclado);
				System.out.println("Por favor, introduce el alto: ");
				altura=Principal.leerBien(teclado);
				
				rectangulos [Rectangulo.numeroObjetos] = new Rectangulo(ancho,alto);
				rectangulos [Rectangulo.numeroObjetos-1] .imprimirObjeto();
				System.out.println("El perímetro es: " + rectangulos [Rectangulo.numeroObjetos-1].calcularPerimetro());
				System.out.println("El área es: " + rectangulos [Rectangulo.numeroObjetos-1] .caclularArea());
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
		
		//RECORRIDO POR LOS 3 ARRAYS PARA VISUALIZAR LOS OBJETOS CREADOS
		
		
		
		for(int i=0;i<Circulo.numeroObjetos;i++) {
			circulos[i].imprimirObjeto();
		}
		for(int i=0;i<Rectangulo.numeroObjetos;i++) {
			rectangulos[i].imprimirObjeto();
		}
		for(int i=0;i<TrianguloEquilatero.numeroObjetos;i++) {
			triangulos[i].imprimirObjeto();
		}
		
		/*
		 * for (int i=0;i<circulos.length;i++){
		 * circulos[i].imprimirObjeto();
		 * }
		 * 
		 * Esta instrucción nos dará error a menos que el usuario haya creado al menos 
		 * 10 objetos circulo.
		 * 
		 * Si el usuario crea 4 objetos, el bucle seguirá a partir de la posición y 
		 * econtrará que circulos[5] está vacío, por lo que no puede invocar al método
		 * imprimirObjeto()
		 * 
		 * */
		
		
		
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
	
	public static final int ARRAYSIZE=10;
}
