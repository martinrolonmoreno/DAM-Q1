package ejercicio06;

import java.util.Scanner;

/*Calcular el sueldo que le corresponde al trabajador de una empresa que cobra 40.000 euros anuales (preguntar al usuario por su antigüedad). 
 * El programa debe realizar los cálculos en función de los siguientes criterios:
a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
d. Si lleva menos de 3 años se le aplica un aumento del 3%.*/

public class Sueldo {

	public static void main(String[] args) {
		
		int longevidad=0;
		double sueldo=40000;
		double aumento_sueldo=0.0F;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("Por favor, introduzca la cantida de años que lleva trabajando en la empresa. No puede ser un número negativo: ");
		longevidad=sc.nextInt();
		}while(longevidad<0);
		
		if(longevidad>=10) {
			aumento_sueldo=sueldo+(sueldo*0.1);
		}
		else if (longevidad>5 && longevidad<10) {
			aumento_sueldo=sueldo+(sueldo*0.07);
		}
		
		else if(longevidad>3 && longevidad<5) {
			aumento_sueldo=sueldo+(sueldo*0.05);
		}
		else {
			aumento_sueldo=sueldo+(sueldo*0.03);
		}
		
		System.out.println("Su sueldo será aumentado a " + aumento_sueldo + " euros");
		
		
		
		
		sc.close();
		System.out.println("Programa finalizado");
		

	}

}
