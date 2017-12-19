package com.htc.pakage3;

enum Season {

	WINTER,
	SUMMER,
	SPRING,
	AUTUMN
}



public class EnumDemo {

	public void checkSeason(Season season) {
		
		if(season == Season.SUMMER) 
			System.out.println("Summer Season - April , May , June ");
		else if(season == Season.WINTER)
			System.out.println("Wnter season  - Nov-Dec-Jan...");
	}
	
	public static void main(String[] args) {
		
		new EnumDemo().checkSeason(Season.WINTER);
		
		
		
		
	}
}
