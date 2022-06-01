import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		// fail("Not yet implemented");
		int a = 1234;
		int b = 8765;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 9999;
		assertEquals(expected, actual);
	}

	@Test
	public final void testSubtract() {
		// fail("Not yet implemented");
		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public final void testMuliply() {
		// fail("Not yet implemented");
		int a = 10;
		int b = 100;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		int expected = 1000;
		assertEquals(expected, actual);
	}

	@Test
	public final void testDivide() {
		// fail("Not yet implemented");
		int a = 100;
		int b = 10;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 10;
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testDivideWith0Denominator() {
		// fail("Not yet implemented");
		int a = 100;
		int b = 10;
		int c = 0;

		Calculator cal = new Calculator();
		
		try {
			cal.divide(a, c);
			fail("Expceted an IllegalArgumentException to be thrown");		
		}catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage() );
		}catch(Throwable t) {
			assertEquals( "Expected an IllegalArgumentException to be thrown", t.getMessage() );
		}
}

}
