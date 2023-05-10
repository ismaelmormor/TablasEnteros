/**
 * 
 */
package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ismael
 *
 */
class TablaEnterosTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test finalizado");
	}

	/**
	 * Test method for {@link main.TablaEnteros#TablaEnteros(java.lang.Integer[])}.
	 */
	@Test
	void testTablaEnteros() {
		Integer[] numeros = {1,2,3};
		TablaEnteros tabla1 = new TablaEnteros(numeros);
	}

	/**
	 * Test method for {@link main.TablaEnteros#sumaTabla()}.
	 */
	@Test
	void testSumaTabla() {
		Integer[] numeros = {1,2,3};
		TablaEnteros tabla1 = new TablaEnteros(numeros);
		tabla1.sumaTabla();
	}

	

}
