package mocktest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class TestAdder {

	@Test
	void add() {
		Adder a = mock(Adder.class);
		    when(a.result(1, 2)).thenReturn(3);
		    assertEquals(3,a.result(1, 2));
		}

}
