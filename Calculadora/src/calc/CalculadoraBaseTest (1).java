package calc;

import org.junit.*;
import org.junit.rules.TestName;

public class CalculadoraBaseTest {
	
	/**
	 * Regla de JUnit que guarda el nombre del test actual.*/
	public @Rule
	TestName name = new TestName();

	/**
	 * Método que será invocado antes de ejecutar los test.*/
	@BeforeClass
	public static void setUpClass(){
		System.out.println("Comienzan a ejecutarse los tests unitarios.");
	}
	
	/**
	 * Método que será invocado antes de cada test.*/
	@Before
	public void setUp(){
		System.out.print("***********************************************************************************************************\n");
		System.out.println("Ejecutando" + name.getMethodName());
	}
	
	/**
	 * Método que será invocados después de cada test. */
	@After
	public void tearDown(){
		System.out.println("Terminado" + name.getMethodName());
		System.out.print("***********************************************************************************************************\n");
	}

	/**
	 * Método que será invocado después de ejecutar los tests. */
	@AfterClass
	public static void tearDownClass(){
		System.out.println("Se terminan de ejecutar los tests unitarios.");
	}
}