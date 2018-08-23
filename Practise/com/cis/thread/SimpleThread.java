package com.cis.thread;

public class SimpleThread implements Runnable{
	public SimpleThread(String name){
		this.threadName = name;
	}
public void run(){
	System.out.println("Hay I am : "+threadName);
}
}
