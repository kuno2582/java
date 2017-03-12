import static org.junit.Assert.*;

import org.junit.Test;

public class AllTests2 {

	@Test
	public void testSum() {
		assertTrue(Calculator.sum(4,5)==9);
	}

	@Test
	public void testSubtract() {
		assertTrue(Calculator.subtract(5,4)==1);
	}

	@Test
	public void testMultiply() {
		assertTrue(Calculator.multiply(4,5)==20);
	}

	@Test
	public void testDivide() {
		assertTrue(Calculator.divide(4,4)==1);
	}


}
