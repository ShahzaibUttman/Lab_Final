package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSquare()
	{
		Calculator calc = new Calculator();
		assertEquals(4,calc.square(2));	
	}
	

	@Test
	public void testFindMax()
	{
		Calculator calc = new Calculator();
		assertEquals(4,calc.findMax(2,3,4));	
	}
	
	@Test
	public void testCube()
	{
		Calculator calc = new Calculator();
		assertEquals(8,calc.cube(2));	
	}
	

}
