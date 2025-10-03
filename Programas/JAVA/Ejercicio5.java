
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
		
		int edad=45;
		int nivel_de_estudios=3;
		int ingresos=45000;
		boolean jasp;
		
		
		if(edad<=28 & nivel_de_estudios>3) {
			jasp=true;
		}
		
		else if(edad<30 & ingresos>28000){
			
			jasp=true;
		}
		
		else {
			jasp=false;
		}
		
		
		System.out.println(jasp);

	}

}


