package com.htc.pakage3;

public class VariableArgumentDemo {

	static public void print(int ... elements) {
		System.out.println("Array size:" + elements.length);
		for(int element :  elements) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		print(10, 20, 30);
		print(10);
		print();
	}
}