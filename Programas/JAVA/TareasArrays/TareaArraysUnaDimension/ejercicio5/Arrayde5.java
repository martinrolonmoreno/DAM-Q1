package ejercicio5;

/*Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, guardar los valores de este array en otro array distinto pero 
 * con los valores invertidos, es decir, que el segundo array debera tener los valores {5,4,3,2,1}. Utilizar una única sentencia for para recorrer 
 * el primer array y rellenar el segundo.*/

public class Arrayde5 {

	public static void main(String[] args) {
		int [] arr = new int [5];
		int [] arr_invertido = new int [5];
		Arrayde5 a5 = new Arrayde5();
		
		a5.rellenarArray(arr, arr_invertido);
		a5.mostrarArray(arr, arr_invertido);
		
		
		
		System.out.println();

	}
	
	public void rellenarArray(int arr[], int arr_invertido[]) {

		for(int i=0,j=arr_invertido.length-1;i<arr.length;i++,j--) {
			arr[i]=i+1;
			arr_invertido[j]=arr[i];

		}
	}
	public void mostrarArray(int arr[], int arr_invertido[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		
		for(int i=0;i<arr_invertido.length;i++) {
			System.out.println(arr_invertido[i]);
		}
	}
				
			
	}
	
	
