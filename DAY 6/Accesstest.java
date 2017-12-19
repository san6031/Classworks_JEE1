package com.htc.day3;

 class Parentday3{
	
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

class Childday3 extends Parentday3{
	
	private void privateChildMethod() {
		System.out.println("Inside private of Parent in package Day3");
	}
	protected void ProtectedChildtMethod() {
		System.out.println("Inside Protected of Parent in package Day3");
	}
	void defaultPublicChildtMethod() {
		System.out.println("Inside default public of Parent in package Day3");
	}
	public void PublicChildMethod() {
		defaultPublicChildtMethod();
		//privateChildMethod();// call to private method.
		System.out.println("Inside public of Parent in package Day3");
	}	
	
	
}

public class Accesstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childday3 childobject=new Childday3();
		//childobject.privateChildMethod(); wont work 
		//childobject.PublicChildMethod(); // will work
		// childobject.defaultPublicChildtMethod(); will work 
		// childobject.PublicChildMethod(); will work
		// childobject.ProtectedChildtMethod();

	}

}
