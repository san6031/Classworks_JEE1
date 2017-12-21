package com.htc.day6;
class Number{
	static int divide(int a,int b){
		return a/b;
	}
}
public class NumberService {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		  System.out.println("The value is "+Number.divide(10,0));
		}
		catch(ArithmeticException ae) {
		  ae.printStackTrace();
		}
		System.out.println("Further coming logics for business ");
	}
}
