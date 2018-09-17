package com.qa.practiceJUnit.practiceJUnit;

public class UniqueSum {

	public int uniqueSum(int a, int b, int c)
	{
		int result = 0 ;
				
		if (a != b && a != c)
		{
			result = result + a;
		}
		
		if (b != a && b != c)
		{
			result = result + b;
		}
		
		if (c != a && c != b)
		{
			result = result + c; 
		}
		
		return result; 
	}
		
}
