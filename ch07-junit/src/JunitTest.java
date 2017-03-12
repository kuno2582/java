import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	@Test
	public void testSum() {
		assertTrue(Calculator.sum(4,5)==9);
	}

}
