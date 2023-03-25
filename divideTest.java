package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		assertEquals(3, test.divide(6, 2), 0);
		
	}
	
	@Test
	public void divideException() {
		JunitTesting test = new JunitTesting();
	    test.divide(3, 0);
	
	}

}
