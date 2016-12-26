package egc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestResta {
	@Test
	public void testResta() {
		assertEquals(2, Resta.restar(2, 4));
	}

	@Test
	public void testRestaCero() {
		assertEquals(4, Resta.restar(0, 4));
		assertEquals(4, Resta.restar(4, 0));

	}
	
	@Test
	public void testRestaNegativo(){
		assertEquals(-4, Resta.restar(0, -4));
	}
	
}
