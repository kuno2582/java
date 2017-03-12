import static org.junit.Assert.*;

/*

���� �޼ҵ�(assertxxxx)

assertEquals(x, y)		x�� y�� ������ �׽�Ʈ ���
assertFalse(b)			b�� false�̸� �׽�Ʈ ���
assertTrue(b)			b�� true�̸� �׽�Ʈ ���
assertTrue(message, condition) condition�� true�̸� messageǥ��
assertNull(o)			��ü o�� null�̸� �׽�Ʈ ���
assertNotNull(o)		��ü o�� null�� �ƴϸ� �׽�Ʈ ���
assertSame(ox, oy)		��ü ox, oy�� ���� ��ü�� �����ϰ� ������ ���
assertNotSame(ox, oy)	��ü ox, oy�� ���� ��ü�� �����ϰ� ���� ������ ���
AssertFail()			�׽�Ʈ�� �ٷ� ���� ó��



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
