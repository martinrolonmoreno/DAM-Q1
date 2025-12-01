package figurasGeometricas;

public class Rectangulo {
	
	/*
	 * Área:ancho*alto
	 * Perímetro: 2* (ancho+alto)
	 * */
	//Atributos
		private int ancho;
		private int alto;
		public static int numeroObjetos=0;
		
		//Constructores
		Rectangulo(){
			this.ancho=this.alto=1;
			Rectangulo.numeroObjetos++;
		}
		
		Rectangulo(int ancho,int alto){
			this.ancho=alto;
			this.alto=alto;
			Rectangulo.numeroObjetos++;
		}

		public int getAncho() {
			return ancho;
		}

		public void setAncho(int ancho) {
			this.ancho = ancho;
		}

		public int getAlto() {
			return alto;
		}

		public void setAlto(int alto) {
			this.alto = alto;
		}
		
		public void imprimirObjeto() {
			System.out.println("Rectángulo de ancho: " + this.ancho + " y alto " + this.alto);
		}
		
		public int caclularArea() {
			return this.ancho*this.alto;
		}
		
		public int calcularPerimetro() {
			return 2*(this.ancho+this.alto);
		}


}
