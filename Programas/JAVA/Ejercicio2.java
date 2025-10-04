
/*Crear un programa Java para calcular el área de un círculo, conociendo su radio. Codificarlo a partir del pseudocódigo de la tarea anterior.*/

/*Utilizaremos la clase Math para hacer uso de la constante PI para que no pueda ser alterado su valor y además utilizaremos Math.pow para calcular una 
 * potencia y Math.round para redondear un número */

package paquete1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio=8; /*Asignamos un valor a la variable radio*/
		
		double areaCirculo=(Math.PI)*(Math.pow(radio, 2)); /*Calculamos el área de un círculo (PI*radio^2) utilizando la clase Math.PI (es static, por eso 
		debemos nombrar la clase) y Math.pow, que calcula la potencia de un número pasándole 2 parámetros: la base (que es el radio) y el exponente (2)*/
		
		double areaCirculoredondeada=Math.round(areaCirculo); /*Con el método round de la clase Math redondeamos el número*/
		
		System.out.println(areaCirculoredondeada); /*Imprimimos en consola el área del círculo*/
		
		

	}

}
