package ejercicio03;

import java.util.Scanner;

/*Realizar el programa del menú con las opciones 1) Calcular hora 2) Calcular mes 3) Par o impar 4) Salir, utilizando métodos. 
 * Incluir también como método, la lectura de datos de entrada. El método para el caso 3) que devuelva si el número es par o no, 
 * para utilizar luego dentro del switch.
*/

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int num_u=0;
		int num_h=0;
		int num_m=0;
		int num_par_impar=0;
	
		do {
			
			num_h=leer_menu(sc);
			
			switch(num_h) {
			
				case 1:
					
					if(num_h>=0 && num_h<=12) {
						System.out.println("Buenos días, son las " + num_h + " de la mañana");
					}
					
					else if(num_h>12 && num_h<=21) {
						System.out.println("Buenas tardes, son las " + num_h + " de la tarde");
					}
					
					else if(num_h>21 && num_h<=24) {
						System.out.println("Buenas noches, son las " + num_h + " de la noche");
					}
					else {
						System.out.println("Hora inválida");
					}
					break;
					
				case 2:
					System.out.println("Introduce un número");
					num_m=leer_entrada(sc);
					String [] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
					
					while(!(num_m>=1) || !(num_m<=12)) {
						System.out.println("El número debe estar entre 1 y 12. Por favor, vuelve a introducir un número");
						
						num_m=sc.nextInt();
					}
						System.out.println("El número " + num_m + " corresponde con el mes de " + meses[num_m-1]);
					break;
						
				case 3:
					//num_par_impar=sc.nextInt();
					
					System.out.println("Introduce un número");
					num_par_impar=leer_entrada(sc);
					if(es_par(num_par_impar)) {
						System.out.println("El número " + num_par_impar + " es par");
					}
					else {
						System.out.println("El número " + num_par_impar + " es impar");
					}
					
					
					
					
					break;
							
				case 4:
					System.out.println("Programa finalizado");
					break;
					
				default:
					System.out.println("El número introducido es incorrecto");
				
			}
			
			
		}while(!(num_u>=1) && !(num_u<=4));
		
		sc.close();
		
		
		System.out.println("Bye Bye!");

	}
	
	//Método menú que muestra por pantalla un menú, lea la opción y la devuelva
	public static void menu() {
		System.out.println("Introduce un número del 1 al 4");
	}
	
	//Método menú que muestre por pantalla un menú, lea la opción y la devuelva
	public static int leer_menu(Scanner sc) {
	
		int opcion_menu=0;
		System.out.println("1)Calculo Hora" + "\n" + "2)Calculo Mes" + "\n" + "3)Par o Impar" + "\n" + "4)Salir");
		System.out.println("Introduce la opción deseada: ");
		opcion_menu=sc.nextInt();
		return opcion_menu;
	}
	public static int leer_entrada(Scanner sc) {
		return sc.nextInt();
	}
		
	
	public static boolean es_par(int numero) {
		if(numero%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

	}


