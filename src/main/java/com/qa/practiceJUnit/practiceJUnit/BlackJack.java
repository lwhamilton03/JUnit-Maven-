package com.qa.practiceJUnit.practiceJUnit;

public class BlackJack {

	public int blackJack(int a, int b)
	{
		int result = 0; 
		
		if (a >= 22 && b >= 22)
		{
			result = 0;
		}
		
		if ((a > b && a < 22) || (a <= 21 && b > 21))
		{
			result = a;
		}
		
		if ((b > a && b < 22) || (b <= 21 && a > 21))
		{
			result = b;
		}
		
		if (a == b && a < 22)
		{
			result = a;
		}
		return result;
	}
}
