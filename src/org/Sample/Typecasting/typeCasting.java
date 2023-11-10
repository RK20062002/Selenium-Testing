package org.Sample.Typecasting;
/*
 * Typecasting is convert one to another data type
 * 
 * 	Types :-
 * 		Upcasting	---->  Converting a smaller data type into a larger data type [int(4 bytes) --> long(8 bytes)]
 * 		Downcasting ---->  Converting a larger data type into a smaller data type [long(8 bytes) --> int(4 bytes)]
 */
public class typeCasting {
	public static void main(String[] args) {
		
		//1. Up casting
		int a = 20;
		long l = a;
		
		System.out.println(l);
		
		//2. Down Casting
		// Syntax :-  	--->		newDatatype variable = (newDatatype) old_variable_Name;
		
		long b = 300;
		int c = (int)b;
		
		System.out.println(c);
	}

}
