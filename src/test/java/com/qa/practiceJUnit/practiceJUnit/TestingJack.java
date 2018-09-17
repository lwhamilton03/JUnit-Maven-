package com.qa.practiceJUnit.practiceJUnit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.qa.practiceJUnit.practiceJUnit.BlackJack;

	@RunWith(Parameterized.class)

public class TestingJack {

	BlackJack testing = new BlackJack(); 
	
	private int input1; 
	private int input2;
	private int expected; 
	
	@Parameters
	public static List<Integer[]>inputs()
	{
		return Arrays.asList(new Integer [][] 
			{
			{0,23,24},  //bothover21
			{19,23,19}, //leftOver21
			{0,23,0}, //leftOver21right0 
			{21,21,12},	//rightIs21
			//lots more combinations to do
			});
 	}
	
	public TestingJack(int expected, int input1, int input2)
	{
		this.expected = expected; 
		this.input1 = input1; 
		this.input2 = input2; 
	}
	
	@Test 
	public void testOver21()
	{
		assertEquals("Expected: " + expected + " Inputs: " + input1 + " and " + input2, expected, testing.blackJack(input1, input2));
	}
	
//	@Test 
//	public void testLeft1Over1Under()
//	{
//		assertEquals(19, testing.blackJack(23, 19));
//	}
//	
//	@Test 
//	public void testRight1Over1Under()
//	{
//		assertEquals(17, testing.blackJack(17, 200));
//	}
//	
//	@Test 
//	public void testSame()
//	{
//		assertEquals(2, testing.blackJack(2, 2));
//	}
//	
//	@Test
//	public void testBelowZero()
//	{
//		assertEquals("It should be less than or equal to zero", 0, testing.blackJack(0, 3));
//	}

}
