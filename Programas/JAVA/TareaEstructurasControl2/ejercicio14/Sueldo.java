package ejercicio14;

import java.util.Scanner;

/*De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa Java que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b) Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/

public class Sueldo {

	public static void main(String[] args) {
		
		double sueldo=0;
		int tiempo_trabajado=0;
		double aumento_sueldo=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce tu sueldo: ");
		sueldo=sc.nextDouble();
			
		while(sueldo<=0) {
			System.out.println("Por favor, vuelve a introducir tu sueldo, recuerda que no puede ser un número negativo ni 0: ");
			sueldo=sc.nextDouble();
		}
	
		System.out.println("Por favor, introduce el tiempo trabajo en la empresa, en años: ");
		tiempo_trabajado=sc.nextInt();
		
		while(tiempo_trabajado<0 || tiempo_trabajado>100) {
			System.out.println("Por favor, vuelve a introducir el tiempo trabajo en la empresa, en años. Recuerda que no puede ser un número negativo ni mayor a 100: ");
			tiempo_trabajado=sc.nextInt();
		}
		
		if(sueldo<500 && tiempo_trabajado>=10) {
			aumento_sueldo=sueldo+(sueldo*0.2);
			System.out.println("Tu nuevo sueldo es de " + aumento_sueldo + " euros");
		}
		else if(sueldo<500 && tiempo_trabajado<10) {
			aumento_sueldo=sueldo+(sueldo*0.05);
			System.out.println("Tu nuevo sueldo es de " + aumento_sueldo + " euros");
		}
		else if(sueldo>500) {
			System.out.println("Tu sueldo se mantendrá en " + sueldo + " euros");
		}
		
		else {
			System.out.println("Ha ocurrido un error");
		}
		
		sc.close();
		System.out.println("Programa finalizado");
		
	}

}
