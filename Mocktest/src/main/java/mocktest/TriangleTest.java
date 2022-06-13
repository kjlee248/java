package mocktest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import mocktest.Triangle;

class TriangleTest {
	Triangleservice service = Mockito.mock(Triangleservice.class);
	
	 Trianglearea test = new Trianglearea(service);

	
	@Test
	public void testGetLength() {
		when(service.getTotalLength(3, 4, 5)).thenReturn(12);
		assertEquals(24, test.getArea(3,4,5));
		verify(service).getTotalLength(3,4,5);

	}
}
