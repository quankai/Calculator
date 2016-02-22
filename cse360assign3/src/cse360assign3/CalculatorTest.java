package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
public class CalculatorTest {
	private Calculator calu;
	@Before
	public void setUp() throws Exception{
		calu = new Calculator();
		
	}
	
	@After
	public void tearDown() throws Exception{
		calu = null;
	}
	
	@Test
	public void testCalculator() {
		calu = new Calculator();
		assertEquals(0, calu.getTotal());
		assertEquals("0", calu.getHistory());
		
	}
	
	@Test
	public void testGetTotal() {
		calu = new Calculator();
		assertEquals(0, calu.getTotal());
	}
	
	@Test
	public void testAdd(){
		calu = new Calculator();
		calu.add(1);
		assertEquals(1, calu.getTotal());
	}
	
	@Test
	public void testSubtract() {
		calu = new Calculator();
		calu.subtract(1);
		assertEquals(-1, calu.getTotal());
		
	}
	
	@Test
	public void testMultiply() {
		calu = new Calculator();
		calu.multiply(1);
		assertEquals(0, calu.getTotal());
		
	}
	
	@Test
	public void testDivide() {
		calu = new Calculator();
		calu.divide(1);
		assertEquals(0, calu.getTotal());
		
	}
	
	@Test
	public void testGetHistory() {
		calu = new Calculator();
		calu.add(4);
		calu.subtract(2);
		calu.multiply(2);
		calu.add(5);
		assertEquals(9, calu.getTotal());
		assertEquals("0 + 4 - 2 * 2 + 5", calu.getHistory());
	}

}