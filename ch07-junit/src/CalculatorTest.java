import static org.junit.Assert.*;

/*

단정 메소드(assertxxxx)

assertEquals(x, y)		x와 y가 같으면 테스트 통과
assertFalse(b)			b가 false이면 테스트 통과
assertTrue(b)			b가 true이면 테스트 통과
assertTrue(message, condition) condition이 true이면 message표시
assertNull(o)			객체 o가 null이면 테스트 통과
assertNotNull(o)		객체 o가 null이 아니면 테스트 통과
assertSame(ox, oy)		객체 ox, oy가 같은 객체를 참조하고 있으면 통과
assertNotSame(ox, oy)	객체 ox, oy가 같은 객체를 참조하고 있지 않으면 통과
AssertFail()			테스트를 바로 실패 처리



*/
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.sum(4, 5);
		
		assertTrue("The result should be 9", (result == 9));
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.subtract(5,4);
		
		assertTrue("The result should be 1", (result == 1));
	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.multiply(5,4);
		
		assertTrue("The result should be 20", (result == 20));
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.divide(15,3);
		
		assertTrue("The result should be 2", (result == 5));
	}

	@Test
	public void testCeil() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.ceil(3.6);
		
		assertTrue("The result should be 4", (result == 4));
	}

	@Test
	public void testFloor() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.floor(8.7);
		
		assertTrue("The result should be 8", (result == 8));
	}

	@Test
	public void testAbs() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.abs(10);
		
		assertTrue("The result should be 10", (result == 10));
	}

}
