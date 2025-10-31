package ejercicio7;

/*Saldrá un pequeño menú por pantalla que pida elegir entre las siguientes opciones: 
1) Calculo Hora
2) Calculo Mes
3) Par o Impar
4) Salir
Tomaremos de pantalla el número que haya elegido el usuario, y dependiendo de éste haremos lo siguiente:

Si ha pulsado 1: pedirá un número por pantalla (número de hora del día), y devolverá si es "Buenos días", "Buenas tardes", "Buenas noches" 
(es el código que habéis hecho en el ejercicio 1).

Si ha pulsado 2: pedirá un número por pantalla (número de mes), y devolverá el nombre del mes correspondiente (es el código que habéis hecho en el 
ejercicio 2).

Si ha pulsado 3: pedirá un número por pantalla , y devolverá si es par o impar (es el código que habéis hecho en el ejercicio 3).
Si ha pulsado 4: Finalizará el programa.

Si ha pulsado cualquier otra cosa: Decimos por pantalla "Error en la elección".

El menú funcionará en bucle, es decir, salvo que pulsemos el 4 para salir del programa, siempre volverá a la pantalla principal para elegir otra opción 
de las posibles.*/

import java.util.Scanner;

public class NumeroPantalla {

	public static void main(String[] args) {
		
		System.out.println("1)Calculo Hora" + "\n" + "2)Calculo Mes" + "\n" + "3)Par o Impar" + "\n" + "4)Salir");
		Scanner sc=new Scanner(System.in);
		
		int num_u=0;
		int num_h=0;
		int num_m=0;
		int num_par_impar=0;
		do {
			System.out.println("Escribe el número de la opción que deseas que se lleve a cabo: ");
			num_u=sc.nextInt();
			
			switch(num_u) {
			
				case 1:
					System.out.println("Introduce la hora");
					num_h=sc.nextInt();
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
					System.out.println("Introduce un número de mes");
					num_m=sc.nextInt();
					String [] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
					
					while(!(num_m>=1) || !(num_m<=12)) {
						System.out.println("El número debe estar entre 1 y 12. Por favor, vuelve a introducir un número");
						
						num_m=sc.nextInt();
					}
						System.out.println("El número " + num_m + " corresponde con el mes de " + meses[num_m-1]);
					break;
						
				case 3:
					System.out.println("Introduce un número para comprobar si es par o impar");
					num_par_impar=sc.nextInt();
					if(num_par_impar%2==0) {
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

}



















