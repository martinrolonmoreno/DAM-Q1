
/*Crear un programa Java para intercambiar los valores de dos datos dados. Codificarlo a partir del pseudocódigo de la tarea anterior.*/

package paquete1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=7; /*Declaramos la variable a y le asignamos el valor 7*/
		
		int x=a; /*Declaramos la variable x y le asignamos el valor de a*/
		
		int b=5; /*Declaramos la variable b y le asignamos el valor 5*/
		
		a=b; /*Al estar declarada ya la variable, simplemente asignamos los nuevos valores a las variables. Almacenamos el valor de b en a*/
		
		b=x; /*Almacenamos el valor de x en b*/
		
		System.out.println(a); /*Imprimimos el valor de las variables a y b*/
		System.out.println(b);

	}

}

