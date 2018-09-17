package com.qa.practiceJUnit.practiceJUnit;

public class MainRunner {
	
	public static void main(String[] args)
	{
		
		BlackJack black = new BlackJack();
		System.out.println("BLACK JACK INCOMING");
		System.out.println(black.blackJack(21, 23));
		System.out.println(black.blackJack(23, 24));
		System.out.println(black.blackJack(22, 18));
		System.out.println(black.blackJack(1, 17));
		System.out.println(black.blackJack(14, 1));
		System.out.println(black.blackJack(20, 20));
		
		UniqueSum sum = new UniqueSum();
		System.out.println("UNIQUE SUM INCOMING");
		System.out.println(sum.uniqueSum(1, 2, 3));
		System.out.println(sum.uniqueSum(1, 2, 2));
		System.out.println(sum.uniqueSum(1, 1, 3));
		System.out.println(sum.uniqueSum(3, 3, 3));
		
		TooHot hot = new TooHot(); 
		System.out.println("TOOHOT INCOMING");
		System.out.println(hot.tooHot(50, true));
		System.out.println(hot.tooHot(60, true));
		System.out.println(hot.tooHot(70,false));
		System.out.println(hot.tooHot(100, false));
		System.out.println(hot.tooHot(100, true));
	}
}
