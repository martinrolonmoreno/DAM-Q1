package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("INICIO: Número de coches creados: " + Coche.getNumeroCoches());
		
		Coche coche1 = new Coche ("Dacia", "Sandero", 2022);
		coche1.acelerar();
		
		Coche coche2 = new Coche ("BMW", "Serie 1", 2013);
		
		coche2.frenar();
		
		Coche coche3 = new Coche("Hyundai", "i20", 2025);
		
		coche3.frenar();
		
		System.out.println("Número de coches creados: " + Coche.getNumeroCoches());
		
		
		

	}

}
