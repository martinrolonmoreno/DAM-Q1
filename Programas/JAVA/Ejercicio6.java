
/*Realizar un programa que calcule y muestre por consola el perímetro y el área, de una circunferencia de radio 3 metros.*/

package paquete1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radioCircunferencia=3;
		
		double perimetroCircunferencia=2*(Math.PI*radioCircunferencia);
		
		double areaCircunferencia=(Math.PI)*(Math.pow(radioCircunferencia, 2));
		
		System.out.println("El perímetro de una circunferencia con radio de 3 metros es de " + 
		Math.round(perimetroCircunferencia) + " metros" + " y su área es de "+ Math.round(areaCircunferencia) + " metros");
		

	}

}
