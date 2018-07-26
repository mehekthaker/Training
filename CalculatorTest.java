package com.calculator.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.*;
public class CalculatorTest {

	@Test
	public void testAddTwoPositive() {
		Maths math = new Maths();
		int ans = math.add(2, 2);
		Assert.assertEquals(4, ans);	
	}
	
	
	@Test
	public void testAddTwoNegative() {
		Maths math = new Maths();
		int ans = math.add(-2, -2);
		Assert.assertEquals(-4, ans);	
	}
	
	
	@Test
	public void testAddTwoZeroes() {
		Maths math = new Maths();
		int ans = math.add(0, 0);
		Assert.assertEquals(0, ans);	
	}
	
	
	@Test
	public void testAddOneZeroesAndOnePositive() {
		Maths math = new Maths();
		int ans = math.add(0, 2);
		Assert.assertEquals(2, ans);	
	}
	
	
	@Test
	public void testAddOneZeroesAndOneNegative() {
		Maths math = new Maths();
		int ans = math.add(0, -2);
		Assert.assertEquals(-2, ans);	
	}
	
	
	@Test
	public void testAddOneNegativeAndOneGreaterPositive() {
		Maths math = new Maths();
		int ans = math.add(-2, 8);
		Assert.assertEquals(6, ans);	
	}

	
	@Test
	public void testSubtractTwoPositives() {
		Maths math = new Maths();
		int ans = math.subtract(2, 2);
		Assert.assertEquals(0, ans);		
	}
	
	
	@Test
	public void testSubtractTwoNegatives() {
		Maths math = new Maths();
		int ans = math.subtract(-2, -2);
		Assert.assertEquals(0, ans);		
	}
	
	
	@Test
	public void testSubtractFirstNegativeAndSecondPositive() {
		Maths math = new Maths();
		int ans = math.subtract(-2, 8);
		Assert.assertEquals(-10, ans);		
	}
	
	
	@Test
	public void testSubtractFirstPositiveAndSecondNegative() {
		Maths math = new Maths();
		int ans = math.subtract(8, -2);
		Assert.assertEquals(10, ans);		
	}
	
	
	@Test
	public void testSubtractFirstZeroAndSecondNegative() {
		Maths math = new Maths();
		int ans = math.subtract(0, -2);
		Assert.assertEquals(2, ans);		
	}
	
	
	@Test
	public void testSubtractFirstNegativeAndSecondZero() {
		Maths math = new Maths();
		int ans = math.subtract(-2, 0);
		Assert.assertEquals(-2, ans);		
	}
	
	@Test
	public void testSubtractFirstPositiveAndSecondZero() {
		Maths math = new Maths();
		int ans = math.subtract(2, 0);
		Assert.assertEquals(2, ans);		
	}
	
	
	@Test
	public void testSubtractFirstZeroAndSecondPositive() {
		Maths math = new Maths();
		int ans = math.subtract(0, 2);
		Assert.assertEquals(-2, ans);		
	}
	
	
	@Test
	public void testSubtractTwoZeroes() {
		Maths math = new Maths();
		int ans = math.subtract(0, 0);
		Assert.assertEquals(0, ans);		
	}
	
	
	@Test
	public void testMultiplyTwoZeroes() {
		Maths math = new Maths();
		int ans = math.multiply(0, 0);
		Assert.assertEquals(0, ans);		
	}
	
	
	@Test
	public void testMultiplyTwoPositives() {
		Maths math = new Maths();
		int ans = math.multiply(2, 2);
		Assert.assertEquals(4, ans);		
	}
	
	
	@Test
	public void testMultiplyTwoNegatives() {
		Maths math = new Maths();
		int ans = math.multiply(-2, -2);
		Assert.assertEquals(4, ans);		
	}
	
	
	@Test
	public void testMultiplyOneNegativeAndOnePositive() {
		Maths math = new Maths();
		int ans = math.multiply(4, -2);
		Assert.assertEquals(-8, ans);		
	}
	
	
	@Test
	public void testMultiplyOneNegativeAndOneZero() {
		Maths math = new Maths();
		int ans = math.multiply(-4, 0);
		Assert.assertEquals(0, ans);		
	}
	
	
	@Test
	public void testMultiplyOnePositiveAndOneZero() {
		Maths math = new Maths();
		int ans = math.multiply(4, 0);
		Assert.assertEquals(0, ans);		
	}
	
	
	@Test
	public void testTwoPositives() {
		Maths math = new Maths();
		int ans = math.divide(4, 4);
		Assert.assertEquals(1, ans);		
	}
	
	
	@Test
	public void testTwoNegatives() {
		Maths math = new Maths();
		int ans = math.divide(-4, -4);
		Assert.assertEquals(1, ans);		
	}
	
	
	@Test
	public void testOnePositiveAndOneNegative() {
		Maths math = new Maths();
		int ans = math.divide(4, -4);
		Assert.assertEquals(-1, ans);		
	}
	
	@Test
	public void testFirstZeroAndSecondNegative() {
		Maths math = new Maths();
		int ans = math.divide(0, -4);
		Assert.assertEquals(0, ans);		
	}
	
	@Test
	public void testFirstZeroAndSecondPositive() {
		Maths math = new Maths();
		int ans = math.divide(0, 4);
		Assert.assertEquals(0, ans);		
	}
	
//	@Rule
//	public ExpectedException thrown = ExpectedException.none();
	
	@Test(expected=ArithmeticException.class)
	public void testAnyNumberDivideByZero() {
		Maths math = new Maths();
		int ans = math.divide(4, 0);
		}
		

}
