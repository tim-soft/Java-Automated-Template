package HelloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTester {

	@Test
	public void testGetHello() {
		assertEquals("Hello",  HelloWorld.getHello());
	}
	
	@Test
	public void testGetComma() {
		assertEquals(", ",  HelloWorld.getComma());
	}
	
	@Test
	public void testGetWorld() {
		assertEquals("World",  HelloWorld.getWorld());
	}
	
	@Test
	public void testGetExclamation() {
		assertEquals("!",  HelloWorld.getExclamation());
	}

}
