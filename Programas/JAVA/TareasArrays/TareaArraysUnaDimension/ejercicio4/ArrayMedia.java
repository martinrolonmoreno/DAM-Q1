package ejercicio4;

/*Crea un array de números de 100 posiciones, que contenga los números del 1 al 100. Obtener la suma de todos ellos y su media.*/

public class ArrayMedia {

	public static void main(String[] args) {
		int [] array100 = new int[100];
		
		ArrayMedia am = new ArrayMedia();
		rellenarArray(array100);
		System.out.println("La suma de todos los valores del array es: " + sumaArray(array100));
		System.out.println("La media de valores del array es: " + mediaArray(array100));
		

	}
	
	
	public static void rellenarArray(int array100[]) {
		for (int i=0;i<array100.length;i++) {
			array100[i]=i+1;
		}
	}
	
	public static int sumaArray(int array100[]) {
		int suma_valores_array=0;
		for (int i=0;i<array100.length;i++) {
			suma_valores_array+=array100[i];
		}
		return suma_valores_array;
	}
	
	public static double mediaArray(int array100[]) {
		return (double) sumaArray(array100)/array100.length;
	}

}
