package ejercicio01;

public class Coche {
	
	//ZONA DE ATRIBUTOS
	
	private String marca;
	private String modelo;
	private int anio;
	private static int numeroCoches=0;
	
	//ZONA DE CONSTRUCTORES
	
	Coche(String marca, String modelo, int anio){
		this.marca=marca;
		this.modelo=modelo;
		this.anio=anio;
		Coche.numeroCoches ++;
	}
	
	Coche(){
		this.marca="desconocido";
		this.modelo="desconocido";
		this.anio=1990;
		Coche.numeroCoches++;
	}
	
	//ZONA DE SETTERS Y GETTERS
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getInfo() {
		return "Marca: " + this.marca + " Modelo: " + this.modelo + "Año: " + this.anio;					
	}
	
	public static int getNumeroCoches() {
		return Coche.numeroCoches;
	}

	public void acelerar() {
		System.out.println(this.getInfo() + "--> Está acelerando");
	}
	
	public void frenar() {
		System.out.println(this.getInfo() + "--> Está frenando");
	}
	
}
