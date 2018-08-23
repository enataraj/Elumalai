package tobesolved;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
	
	public static void main(String[] args) {
		try{
			System.out.println("Start adding element ...");
			
			ArrayBlockingQueue< String> strQueue = new ArrayBlockingQueue<>(3);
			strQueue.add("Elumalai");
			strQueue.add("Nishanth");
			strQueue.add("India");
			strQueue.add("Ca");  // Illegal State Exception after queue is full we are trying to insert
			
			
			System.out.println(strQueue);
			
		}catch(Exception e){
			System.out.println("Exception during queue Insertion :"+e);
			
		}
	}

}
