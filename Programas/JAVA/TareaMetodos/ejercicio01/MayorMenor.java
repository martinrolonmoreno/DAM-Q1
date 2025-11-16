package ejercicio01;

import java.util.Scanner;

/*Realizar un programa en Java que dados 3 números leídos por teclado, muestre el número mayor y el número menor. 
 * Definir dos métodos para ello: calcularMayor() y calcularMenor().*/

public class MayorMenor {

	public static void main(String[] args) {
		
		//DEFINIR MÉTODO calcularMayor: dados 3 números enteros, calcular cuál de ellos es mayor y devoverlo.
		//1.-Qué necesita el método (parámetros de entrada):
		//2.-Qué operaciones o instrucciones realiza el método: 
		//3.-Qué devuelve o retorna
		
		Scanner sc= new Scanner(System.in);
		
		int num1,num2,num3=0;
		
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3=sc.nextInt();
		
		
		System.out.println("El número mayor de los 3 es: " + calcularMayor(num1,num2,num3));
		System.out.println("El número menor de los 3 es: " + calcularMenor(num1,num2,num3));
		
		sc.close();
		System.out.println("Programa finalizado");
	}
	
	public static int calcularMayor(int num1, int num2, int num3) {
		int num_mayor=0;
		if(num1>num2 && num1>num3) {
			num_mayor=num1;
		}
		else if(num2>num1 && num2>num3) {
			num_mayor=num2;
		}
		else if(num3<num1 && num3>num2) {
			num_mayor=num3;
		}
		return num_mayor;
	}
	
	
	public static int calcularMenor(int num1, int num2, int num3) {
		int num_menor=0;
		if(num1<num2 && num1<num3) {
			num_menor=num1;
		}
		else if(num2<num1 && num2<num3) {
			num_menor=num2;
		}
		else if(num3<num1 && num3<num2) {
			num_menor=num3;
		}
		return num_menor;
		
	}

}




