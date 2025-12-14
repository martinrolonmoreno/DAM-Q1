package figurasGeometricas;

/*
 * Área:(base*altura)/2
 * Perímetro: 3*base
 * */

public class TrianguloEquilatero {
	//Atributos
	private int base;
	private int altura;
	public static int numeroObjetos=0;
	
	//Constructores
	TrianguloEquilatero(){
		this.base=this.altura=1;
		TrianguloEquilatero.numeroObjetos++;
	}
	TrianguloEquilatero(int base, int altura){
		this.base=base;
		this.altura=altura;
		TrianguloEquilatero.numeroObjetos++;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void imprimirObjeto() {
		System.out.println("El triángulo equilátero de base: " + this.base + " y altura " + this.altura);
	}
	
	public double calcularArea() {
		return (this.base*this.altura)/2.0;
	}
	
	public double calcularAreaDos() {
		double area=0;
		area=(this.base*2)/this.altura;
		return area;
		
	}
	
	public double calcularAreaTres() {
		if(this.altura!=0) {
			return (this.base*2)/this.altura;
		}
		else {
			System.err.println("No se puede dividir por cero");
			throw new ArithmeticException("No se puede dividir por cero");
		}
	}
	
	public int calcularPerimetro() {
		return 3*this.base;
	}
	
	
	
	
	

}
