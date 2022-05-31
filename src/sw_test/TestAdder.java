package sw_test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class TestAdder {

	@Test
	void add() {
		int result = Adder.add(3,4);
		int result2 = Adder.add(1,2);
		assertEquals(3,result2);
		assertEquals(7,result);
	}

}
