package com.cis.constrctorOverloading;

public class Child extends Parent{
	
	public Child (){
		System.out.println("I am Default Child ");
	}
	
	public Child(String overload){
		System.out.println("I am overloaded Child :"+overload);
	}

}
