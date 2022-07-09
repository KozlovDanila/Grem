package bux.tests;

import bux.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {

	@Test
	public void successGet() {
		List<String> values = new List<>();
		values.add("1");
		values.add("2");
		values.add("3");
		assertEquals("1", values.get(0));
		assertEquals("2", values.get(1));
		assertEquals("3", values.get(2));
		assertNull(values.get(3));
	}

}