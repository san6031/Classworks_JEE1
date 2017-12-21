package com.htc.day3;

public class Parent {
	
	private void privateParentMethod() {
		System.out.println("Inside private of Parent in package Day3");
	}
	protected void ProtectedParentMethod() {
		System.out.println("Inside Protected of Parent in package Day3");
	}
	void defaultPublicParentMethod() {
		System.out.println("Inside default public of Parent in package Day3");
	}
	public void PublicParentMethod() {
		System.out.println("Inside public of Parent in package Day3");
	}	

}
