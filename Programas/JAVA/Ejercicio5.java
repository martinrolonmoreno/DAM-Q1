
/*Dentro de una clase Joven tenemos las variables enteras edad, nivel_de_estudios e ingresos. 

Necesitamos almacenar en la variable booleana jasp el valor:

– Verdadero. Si la edad es menor o igual a 28 y el nivel_de_estudios es mayor que tres, o bien, la edad es menor de 30 y los ingresos superan 
los 28.000 (euros). 

– Falso. En caso contrario.

Realizar el programa que lo compruebe e imprima por pantalla el resultado, para los siguientes valores edad=45, nivel_de_estudios=3, ingresos=45.000*/

package paquete1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=45; /*Almacenamos en diferentes variables los datos que nos da el ejercicio*/
		int nivel_de_estudios=3;
		int ingresos=45000;
		boolean jasp;
		
		
		if(edad<=28 & nivel_de_estudios>3) { /*Primera condición: si la edad es menor o igual que 28 y además (operador &) el nivel de estudios es mayor a 3, 
		almacenar true en variable booleana jasp*/
			jasp=true;
		}
		
		else if(edad<30 & ingresos>28000){ /*Si la primera condición no se cumple, el programa omite la condición anterior y pasa a esta: si la edad es menor 
		a 30 y además los ingresos son mayores a 28000, almacenar true en la variable booleana jasp*/
			jasp=true;
		}
		
		else { /*En caso de que ninguna de las anteriores condiciones se cumpla, almacenaremos false en la variable booleana jasp*/
			jasp=false;
		}
		
		
		System.out.println(jasp); /*Imprimimos en consola el valor de jasp*/

	}

}


