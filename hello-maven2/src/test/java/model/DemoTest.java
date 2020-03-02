package model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DemoTest {

	@Test
	public void dovrebbeEssereVero() {
		Demo d = new Demo();
		assertTrue(d.getBoolean());
	}
	
}
