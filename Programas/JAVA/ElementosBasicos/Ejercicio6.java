
/*Realizar un programa que calcule y muestre por consola el perímetro y el área, de una circunferencia de radio 3 metros.*/

package paquete1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radioCircunferencia=3;
		
		double perimetroCircunferencia=2*(Math.PI*radioCircunferencia); /*Almacenamos en la variable permietroCircunferencia el resultado de la fórmula del perímetro = 2*(PI*radio)*/
		
		double areaCircunferencia=(Math.PI)*(Math.pow(radioCircunferencia, 2)); /*Almacenamos en la variable areaCircunferencia el resultado de la fórmula del área = PI*(radio^2)*/
		
		System.out.println("El perímetro de una circunferencia con radio de 3 metros es de " + 
		Math.round(perimetroCircunferencia) + " metros" + " y su área es de "+ Math.round(areaCircunferencia) + " metros"); /*Redondeamos los valores almacenados en las variables 
		para un resultado más legible*/
		

	}

}
