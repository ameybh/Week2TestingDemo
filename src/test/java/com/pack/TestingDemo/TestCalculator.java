package com.pack.TestingDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator c;
		//Calculator c = new Calculator();
	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		assertEquals("Dude you messed up addition code man!",30, c.add(10, 20));
		System.out.println("Testing your Simple code for addtion");
	}
	@Test
	public void testSub() {
//		fail("Not yet implemented");
		assertEquals("Dude you messed up addition code man!",-10, c.subtract(10, 20));
		System.out.println("Testing your Simple code for subtrction");
	}
	@Before
	public void createObject() 
	{
		c = new Calculator();
		System.out.println("Object Created");
	}
	@After
	public void removeObject() 
	{
		c=null;
		System.out.println("Object Deleted");
	}
	@Test
	public void testbool() 
	{
		assertTrue(c.compare(76, 76));
		System.out.println("Truth is been spoken");
	}
}
