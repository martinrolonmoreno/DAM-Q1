package ejercicio4;

/*Programa que saque por pantalla los números pares hasta el 50 (con los tres tipos de bucles).*/

public class Par50 {

	public static void main(String[] args) {
		//ZONA DE DATOS:Declaración e Inicialización de constantes y variables
		//Datos de entrada
		int num1=0;
		boolean par=false;
		
		
		//Datos de salida
		//ZONA DE INSTRUCCIONES
		//Simulamos lectura de datos
		
		
		//Primer tipo de bucle
		while(num1<50) { //Mientras que el número sea menor que 50....
			if(num1%2==0) { //Si es par, el valor booleano de la variable será igual a true
				par=true;
			}
			else {
				par=false; //en caso contrario será negativo
			}
			
			if(par) { //si par es true...
				System.out.println(num1); //lo imprimimos en consola para mostrar el número par
			}
			num1++; //incrementamos en 1 el num1 y volvemos a valorar la condición del while, si este número es menor que 50
		}
		
		//Segundo tipo de bucle
		
		
		System.out.println("-----------------------------------------------");
		
		int num2=0;
		
		do{ //Realiza las siguientes instrucciones...
			if(num2%2==0) {
			System.out.println(num2); //si el numero es par lo imprime en consola
			}
			num2++; //incrementa el valor de num2 en 1
		}while(num2<50); //....mientras el valor de num2 sea menor a 50
		
		
		System.out.println("-----------------------------------------------");

		
		//Tercer tipo de bucle
		for(int i=0;i<50;i++) { //Para un bucle con inicialización 0, mientras que sea menor que 50 y con un incremento de 1 por iteración:
			if(i%2==0) { //si el número es par:
				System.out.println(i); //imprime ese número en consola
			}
		}
		
		
		
		
	
	}

}
