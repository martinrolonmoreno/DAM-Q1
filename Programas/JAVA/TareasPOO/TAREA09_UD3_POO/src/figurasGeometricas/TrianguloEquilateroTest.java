package figurasGeometricas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class TrianguloEquilateroTest {

	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Inicio de las pruebas");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Inicio de test");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Test terminado");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Pruebas terminadas");
	}
	
	
	@Test
	void comprobarArea() {
		System.out.println("Test área del triángulo equilátero");
		TrianguloEquilatero tprueba = new TrianguloEquilatero(1,1);
		double resultadoA=tprueba.calcularArea();
		double esperado=0.5;
		assertEquals(esperado,resultadoA);
	}

	@Test
	void comprobarPerimetro() {
		System.out.println("Test perímetro del triángulo equilátero");
		TrianguloEquilatero t = new TrianguloEquilatero();
		double resultado= t.calcularPerimetro();
		double esperado=3;
		assertEquals(esperado,resultado);
		
		/*Lo mismo pero pasándole por parámetros base y altura (constructor creado, no es el predeterminado):
		 * 
		 * TrianguloEquilatero t = new TrianguloEquilatero(4,5);
		 * double resultado= t.calcularPerimetro();
		 * double esperado=12;
	     * assertEquals(esperado,resultado);
		 */
	}
	
	@Test
	void comprobarExcepcion0() {
		System.out.println("Test altura 0");
		TrianguloEquilatero t_cero = new TrianguloEquilatero(8,0);
		assertThrows(ArithmeticException.class, ()->{
			t_cero.calcularAreaTres();
		});
		
	}
	
	
	
	
}







