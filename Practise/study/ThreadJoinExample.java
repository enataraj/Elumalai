package study;

public class ThreadJoinExample {
	
	public static void main(String[] args) {
		try{
		SimpleSleepThread t1 = new SimpleSleepThread("Thread 1");
		SimpleSleepThread t2 = new SimpleSleepThread("Thread 2");
		SimpleSleepThread t3 = new SimpleSleepThread("Thread 3");
		
		t1.start();		
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		System.out.println("Started all the thread");
		t1.join();
		System.out.println("After Joining ...");
		}catch(Exception e){
			System.out.println("I am in main exception");
		}
	}

}
