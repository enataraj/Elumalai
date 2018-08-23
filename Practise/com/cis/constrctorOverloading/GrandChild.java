package com.cis.constrctorOverloading;

public class GrandChild extends Child{
	public GrandChild(){
		System.out.println("I am Default Grand Child");
	}
	
	public GrandChild(String overLoad){
		System.out.println("I am Overloaded Grand Child "+overLoad);
	}

}
