package com.qa.practiceJUnit.practiceJUnit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class TestingSum {

	UniqueSum sumTesting = new UniqueSum(); 
	
	private int expected;
	private int a;
	private int b; 
	private int c; 
	
	@Parameters
	public static List<Integer[]>inputs()
	{
		return Arrays.asList(new Integer [][]
			{
				{0,2,2,2}, //3 same 
				{5,1,2,3}  //3 different 
			}); 
	}
	
	public TestingSum(int expected, int a, int b, int c)
	{
		this.a = a; 
		this.b = b; 
		this.c = c; 
		this.expected = expected; 
	}
	
	@Test
	public void testSum()
	{
		assertEquals("Testing Unique Sum, Expected: " + expected + " Inputs: " + a + ", " + b + ", " + c, expected, sumTesting.uniqueSum(a, b, c));
	}
	
	}
