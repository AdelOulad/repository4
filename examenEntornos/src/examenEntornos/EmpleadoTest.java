package examenEntornos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {
	

	@Test
	void test() {
		System.out.println("Comprobar nombre");
		Empleado e = new Empleado("Adel", 13, "Avenida 2", 100);
		assertTrue(e.getNombre() == "Adel");
	}
	
	@Test
	void test1() {
		System.out.println("Comproobar cedula");
		Empleado e = new Empleado("Adel", 13, "Avenida 2", 100);
		assertTrue(e.getCedula() == 13);
	}
	
	@Test
	void test2() {
		System.out.println("Comprobar direccion");
		Empleado e = new Empleado("Adel", 13, "Avenida 2", 100);
		assertTrue(e.getDireccion() == "Avenida 2");
	}
	
	@Test
	void test3() {
		System.out.println("Comprobar salario");
		Empleado e = new Empleado("Adel", 13, "Avenida 2", 100);
		assertTrue(e.getSalario() == 100);
	}
	
	
	
	
	

}
