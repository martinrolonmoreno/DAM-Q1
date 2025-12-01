package figurasGeometricas;

/*
 * Área: PI * radio al cuadrado
 * Librería Math --> Math.PI
 * */

public class Circulo {
	
	//Atributos
	private int radio=0;
	public static int numeroObjetos=0;
	
	//Constructores: sobrecargar
	Circulo(){
		this.radio=1;
		Circulo.numeroObjetos++;
	}
	
	Circulo(int radio){
		this.radio=radio;
		Circulo.numeroObjetos++;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	/*Crear un método para sacar por pantalla sus atributos, imprimirObjeto.*/
	
	public void imprimirObjeto() {
		System.out.println("El círculo tiene radio " + this.radio);
	}
	
	public double calcularArea() {
		return Math.PI*Math.pow(radio, radio);
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*this.radio;
	}

	
}
