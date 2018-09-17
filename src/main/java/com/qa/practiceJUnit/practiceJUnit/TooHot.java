package com.qa.practiceJUnit.practiceJUnit;

public class TooHot {

	public boolean tooHot(int temperature, boolean isSummer)
	{
		if (temperature <= 90 && temperature >= 60 && !isSummer)
		{
			return true; 
		}
		
		if (temperature >= 60 && isSummer)
		{
			return true;
		}
		
		return false;
	}
}
