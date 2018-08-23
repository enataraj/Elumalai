package com.cis.constrctorOverloading;

public class Parent {
	
	public Parent(){
		System.out.println("I am Default Parent");
	}
	
	public Parent(String overload){
		System.out.println("I am OverLoad Parent "+overload);
	}

}
