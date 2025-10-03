
/*Realizar un programa con una variable entera t la cual contiene un tiempo en segundos y queremos conocer este tiempo 
 * pero expresado en horas, minutos y segundos. */

package paquete1;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t=18372; /*Almacenamos el tiempo en la variable t*/
		
		int t_horas=t/3600; /*El tiempo en horas serán los segundos divididos entre 3600*/
		
		int t_minutos=(t%3600)/60; /*Los segundos que sobran al calcular las horas (módulo de 3600) se dividen entre 60 para obtener los números*/
		
		int t_segundos=t%60; /*almacenamos en la variable t_segundos los segundos que quedan tras quitar horas y minutos*/
		
		System.out.println(t + " segundos equivalen a " + t_horas + " horas, " + t_minutos + " minutos y " + t_segundos + " segundos");
		
		
		
	

	}

}
