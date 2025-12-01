package ejercicio02;

public class Consumo {
	
	//ZONA DE ATRIBUTOS
	private float kms;//kms. Kilómetros recorridos por el coche.
	private float litros; //litros. Litros de combustible consumido.
	private float vmed; //vmed. Velocidad media.
	private float pgas; //pgas. Precio de la gasolina.
	
	//ZONA DE CONSTRUCTORES
	//Constructor por defecto --> Constructor vacio
	Consumo(){
		this.kms=200;
		this.litros=20;
		this.vmed=130;
		this.pgas=1.60F;
	}
	
	Consumo (float kms, float litros, float vmed, float pgas){
		this.kms=kms;
		this.litros=litros;
		this.vmed=vmed;
		this.pgas=pgas;
	}
	
	//ZONA DE MÉTODOS

	public float getKms() {
		return kms;
	}

	public void setKms(float kms) {
		this.kms = kms;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public float getVmed() {
		return vmed;
	}

	public void setVmed(float vmed) {
		this.vmed = vmed;
	}

	public float getPgas() {
		return pgas;
	}

	public void setPgas(float pgas) {
		this.pgas = pgas;
	}
	
	/* Indicará el tiempo empleado en realizar el viaje.*/
	
	public float tiempo() {
		return this.kms/this.vmed;
	}
	
	/*consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).*/
	public float consumoMedio() {
		return this.litros/this.kms*100;
	}
	
	/*consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).*/
	
	public float consumoEuros() {
		return this.pgas/this.kms*100;
	}
	
	public String getInfo() {
		return "Kms: " + kms + " Litros: " + litros + " Vmed: " + vmed + " Pgas: " + pgas;
	}
	
	
	
	
	

}