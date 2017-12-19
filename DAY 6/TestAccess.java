package com.htc.day6;
import com.htc.day3.*;

class Subclass extends Parent{
	
	public void publicSubClassMethod() {
		//ProtectedParentMethod(); will work 
		// defaultPublicParentMethod(); will not work 
		System.out.println("Public method of sub class ");
	}
	
}

 

public class TestAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass scl=new Subclass();
		scl.publicSubClassMethod();
		//sc1.ProtectedParentMethod();
	}

}
