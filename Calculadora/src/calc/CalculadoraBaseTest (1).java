package calc;

import org.junit.*;
import org.junit.rules.TestName;

public class CalculadoraBaseTest {
	
	/**
	 * Regla de JUnit que guarda el nombre del test actual.*/
	public @Rule
	TestName name = new TestName();

	/**
	 * M�todo que ser� invocado antes de ejecutar los test.*/
	@BeforeClass
	public static void setUpClass(){
		System.out.println("Comienzan a ejecutarse los tests unitarios.");
	}
	
	/**
	 * M�todo que ser� invocado antes de cada test.*/
	@Before
	public void setUp(){
		System.out.print("***********************************************************************************************************\n");
		System.out.println("Ejecutando" + name.getMethodName());
	}
	
	/**
	 * M�todo que ser� invocados despu�s de cada test. */
	@After
	public void tearDown(){
		System.out.println("Terminado" + name.getMethodName());
		System.out.print("***********************************************************************************************************\n");
	}

	/**
	 * M�todo que ser� invocado despu�s de ejecutar los tests. */
	@AfterClass
	public static void tearDownClass(){
		System.out.println("Se terminan de ejecutar los tests unitarios.");
	}
}